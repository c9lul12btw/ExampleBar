package io.github.c9lul12btw.cmds;

import io.github.c9lul12btw.guis.RankProgressGui;
import io.github.c9lul12btw.utils.GuiUtil;
import io.github.c9lul12btw.utils.LoggerUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static io.github.c9lul12btw.utils.GuiUtil.*;

public class ExampleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            LoggerUtil.logMessage("&cYou must be a player to run this command!");
            return true;
        }
        Player player = (Player) sender;
        if (args[0].equals("menu")) {
            Gui gui = new RankProgressGui(player, 1);
            gui.open();
        }
        return true;
    }

}
