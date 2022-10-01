import net.soetch.gameapp.game.creatures.Pikachu;
import net.soetch.gameapp.game.interfaces.Creature;
import net.soetch.gameapp.game.interfaces.Item;
import net.soetch.gameapp.game.items.Potion;
import net.soetch.gameapp.game.items.SuperPotion;
import net.soetch.gameapp.game.methods.CreatureRelatedMethods;
import net.soetch.gameapp.util.Reference;

public class Main {
    public static void main(String[] args) {
        Reference.displayAppInfos();

        Creature pikachu = new Pikachu();
        pikachu.displayCreatureInfos();

        Item potion = new Potion();
        potion.displayItemInfos();

        Item superpotion = new SuperPotion();
        superpotion.displayItemInfos();

        CreatureRelatedMethods.Heal(pikachu, "hyperpotion");
        pikachu.displayCreatureInfos();
    }
}