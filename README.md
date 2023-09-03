# Phoenix Carpet Extension

Carpet extension for Phoenix SMP, a 1.19.2 technical Minecraft server.  
### Discord Server:  
[![Phoenix Discord](https://discordapp.com/api/guilds/802017282728525895/widget.png?style=banner3)](https://discord.gg/invite/wg2w7nvJEV)

# Rules (Configurable)  
[[NEW] porformantXpOrbs](https://github.com/TheMaster-Fox/Phoenix-Carpet-Extension/tree/1.19.2#performantxporbs)  
[[NEW] Improved Litematica Pasting](https://github.com/TheMaster-Fox/Phoenix-Carpet-Extension/tree/1.19.2#improved-litematica-pasting)

## antiSpamDisabled
Disable spamming checks on players (ex: chat message cooldown & creative item drop cooldown)

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`  
[^tis]

## beesFix
Fixes bees pathfinding to water, not leaving hives/nests, and getting stuck in the void

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`  
[^fix]

## betterVoidBehavior
Fixes allays getting stuck in the void and Loyalty tridents not returning when thrown into the void

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`  
[^fix]

## boatsTakeFallDamageFix
Fixes boats breaking and giving fall damage under certain circumstances

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`  
[^fix]

## bowAndArmorStacking
Allows mending-infinity bows and all protection armor pieces

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
[^mini]

## commandDimensions
Allows the player to teleport in between dimensions with `/dimtp`  
Unless specified, it will teleport you to 0 ~ 0

* Type: `boolean`
* Default value: `false`
* Allowed options: `true`, `false`
* Categories: `ESSENTIAL`, `COMMAND`, `CREATIVE`  
[^ess]

## commandHat
Allows you to equip items to your head slot using `/hat`

* Type: `boolean`
* Default value: `false`
* Allowed options: `true`, `false`
* Categories: `ESSENTIAL`, `COMMAND`, `CREATIVE`  
[^ess]

## commandLifeTime
Enables `/lifetime` command to track entity lifetime

- Type: `boolean`
- Default value: `true`
- Suggested options: `false`, `true`
- Categories: `TIS`, `COMMAND`
[^tis]

## commandSwitchDimensions
Allow players to teleport between the Nether and Overworld at equivalent coords

* Type: `String`
* Default value: `false`
* Allowed options: `true`, `false`
* Categories: `ESSENTIAL`, `COMMAND`, `CREATIVE`  
[^ess]

## commandRaid
Enables `/raid` command for raid listing and tracking

- Type: `boolean`
- Default value: `true`
- Suggested options: `false`, `true`, `ops`
- Categories: `TIS`, `COMMAND`  
[^tis]

## commandSeed
Permission level required to use /seed

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
[^mini]

## creativeNetherWaterPlacement
Allow creative players to use water buckets in the Nether

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`, `CREATIVE`  
[^tis]

## crystalChaining
Fixes End Crystals not exploding when damaged from explosions (End Crystal chaining)

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`  
[^fix]

## depthStriderSlowsRiptideFix
Fixes Depth Strider slowing down riptide, causing Riptide to be slower in water and messing up the launching

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `CARPET-FIXES`  
[^fix]

## dyeableShulkers
Shulkers can be dyed  
Color can be reset using a Water Bottle

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
[^mini]

## echoShardsEnableShriekers
Using an Echo Shard on a Sculk Shrieker allows it to summon Wardens

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
[^mini]

## foxSculkSensor [WIP]
Better Sculk Sensor outlined by [Purplers](https://www.youtube.com/watch?v=LpKZS_8IZsw) and tweaked further by TheMaster_Fox
- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `FEATURE`

## globalVillagerDiscounts
Shares the villager cure discounts amongst all players

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TOTOS`  
[^tot]

## instamineHardStones
Makes Deepslate and End Stone instaminable with Haste II, Efficiency V Netherite Pickaxe

- Type: `boolean`
- Default value: `off`
- Suggested options: `deepslate`, `endstone`, `both`, `off`
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
[^tis]

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

## noRepairCost

Removes additional cost for using an item in an anvil multiple times

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
[^mini]

## observerNoDetection
Stops all observer detection

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`, `CREATIVE`  
[^tis]

## performantXpOrbs
XP orbs of all sizes always combine when in close proximity and XP obsorption cooldown is removed

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`
Taken from [Clumps](https://github.com/jaredlll08/Clumps)

## reintroduceUpdateSuppression
Re-introduces update suppression, item shadowing, provides insta-wire fixes, and disables update suppression crashes  
`/wr` = all placement restrictions and updates of Wither Roses are removed

- Type: `boolean`
- Default value: `true`
- Suggested options: `false`, `true`, `wr`
- Categories: `CARPET-FIXES`, `TIS`, `SHADOW`, `PHOENIX`  
[^fix]  
[^tis]  
[^shadow]

## returnSpectators
Teleports players back to where they were when they changed to spectator

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TOTOS`, `SURVIVAL`  
[^tot]

## updateSuppressionSimulator

Activator / Powered Rails on Redstone Ore simulate update suppressors

Right before a powered Activator / Powered Rail on a Redstone Ore setting its powered state to false, throw the given JVM throwable

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TIS`, `CREATIVE`  
[^tis]

## vrikkaDuckSculkSensor [WIP]
Better Sculk Sensor outlined by [Purplers](https://www.youtube.com/watch?v=LpKZS_8IZsw) and tweaked further by [VrikkaDuck](https://github.com/VrikkaDev)

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `PHOENIX`, `FEATURE`

# Game Changes (NOT configurable)

## Correct Block-State Tags
Block-entities will correctly display their state in the F3 menu (or MiniHUD). [^ext]

## Accurate Block Placement
Allows for alternative block placement packets to be fulfilled by the server. Primarily for Tweakeroo's flexible and accurateBlockPlacement. [^ext]

## Better Box Stacking Behavior
When Carpet's `stackEmptyShulkerBoxes` is set to true, empty Shulker Boxes will stack in a player's inventory, but not in block entity inventories. [^ess]

## Data Syncing to Client
Sync entity and blockEntity data from server to client.[^plu]  
Requires [Phoenix Client](https://github.com/TheMaster-Fox/Phoenix-Client)

## Ignore Miscellaneous in Mobcap
The `Misc` mob group (set of mobs that do not spawn naturally) will always be ignored in local and global mobcap displays.  
Affects logger and `/spawn mobcaps` command [^tis]

## Improved Litematica Pasting
When pasting a schematic with [Litematica](https://www.curseforge.com/minecraft/mc-mods/litematica) on a server, block entities with modified NBT data will be accurately pasted.  
Implemented from [Litematica Server Paster](https://github.com/Fallen-Breath/litematica-server-paster) by [Fallen-Breath](https://github.com/Fallen-Breath)


[^tis]: Taken from [Carpet TIS Additon](https://github.com/TISUnion/Carpet-TIS-Addition)  
[^fix]: Taken from [Carpet-Fixes](https://github.com/fxmorin/carpet-fixes)  
[^mini]: Taken from [Minitweaks](https://github.com/manyrandomthings/minitweaks) by [manyrandomthings](https://github.com/manyrandomthings)  
[^ess]: Taken from [Essential Addons](https://github.com/Super-Santa/EssentialAddons)  
[^tot]: Taken from [Toto's Carpet Tweaks](https://github.com/totorewa/totos-carpet-tweaks)  
[^shadow]: Takken from [Carpet Shadow](https://github.com/mattymatty97/carpet-shadow)
[^plu]: Taken from [Plusls Carpet Addition](https://github.com/Nyan-Work/plusls-carpet-addition) which is [Nyan-Work](https://github.com/Nyan-Work)'s maintained [port](https://github.com/plusls/plusls-carpet-addition)  
[^ext]: Taken from [Carpet Extra](https://github.com/gnembon/carpet-extra)
