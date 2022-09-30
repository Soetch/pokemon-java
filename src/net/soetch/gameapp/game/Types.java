package net.soetch.gameapp.game;

import net.soetch.gameapp.util.Exceptions;

import java.util.Objects;

public enum Types {
    WATER,
    FIRE,
    PLANT,
    ELECTRIC,
    NORMAL;

    /**
     * Sets a Type to a creature.
     */
    // TODO Test the method and extract it to a class if not working.
    public static Types setType(String type) {
        if(Objects.equals(type, "water")) {
            return Types.WATER;
        } else if(Objects.equals(type, "fire")) {
            return Types.FIRE;
        } else if(Objects.equals(type, "plant")) {
            return Types.PLANT;
        } else if(Objects.equals(type, "electric")) {
            return Types.ELECTRIC;
        } else if(Objects.equals(type, "normal")) {
            return Types.NORMAL;
        } else {
            System.out.println(Exceptions.setTypeError);
        }
        return null;
    }
}


