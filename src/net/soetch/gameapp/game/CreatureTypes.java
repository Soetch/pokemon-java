package net.soetch.gameapp.game;

import net.soetch.gameapp.util.Exceptions;

import java.util.Objects;

public enum CreatureTypes {
    WATER,
    FIRE,
    PLANT,
    ELECTRIC,
    NORMAL;

    /**
     * Sets a Type to a Creature.
     */
    public static CreatureTypes setType(String type) {
        if (Objects.equals(type, "water")) {
            return CreatureTypes.WATER;
        } else if (Objects.equals(type, "fire")) {
            return CreatureTypes.FIRE;
        } else if (Objects.equals(type, "plant")) {
            return CreatureTypes.PLANT;
        } else if (Objects.equals(type, "electric")) {
            return CreatureTypes.ELECTRIC;
        } else if (Objects.equals(type, "normal")) {
            return CreatureTypes.NORMAL;
        } else {
            Exceptions.ThrowException(Exceptions.setTypeError);
        }
        return null;
    }
}


