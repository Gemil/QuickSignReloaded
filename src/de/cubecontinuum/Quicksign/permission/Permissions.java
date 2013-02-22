package de.cubecontinuum.Quicksign.permission;

import org.bukkit.entity.Player;

/**
 *
 * @author Gemil
 */
public interface Permissions {
    
    public boolean hasPermission(Player player, String perm);
    
}