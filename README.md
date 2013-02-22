Hello everyone,

this plugin is an updated version from http://dev.bukkit.org/server-mods/quicksign/ .
The original author is not maintaining his plugin anymore, so i will do it from now on.

If you find any bugs feel free to open a ticket :)

**Please note: In the current version the support for Regios, LogBlock and Chestshop isn't implemented yet. **


== QuickSignReloaded ==
Edit signs with commands - Version 0.1

QuickSignReloaded let's you use simple commands (or a custom GUI with Spoutcraft) to edit, colorize and erase text on a selected sign. It also supports WorldGuard and Residence, so players can't edit signs in regions they aren't allowed to build in without a specific permission node.

=== Features ===

* Edit signs without having to remove them.
* Erase and edit specific lines of text.
* Add and delete colors.
* Copy and paste text.
* Edit multiple signs at once.
* Spout support, the fastest way to edit a sign.
* Color signs when placing them.
* Chat or execute commands with signs.
* Color signs with dyes.
* Create and select signs up to 100 block away.
* Undo and redo your last edit.
* Supports WorldGuard regions.
* Supports Residence.
* Supports Permissions.
* Supports LWC

=== Permission usage ===

Note: without any permissions, players can't select signs, unless no supported protection plugins are on.


* <<color 00f>>quicksign.use<</color>> : allows a player to use commands starting with /qs and select signs when no supported protection plugins are on.
* <<color 00f>>quicksign.reloadconfig<</color>> : allows a player to reload the config.
* <<color 00f>>quicksign.wgmember<</color>> : allows a player to select signs in regions where he's a member, according to WorldGuard (includes region in which he's an owner).
* <<color 00f>>quicksign.wgowner<</color>> : allows a player to select signs in regions where he's an owner, according to WorldGuard.
* <<color 00f>>quicksign.wgcanbuild<</color>> : allows a player to select signs in regions where he can build, according to WorldGuard.
* <<color 00f>>quicksign.rscanbuild<</color>> : allows a player to select signs in residences where he can build, according to Residence. Unclaimed land will return true.
* <<color 00f>>quicksign.rscanbuildfp<</color>> : allows a player to select signs in residences where he can build, according to Residence. Unclaimed land will return false (force protection).
* <<color 00f>>quicksign.freeuse<</color>> : allows a player to select any sign, no matter what the protection.
* <<color 00f>>quicksign.allowics<</color>> : allows a player to create ICs using the plugin ([MCXXXX] format, where X is a number between 0 and 9).
* <<color 00f>>quicksign.noreachlimit<</color>> : allows a player to select signs that are not within the normal Minecraft range, wither it be by left or right clicking (depends on config), or via the command.
* <<color 00f>>quicksign.fastsign<</color>> : allows a player to create signs using a single command, up to 100 blocks away.
* <<color 00f>>quicksign.fsnoinv<</color>> : if a player uses the fast sign command with this permission, no signs will be removed from his inventory.
* <<color 00f>>quicksign.colorcmd<</color>> : allows a player to use /qs color commands and color codes in other edit commands.
* <<color 00f>>quicksign.colordyes<</color>> : allows a player to color signs with dyes.
* <<color 00f>>quicksign.colorsignchange<</color>> : allows a player to color signs on placement (using the color codes).
* <<color 00f>>quicksign.usechatsigns<</color>> : allows a player to use chat signs.
* <<color 00f>>quicksign.usecommandsigns<</color>> : allows a player to use command signs. Permissions for the commands being executed on sign interaction are still handled by the plugin they're associated to.
* <<color 00f>>quicksign.useconcommandsigns<</color>> : allows a player to use console command signs (send commands as console). Warning! Those can be dangerous!
* <<color 00f>>quicksign.placechatsigns<</color>> : allows a player to place chat signs.
* <<color 00f>>quicksign.placecommandsigns<</color>> : allows a player to place command signs.
* <<color 00f>>quicksign.placeconcommandsigns<</color>> : allows a player to place console command signs.
* <<color 00f>>quicksign.usespout<</color>> : allows a player to use Spout mode.
* <<color 00f>>quicksign.colorspout<</color>> : allows a player to use colors when using Spout mode.
* <<color 00f>>quicksign.recanbuild<</color>> : allows a player to select signs where he can build, according to Regios. Unclaimed land will return true.
* <<color 00f>>quicksign.recanbuildfp<</color>> : allows a player to select signs where he can build, according to Regios. Unclaimed land will return false (force protection).
* <<color 00f>>quicksign.lwccanaccess<</color>> : allows a player to select signs he can access according to LWC. Unclaimed signs will return true.
* <<color 00f>>quicksign.lwccanaccessfp<</color>> : allows a player to select signs he can access according to LWC. Unclaimed signs will return false (force protection).
* <<color 00f>>quicksign.ignoreblacklist<</color>> : Ignore the black list. Players with this permission can put anything on signs (doesn't include ICs).
* <<color 00f>>quicksign.editchestshopsigns<</color>> : allows a player to select ChestShop signs, according to ChestShop.


=== Usage ===

First enable QuickSignReloaded (see commands bellow), find a sign you want to edit, and, if you have permission to select it (according to WorldGuard / Residence and Permissions) right click it (or left click, depends on the config), and the sign will be registered. You deselect it by right clicking it (or left click, depends on the config) again. You can select more in the same way, just don't select a ton. You may then edit it/them using the commands, and once done, you can disable QuickSign, which will clear your selection. Breaking a sign you have selected, or the block supporting it will clear it from your selection. If another player attempts to do so, the event will be cancelled instead. A sign that is already selected can't be reselected, even if another player tries to.


 
IMPORTANT NOTE: If you want to select a sign from afar with the selection method set to right_click, you need to hold an item in your hand. Sorry, but it's a Bukkit limitation.

=== Commands ===

* <<color 00f>>/qs rc<</color>> : Reload the config.
* <<color 00f>>/qs<</color>> : Enables and disables the plugin (toggle).
* <<color 00f>>/qs spout<</color>> : Enables and disables Spout mode (toggle).
* <<color 00f>>/qs (line number) (new text)<</color>> : Changes the text at the specified line.
* <<color 00f>>/qs all (new text)<</color>> : Changes the text on all line.
* <<color 00f>>/qs clear (line number)<</color>> : Clears the text at the specified line.
* <<color 00f>>/qs clear all<</color>> : Clears all the text.
* <<color 00f>>/qs clear<</color>> : Clears the current selection (not the text).
* <<color 00f>>/qs color (color name) (line number) (line index)<</color>> : Adds color to the line, starting at the specified index (index includes color data, 2 characters per color, index is between 1 and 15).
* <<color 00f>>/qs color (color name) all (line index)<</color>> : Adds color to all of the lines of text.
* <<color 00f>>/qs color clear (line number)<</color>> : Removes the colors at the specified line.
* <<color 00f>>/qs color clear all<</color>> : Removes all the color from the sign.
* <<color 00f>>/qs copy<</color>> : Copies all the text of the selected sign.
* <<color 00f>>/qs paste all<</color>> : Pastes all the text from the clipboard to the sign.
* <<color 00f>>/qs paste (line) all<</color>> : Pastes the line from the clipboard to all lines on the selected sign.
* <<color 00f>>/qs paste (line) (line)<</color>> : Pastes the line from the clipboard to the line on the selected sign.
* <<color 00f>>/qs cb clear<</color>> : clears the clipboard. Otherwise it is only cleared upon disabling the plugin (includes reloads and stops).
* <<color 00f>>/qs replace (line) (word to replace) (world to replace with)<</color>> : Replace the first word with the second one on the designated line.
* <<color 00f>>/qs append (line) (text)<</color>> : Adds the specified the text to the end of the text on the sign, with a space in between.
* <<color 00f>>/qs insert (line) (index) (text)<</color>> : Inserts the the text at the specified index (between 1 and 15).
* <<color 00f>>/qs undo<</color>> : undoes the last edit on the selected sign, if any. Deselecting a sign will clear it's history.
* <<color 00f>>/qs redo<</color>> : redoes the last undo for the selected sign.
* <<color 00f>>/qs s<</color>> : Select the sign in your line of sight, if any. Requires a special permission to use (quicksign.noreachlimit). Also checks for selection permissions.
* <<color 00f>>/qs fs (position) (txt)<</color>> : Places a sign from the player's inventory with the desired text where the player is looking. Only works if the block accepts signs. For positions, use "n" for North, "e" for "East", "s" for South, "w" for West (this will create a wall sign attached to the block, overwriting any block occupying the desired location), "u" for Up (creates a sign post facing the player, again overwriting the block), or "d" for default (creates a wall sign facing the player, if the location is free, or else it will create a sign post, overwriting any blocks above the selected one, and facing the player). For the text, separate lines with "&/". Colors are supported, use the codes bellow.

=== Colors and formats ===

For colors or formats, use the following codes when changing the text or placing a sign:

* Black: &0
* Dark blue: &1
* Dark green: &2
* Dark aqua: &3
* Dark red: &4
* Dark purple: &5
* Gold: &6
* Gray: &7
* Dark gray: &8
* Blue: &9
* Green: &a
* Aqua: &b
* Red: &c
* Light purple: &d
* Yellow: &e
* White: &f
* Magic: &k
* Bold: &l
* Strikethrough: &m
* Underline: &n
* Italic: &o
* Reset: &r

Note: These codes take two character spaces on the text. So, a line with one color can only take 13 characters instead of the usual 15. You can also use more than one code per line. If using the "/qs color" command, use the name of the codes, for two word code names, just bring them together in one word, and use only lower case. So "Light purple" becomes "lightpurple".

=== Using dyes on signs ===

To color a sign with a dye, just activate QS and use the opposite action from the one set in the config on the sign (right click -> left click, left click -> right click). Checks for building rights. This wont take in consideration the character limit, so you might loose some letters if a line is longer than 15. To clear a color, use an ink sack. After using a dye, it will be deleted from the inventory, but, due to some bug with the remove method, this wont work with more than 1 stack of dyes.

=== Using chat/command signs ===

Works somewhat like the dyes. Use the opposite action on a sign that has for first line [QSCHAT]. The lines bellow (2 to 4) will be joined (without adding spaces between them) and sent to the player's chat. If holding a dye while interacting, the sign won't get colored. For commands use [QSCMD] instead, you don't need to add any "/" for the command. Example: "time day". If you need to have the command ignore permissions, use [QSCCMD]. Commands will be ran as console. This can be very dangerous, be careful!

When using command signs, you can add the field {USER} to specify the username of the player using the sign. Same thing for chat signs, but with those, you also have the {USERF} field, which specifies the player's display name (name or nick including colors).

=== Spout usage ===

You will need Spoutcraft. Activate QuickSign, toggle the Spout support with /qs spout. Right click a sign (checks for build rights), and the editing screen will popup. Colors will be converted back to codes. You can now freely edit the lines, I even added a color code chart on the side! When done, click the "done" button. Only one problem, sometimes if you edit and then click "done" very quickly, the text won't be edited, probably due to packet delay.

=== Black List ===

This is the black_list.yml file which can be found under /plugins/QuickSign/black_list.yml

This config is case sensitive, but the expressions in the list aren't.

BlackList:
- '[qsccmd]'
- '[sell]'

Any text found in this list cannot be edited onto signs, and signs containing it can't be selected either. The black list can be overridden with the "quicksign.ignoreblacklist" permission. If you want to black list all ICs for FalseBook/CraftBook, it's done by default, just use the "quicksign.allowics" permission to allow them back.

=== Config ===

* useResidence: true 
* usePermissions: true 
* useSpout: true 
* useLWC: false 
* useWorldGuard: true # These seven properties allow you to override plugin support.
* maxReach: 100 # Maximum reach when selecting signs from afar. Max 100 blocks.
* noReachLimit: true # Activate sign selection from afar.
* selectionMethod: left_click # left_click or right_click only. Else defaults to right_click.
* colorOnPlacement: true 
* colorWithDyes: true 
* chatSigns: true # These three allow you do enable or disable the extra functions.

=== Permissions config ===

This config can be found in the QuickSign folder, it's called perms_config, and is generated on plugin startup. For most applications, you may not need to change it, but if you do not use any permission plugin, you will need to edit it.

PermissionsSystem: SuperPerms  #This config is case sensitive!!#
PlayerPerms:
- quicksign.use
"PermissionsSystem" is the permission checking system to use. If you use any up-to-date permissions plugin that support SuperPerms, leave the config as is.

If you do not use a permissions plugin, set the field to "PlayerAndOP". This will set all permissions at op only, unless you add them to the "PlayerPerms" field. This basically creates a simple group system: players, the default group with no permissions, except the ones added to the "PlayerPerms" field, and ops, who have all the permissions.

=== Bugs to fix ===

None known ATM.

=== Source === 

The source code can be found here: https://github.com/Gemil/QuickSignReloaded
Feel free to contribute!