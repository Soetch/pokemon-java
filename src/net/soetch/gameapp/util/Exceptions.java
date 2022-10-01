package net.soetch.gameapp.util;

public class Exceptions {
    /**
     * Throws an exception from the Exception List.
     */
    public static void ThrowException(String exception) {
        System.out.println(exception);
    }
    /**
     * Throws a setType error.
     */
    public static final String setTypeError = "[EXCEPTION] setType : please enter a valid type (parameter).";
    /**
     * Throws a healArg error.
     */
    public static final String healArgError = "[EXCEPTION] Heal : please enter a valid HEALING item ID.";
    /**
     * Throws a cantHeal error.
     */
    public static final String cantHealError = "[EXCEPTION] addHP : can't add HP, the creature isn't alive.";
}
