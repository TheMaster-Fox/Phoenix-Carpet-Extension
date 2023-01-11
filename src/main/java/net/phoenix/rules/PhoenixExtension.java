package net.phoenix.rules;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import com.google.common.reflect.TypeToken;
import com.google.gson.GsonBuilder;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.phoenix.rules.Commands.BotSubscriptionCommand;
import net.phoenix.rules.Configs.Config;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

public class PhoenixExtension implements CarpetExtension {
    public static void noop() { }
    static
    {
        CarpetServer.manageExtension(new PhoenixExtension());
    }

    @Override
    public void onGameStarted() {
        CarpetServer.settingsManager.parseSettingsClass(CarpetSettings.class);

        Config.LoadConfigs();
       // BotSubscriptionHelper.init();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> BotSubscriptionCommand.register(dispatcher));
    }

    @Override
    public Map<String, String> canHasTranslations(String lang) {
        InputStream langFile = PhoenixExtension.class.getClassLoader().getResourceAsStream("assets/phoenixext/lang/%s.json".formatted(lang));
        if (langFile == null) {
            return Collections.emptyMap();
        }
        String jsonData;
        try {
            jsonData = IOUtils.toString(langFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            return Collections.emptyMap();
        }
        return new GsonBuilder().create().fromJson(jsonData, new TypeToken<Map<String, String>>() {}.getType());
    }
}
