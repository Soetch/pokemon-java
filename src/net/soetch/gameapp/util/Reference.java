package net.soetch.gameapp.util;

public class Reference {
    public static final String appID = "GameApp";
    public static final String appVersion = "1.0.O";
    public static final String appAuthor = "Marceau (Soetch) Malégeant";

    /**
     * Displays the app's name, version and author.
     */
    public static void displayAppInfos() {
        System.out.println(Reference.appAuthor + "'s app " + Reference.appID + " is running under the " + Reference.appVersion + " version.");
    }
}
