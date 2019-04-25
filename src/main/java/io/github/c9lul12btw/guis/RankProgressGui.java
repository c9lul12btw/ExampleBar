package io.github.c9lul12btw.guis;

import io.github.c9lul12btw.utils.GuiUtil.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class RankProgressGui extends Gui {

    public RankProgressGui(Player p, int page) {
        super(p, "§4§lRank Progress", 54, page);

        this.setItem(10, getCurrentRank());
        this.setItem(11, (calcStats() < 20 ? emptyCell() : fullCell()));
        this.setItem(12, (calcStats() < 40 ? emptyCell() : fullCell()));
        this.setItem(13, (calcStats() < 60 ? emptyCell() : fullCell()));
        this.setItem(14, (calcStats() < 80 ? emptyCell() : fullCell()));
        this.setItem(15, (calcStats() < 100 ? emptyCell() : fullCell()));
        this.setItem(16, getNextRank());

    }

    private int calcStats() {

        //get NextRankStoc subtract CurrentRankStoc = RankDifference
        //get current TotalScore
        //subtract TotalScore from CurrentRankStoc = currentProgress
        //CurrentProgress/RankDifference = progressPercent
        int progressPercent = 50;

        return progressPercent;
    }

    private GuiItem emptyCell() {

        return new GuiItem.Builder().name("").material(Material.STAINED_GLASS_PANE).data(0)
                .lore("").build();
    }

    private GuiItem fullCell() {

        return new GuiItem.Builder().name("").material(Material.STAINED_GLASS_PANE).data(5)
                .lore("").build();
    }

    private GuiItem getCurrentRank() {
        //get currentRank
        int currentRank = 0;
        switch(currentRank) {
            case 0:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(8)
                        .lore("","&7Member").build();
            case 1:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(5)
                        .lore("","&aNovice").build();
            case 2:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(9)
                        .lore("","&3Apprentice").build();
            case 3:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(6)
                        .lore("","&dDesigner").build();
            case 4:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(3)
                        .lore("","&aArchitect").build();
            case 5:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(10)
                        .lore("","&5Artisan").build();
            case 6:
                return new GuiItem.Builder().name("&7Current Build Rank:").material(Material.CONCRETE).data(4)
                        .lore("","&6Master").build();
            default:
                return new GuiItem.Builder().name("null").material(Material.CONCRETE).data(0)
                        .lore("","null").build();
        }
    }

    private GuiItem getNextRank() {
        //get nextRank
        int nextRank = 1;
        switch(nextRank) {
            case 1:
                return new GuiItem.Builder().name("&7Next Build Rank:").material(Material.CONCRETE).data(5)
                        .lore("","&aNovice","&7Progress: x/y"/*get the score values*/).build();
            case 2:
                return new GuiItem.Builder().name("&7Next Build Rank:").material(Material.CONCRETE).data(9)
                        .lore("","&3Apprentice","&7Progress: x/y"/*get the score values*/).build();
            case 3:
                return new GuiItem.Builder().name("&7Next Build Rank:").material(Material.CONCRETE).data(6)
                        .lore("","&dDesigner","&7Progress: x/y"/*get the score values*/).build();
            case 4:
                return new GuiItem.Builder().name("&7Next Build Rank:").material(Material.CONCRETE).data(3)
                        .lore("","&aArchitect","&7Progress: x/y"/*get the score values*/).build();
            case 5:
                return new GuiItem.Builder().name("&7Next Build Rank:").material(Material.CONCRETE).data(10)
                        .lore("","&5Artisan","&7Progress: x/y"/*get the score values*/).build();
            case 6:
                return new GuiItem.Builder().name("&7Next Build Rank:").material(Material.CONCRETE).data(4)
                        .lore("","&6Master","&7Progress: x/y"/*get the score values*/).build();
            default:
                return new GuiItem.Builder().name("null").material(Material.CONCRETE).data(0)
                        .lore("","null").build();
        }
    }
}
