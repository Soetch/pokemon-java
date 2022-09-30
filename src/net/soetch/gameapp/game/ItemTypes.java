package net.soetch.gameapp.game;

import net.soetch.gameapp.util.Exceptions;

import java.util.Objects;

public enum ItemTypes {
    HEALING,
    BOOST,
    BALL;

    /**
     * Sets a type to an Item.
     */
    public static ItemTypes setType(String type) {
        if (Objects.equals(type, "healing")) {
            return ItemTypes.HEALING;
        } else if (Objects.equals(type, "boost")) {
            return ItemTypes.BOOST;
        } else if (Objects.equals(type, "ball")) {
            return ItemTypes.BALL;
        } else {
            Exceptions.ThrowException(Exceptions.setTypeError);
        }
        return null;
    }
}
