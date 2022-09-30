package net.soetch.gameapp.game.items;

import net.soetch.gameapp.game.ItemTypes;
import net.soetch.gameapp.game.interfaces.Item;

public class SuperPotion implements Item {
    public static final String itemName = "Super Potion";
    public static final String itemID = "superpotion";
    public static final String itemType = String.valueOf(ItemTypes.setType("healing"));
    public static final String itemHealingAmount = "50";
    public static int inGameHealingAmount = 50;

    /**
     * Displays Item's Infos.
     */
    public void displayItemInfos() {
        System.out.println("The items's name is " + itemName + ", it's type is " + itemType + " and it heals " + itemHealingAmount + ". This item's ID is " + itemID + ".");
    }
}

