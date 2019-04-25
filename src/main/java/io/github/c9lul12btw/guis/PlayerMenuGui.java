package io.github.c9lul12btw.guis;

import io.github.c9lul12btw.utils.GuiUtil.*;
import org.bukkit.entity.Player;

public class PlayerMenuGui extends Gui{

    public PlayerMenuGui(Player p, int page) {
        super(p, "§4§lRank Progress", 54, page);
    }
}
