package net.soetch.gameapp.game.creatures;

import net.soetch.gameapp.game.CreatureTypes;
import net.soetch.gameapp.game.interfaces.Creature;

public class Pikachu implements Creature {
    public static final String creatureName = "Pikachu";
    public static final String creatureType = String.valueOf(CreatureTypes.setType("electric"));
    public static int creatureHP = 30;

    /**
     * Displays Creature's Infos.
     */
    public void displayCreatureInfos() {
        System.out.println("The creature's name is " + creatureName + " and it's type is " + creatureType + ". " + creatureName + "'s HP is " + creatureHP + ".");
    }

    @Override
    public void addHP(int amountToHeal) {
        creatureHP = creatureHP + amountToHeal;
    }
}
