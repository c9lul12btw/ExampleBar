package io.github.c9lul12btw.guis;

import io.github.c9lul12btw.utils.GuiUtil.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class MainMenuGui extends Gui{

    public MainMenuGui(Player p, int page) {
        super(p, "Venix Review Menu", 36, page);

        this.setItem(31, getExit());

    }

    private GuiItem getPlayerMenu() {
        Gui gui = new PlayerMenuGui(p,)
        return new GuiItem.Builder().material(Material.BARRIER).name("&cExit Menu").click(() ->

    }

    private GuiItem getStaffMenu() {


    }

    private GuiItem getExit() {
        return new GuiItem.Builder().material(Material.BARRIER).name("&cExit Menu").click(() -> this.getPlayer().closeInventory())
                .build();
    }

}
