# Phoenix Carpet Extension

### Carpet extension for Phoenix SMP, a 1.19.2 technical Minecraft server.

# Rules

## antiSpamDisabled
Disable spamming checks on players, including: chat message cooldown, creative item drop cooldown

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`

## beesFix
Fixes bees pathfinding to water, not leaving hives/nests, and getting stuck in the void

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`

## betterVoidBehavior
Fixes allays getting stuck in the void and Loyalty tridents not returning when thrown into the void

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`

## boatsTakeFallDamageFix
Fixes boats breaking and giving fall damage under certain circumstances

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`

## bowAndArmorStacking
Allows mending-infinity bows and all protection armor pieces

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`

## commandLifeTime
Enables `/lifetime` command to track entity lifetime

- Type: `boolean`
- Default value: `true`
- Suggested options: `false`, `true`
- Categories: `TIS`, `COMMAND`

## commandRaid
Enables `/raid` command for raid listing and tracking

- Type: `boolean`
- Default value: `true`
- Suggested options: `false`, `true`, `ops`
- Categories: `TIS`, `COMMAND`

## commandSeed
Permission level required to use /seed
Only available server-side

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`

## creativeNetherWaterPlacement
Allow creative players place water via water bucket in nether

Technically this rule applies to all ultrawarm dimensions

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`, `CREATIVE`

## crystalChaining
Fixes End Crystals not exploding when damaged from explosions (End Crystal chaining)

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`

## depthStriderSlowsRiptideFix
Fixes depth strider slowing down riptide, causing riptide to be slower in water and messing up the launching

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`

## dyeableShulkers
Shulkers can be dyed
Color can be reset to default using a water bottle

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`

## echoShardsEnableShriekers
Using an echo shard on a sculk shrieker allows it to summon wardens

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`

## foxSculkSensor [WIP]
Better Sculk Sensor outlined by [Purplers](https://www.youtube.com/watch?v=LpKZS_8IZsw) and tweaked further by TheMaster_Fox
- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `FEATURE`

## sharedVillagerDiscounts
Shares the villager cure discounts amongst all players

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TOTOS`

## instamineHardStones
Makes Deepslate and End Stone instaminable with Haste II, Efficiency V Netherite Pickaxe

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `SURVIVAL`

## lightUpdates
Disables light updates

If set to suppressed, no light update can be executed which simulates light suppressor

If set to off, no light update can be scheduled or executed

**\[WARNING\]** If set to suppressed or off, new chunks cannot be loaded. Then if the server tries to load chunk for player movement or whatever reason the server will be stuck forever

- Type: `boolean`
- Default value: `on`
- Suggested options: `on`, `suppressed`, `off`
- Categories: `TIS`, `CREATIVE`, `EXPERIMENTAL`

## movableBells [WIP]
Makes Bells movable

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `EXPIRIMENTAL`

## movableReinforcedDeeplsate
Makes Reinforced Deepslate movable

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `FEATURE`

## observerNoDetection
Stops all observer detection

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`, `CREATIVE`

## noRepairCost

Removes additional cost for using an item in an anvil multiple times

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`

## reintroduceUpdateSuppression
Re-introduces update suppression, item shadowing, provides insta-wire fixes, and disables update suppression crashes

wr - all placement restrictions and updates of wither roses are removed

- Type: `boolean`
- Default value: `true`
- Suggested options: `false`, `true`, `wr`
- Categories: `CARPET-FIXES`, `TIS`, `SHADOW`, `PHOENIX`

## returnSpectators
Teleports players back to where they were when they changed to spectator

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TOTOS`, `SURVIVAL`

## updateSuppressionSimulator

Activator / Powered rail on a redstone ore simulates an update suppressor

Right before a powered activator / powered rail on a redstone ore setting its powered state to false, throw the given JVM throwable

- Type: `String`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`, `CREATIVE`

## vrikkaDuckSculkSensor [WIP]
Better Sculk Sensor outlined by [Purplers](https://www.youtube.com/watch?v=LpKZS_8IZsw) and tweaked further by VrikkaDuck
- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `FEATURE`

[![Discord Link](https://cdn.discordapp.com/attachments/968939514800255076/1059471929536434276/Discord.png)](https://discord.com/invite/wg2w7nvJEV)