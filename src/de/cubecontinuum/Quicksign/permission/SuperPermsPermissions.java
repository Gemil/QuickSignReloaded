package de.cubecontinuum.Quicksign.permission;

import org.bukkit.entity.Player;

/**
 *
 * @author Gemil
 */
public class SuperPermsPermissions implements Permissions {

    @Override
    public boolean hasPermission(Player player, String perm) {
        
        return player.hasPermission(perm);
        
    }   
}
