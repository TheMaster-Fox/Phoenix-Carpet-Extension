package net.phoenix.rules.Helpers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.phoenix.rules.Utils.DateUtils;
import net.phoenix.rules.Utils.FileUtils;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BotSubscriptionHelper {

    private static final Map<UUID, Integer> settingsMap = new HashMap<>();
    private static final Map<UUID, Date> timeMap = new HashMap<>();

    public static void init(){
        JsonElement element = FileUtils.ReadJSONFile(getBotSubFile());
        JsonElement timeElement = FileUtils.ReadJSONFile(getBotSubTimeFile());

        if (element != null && element.isJsonObject())
        {
            JsonObject root = element.getAsJsonObject();
            JsonObject timeRoot = timeElement.getAsJsonObject();

            for(Map.Entry<String, JsonElement> entry : root.entrySet()){
                UUID uuid = UUID.fromString(entry.getKey());
                if(settingsMap.containsKey(uuid)){
                    continue;
                }

                timeMap.put(uuid, DateUtils.FromLong(timeRoot.get(entry.getKey()).getAsLong()));
                settingsMap.put(uuid, entry.getValue().getAsInt());
            }
        }
    }

    public static void saveToFile(){

        createDataFiles();

        JsonObject root = new JsonObject();
        JsonObject timeRoot = new JsonObject();

        for(Map.Entry<UUID, Integer> entry : settingsMap.entrySet()){
            root.addProperty(entry.getKey().toString(), entry.getValue());
            timeRoot.addProperty(entry.getKey().toString(), DateUtils.DateToLong(timeMap.get(entry.getKey())));
        }

        FileUtils.SaveJSONFile(getBotSubFile(), root);
        FileUtils.SaveJSONFile(getBotSubTimeFile(), timeRoot);
    }
    private static void createDataFiles(){
        File dataFile = getBotSubFile().getParentFile();
        if(!dataFile.exists()){dataFile.mkdirs();}
        if(!getBotSubFile().exists()){
            FileUtils.CreateFile(dataFile, "/data.json");
        }
        File timeFile = getBotSubTimeFile().getParentFile();
        if(!timeFile.exists()){timeFile.mkdirs();}
        if(!getBotSubTimeFile().exists()){
            FileUtils.CreateFile(timeFile, "/time.json");
        }
    }

    public static void setValue(UUID uuid, int value){
        if(value == 0 || !timeMap.containsKey(uuid)){
            if(timeMap.containsKey(uuid)){
                timeMap.replace(uuid, DateUtils.GetCurrent());
            }else{
                timeMap.put(uuid, DateUtils.GetCurrent());
            }
        }
        if(settingsMap.containsKey(uuid)){
            settingsMap.replace(uuid, value);
            saveToFile();
            return;
        }
        settingsMap.put(uuid, value);
        saveToFile();
    }

    public static int getSubDays(UUID uuid){
        if(!settingsMap.containsKey(uuid)){
            return 0;
        }
        return settingsMap.get(uuid);
    }
    private static File getBotSubFile(){
        return new File(FileUtils.getPhoenixDirectory(), "sub/data.json");
    }
    private static File getBotSubTimeFile(){
        return new File(FileUtils.getPhoenixDirectory(), "sub/time.json");
    }

    public static boolean IsSubscribing(UUID uuid){

        Date date = timeMap.get(uuid);
        int subdays = getSubDays(uuid);

        Date endDate = DateUtils.AddDays(date, subdays);

        return DateUtils.DaysTo(date, endDate) > 0;
    }
    public static Date getDate(UUID uuid){
        return timeMap.get(uuid);
    }
}
