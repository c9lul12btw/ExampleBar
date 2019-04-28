package io.github.c9lul12btw.guis;

import io.github.c9lul12btw.utils.GuiUtil.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class MainMenuGui extends Gui{

    public MainMenuGui(Player p, int page) {
        super(p, "Venix Review Menu", 36, page);

        this.setItem(31, getExit());

    }

    private GuiItem getPlayerMenu(Player p) {
        Gui gui = new PlayerMenuGui(p, 1);
        return new GuiItem.Builder().material(Material.BARRIER).name("&cExit Menu").click(() -> this.getPlayer().closeInventory())
                .build();

    }

    private GuiItem getStaffMenu(Player p) {
        Gui gui = new StaffMenuGui(p, 1);
        return new GuiItem.Builder().material(Material.BARRIER).name("&cExit Menu").click(() -> this.getPlayer().closeInventory())
                .build();
    }

    private GuiItem getExit() {
        return new GuiItem.Builder().material(Material.BARRIER).name("&cExit Menu").click(() -> this.getPlayer().closeInventory())
                .build();
    }

}
