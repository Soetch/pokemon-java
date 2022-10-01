package net.soetch.gameapp.game.interfaces;

public interface Creature {
    void displayCreatureInfos();
    void addHP(int amountToHeal);
    void lessHP(int amountToDelete);
}
