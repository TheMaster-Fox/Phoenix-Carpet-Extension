# Phoenix Carpet Extension

Carpet Extension for the 1.20.1 Phoenix technical Minecraft server.  
This is primarily a compilation of the few rules we use from various other extensions.
### Discord Server:  
[![Phoenix Discord](https://discordapp.com/api/guilds/802017282728525895/widget.png?style=banner3)](https://discord.gg/invite/wg2w7nvJEV)

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

## betterAnvils

Removes Anvil XP cap and increases character limit to 100

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
  [^mini]

## commandDimensions
Allows the player to teleport in between dimensions with `/dimtp`  
Travel to and from The End will teleport you to 0 ~ 0, OW to NE travel teleports to equivalent coords unless specified. 

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

## dyeableShulkers
Shulkers can be dyed  
Color can be reset using a Water Bottle

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `MINITWEAKS`  
[^mini]

## globalVillagerDiscounts
Shares the villager cure discounts amongst all players and applies discounts even if disconnected

- Type: `boolean`
- Default value: `false`
- Suggested options: `false`, `true`
- Categories: `TOTOS`  
[^tot]

## instamineHardStones
Makes Deepslate and/or End Stone instaminable with Haste II, Efficiency V Netherite Pickaxe

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
[^tis]

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

# Game Changes (NOT configurable)

## Correct Block-State Tags
Block-entities will accurately display their state in the F3 menu (or MiniHUD). [^ext]

## Accurate Block Placement
Allows for alternative block placement packets to be fulfilled by the server. For Tweakeroo's flexible and accurateBlockPlacement. [^ext]

## Better Box Stacking Behavior
When Carpet's `stackEmptyShulkerBoxes` is set to true, empty Shulker Boxes will stack in a player's inventory, but not in block entity inventories. [^ess]

## Data Syncing to Client
Sync entity and blockEntity NBT from server to client.[^plu]  
Requires [Phoenix Client](https://github.com/TheMaster-Fox/Phoenix-Client)

## Ignore Miscellaneous in Mobcap
The `Misc` mob group (set of mobs that do not spawn naturally) will always be ignored in local and global mobcap displays.  
Affects logger and `/spawn mobcaps` command [^tis]

## Improved Entities through Portals Performance
Reverts change made for 1.19.3 that degraded performance of entities going through Nether Portals

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
