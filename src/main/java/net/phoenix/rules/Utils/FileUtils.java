package net.phoenix.rules.Utils;

import com.google.gson.*;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WorldSavePath;
import net.phoenix.rules.Variables;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static MinecraftServer minecraftServer;
    public static void init(MinecraftServer server){
        minecraftServer = server;
    }
    public static JsonElement ReadJSONFile(File file){

        if (file != null && file.exists() && file.isFile() && file.canRead())
        {
            String fileName = file.getAbsolutePath();

            try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))
            {
                return JsonParser.parseReader(reader);
            }
            catch (Exception e)
            {
                Variables.LOGGER.error("Failed to parse the JSON file '{}'", fileName, e);
            }
        }

        return null;
    }
    public static void SaveJSONFile(File file, JsonObject root){
        if ((file.exists()) || file.mkdirs())
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

                writer.write(GSON.toJson(root));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void CreateFile(File path, String filename){
        if ((path.exists() && path.isDirectory()) || path.mkdirs())
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + filename))) {

                writer.write("");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static File getWorldDirectory(){
        if(minecraftServer == null){
            return null;
        }
        return minecraftServer.getSavePath(WorldSavePath.ROOT).toFile();
    }
    public static File getDataDirectory()
    {
        if(minecraftServer == null){
            return null;
        }

        return new File(minecraftServer.getSavePath(WorldSavePath.ROOT).toFile(), "data");
    }
    public static File getPhoenixDirectory(){
        if(getDataDirectory() == null){
            return null;
        }
        return new File(getDataDirectory(), "phoenix");
    }
    public static File getConfigDirectory(){
        return new File(FabricLoader.getInstance().getConfigDir().toFile(), "/");
    }
}
