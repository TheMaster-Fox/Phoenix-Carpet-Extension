package net.phoenix.rules;

import carpet.api.settings.Rule;

import static carpet.api.settings.RuleCategory.COMMAND;
import static carpet.api.settings.RuleCategory.FEATURE;

public class CarpetSettings {
    @Rule(categories = {FEATURE, "extras"})
    public static boolean instaMineDeepslate = false;
    @Rule(categories = {FEATURE, "extras"})
    public static boolean instaMineEndstone = false;
    @Rule(categories = {COMMAND, "extras"})
    public static boolean botSpawnSubscription = false;

}
