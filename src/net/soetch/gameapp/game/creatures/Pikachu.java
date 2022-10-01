package net.soetch.gameapp.game.creatures;

import net.soetch.gameapp.game.CreatureTypes;
import net.soetch.gameapp.game.interfaces.Creature;
import net.soetch.gameapp.util.Exceptions;

public class Pikachu implements Creature {
    public static final String creatureName = "Pikachu";
    public static final String creatureType = String.valueOf(CreatureTypes.setType("electric"));
    public static final int creatureBaseHP = 30;
    public static int creatureHP = 30;
    public static boolean isAlive = true;

    /**
     * Displays Creature's Infos.
     */
    public void displayCreatureInfos() {
        System.out.println("The creature's name is " + creatureName + " and it's type is " + creatureType + ". " + creatureName + "'s HP is " + creatureHP + ".");
    }

    @Override
    public void addHP(int amountToHeal) {
        // Adds the healing to the creature's HP
        if(isAlive) {
            creatureHP = creatureHP + amountToHeal;
            // So the healing isn't overtaking the base HP cap. (no overhealing)
            if (creatureHP > creatureBaseHP) {
                creatureHP = creatureBaseHP;
            }
        } else {
            Exceptions.ThrowException(Exceptions.cantHealError);
        }
    }

    @Override
    public void lessHP(int amountToDelete) {
        creatureHP = creatureBaseHP - amountToDelete;
        if (creatureHP <= 0) {
            isAlive = false;
        }
    }
}
