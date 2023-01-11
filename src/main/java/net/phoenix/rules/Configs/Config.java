package net.phoenix.rules.Configs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.phoenix.rules.Utils.FileUtils;
import net.phoenix.rules.Variables;

import java.io.File;
import java.util.Objects;

public class Config {
    public static int SubscribeDays = 1;
    public static int DiamondCost = 1;

    private static final String filename = "phoenix-carpet-extension.json";

    public static void LoadConfigs(){

        File file = new File(FileUtils.getConfigDirectory() + filename);

        if(!file.exists()){
            FileUtils.CreateFile(Objects.requireNonNull(FileUtils.getConfigDirectory()), filename);
        }

        File configFile = getConfigFile();

        JsonElement element = FileUtils.ReadJSONFile(configFile);

        if(element == null || !element.isJsonObject()){
            Variables.LOGGER.error("Couldn't read config file.");
            return;
        }

        JsonObject root = element.getAsJsonObject();

        SubscribeDays = root.get("subscribe-days").getAsInt();
        DiamondCost = root.get("diamond-cost").getAsInt();
    }
    private static JsonObject getConfigJson(){
        JsonObject root = new JsonObject();

        root.addProperty("subscribe-days", SubscribeDays);
        root.addProperty("diamond-cost", DiamondCost);

        return root;
    }
    private static File getConfigFile(){
        File file = new File(FileUtils.getConfigDirectory(), filename);
        if(file.exists() && file.length() > 1){
            return file;
        }
        FileUtils.SaveJSONFile(file, getConfigJson());
        return file;
    }
}
