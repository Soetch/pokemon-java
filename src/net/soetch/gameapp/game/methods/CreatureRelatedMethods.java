package net.soetch.gameapp.game.methods;

import net.soetch.gameapp.game.interfaces.Creature;
import net.soetch.gameapp.game.items.Potion;
import net.soetch.gameapp.game.items.SuperPotion;

import java.util.Objects;

public class CreatureRelatedMethods {
    public static void Heal(Creature creature, String item) {
        if (Objects.equals(item, Potion.itemID)) {
            creature.addHP(Potion.inGameHealingAmount);
        } else if (Objects.equals(item, SuperPotion.itemID)) {
            creature.addHP(SuperPotion.inGameHealingAmount);
        }
    }
}
