package de.cubecontinuum.Quicksign.command;

import java.util.ArrayList;
import java.util.List;
import de.cubecontinuum.Quicksign.QuickSign;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

/**
 *
 * @author Gemil
 */
public abstract class QSCommand {

    protected final QuickSign plugin;
    protected final List<Sign> signs;

    public QSCommand(QuickSign plugin, List<Sign> signs) {

        this.plugin = plugin;
        this.signs = new ArrayList<Sign>(signs);

    }

    public abstract boolean run(Player player);

    public abstract void undo(Player player);

    public abstract void redo(Player player);

    protected void logChange(Player player, Sign sign) {

      /*  if (plugin.getConsumer() != null) {

            plugin.getConsumer().queueSignPlace(player.getName(), sign);

        }*/
    }
}
