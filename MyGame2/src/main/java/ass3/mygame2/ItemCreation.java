package ass3.mygame2;

import java.util.ArrayList;

/**
 * This class is used to create all the items in the game.All the items are
 * added in Array list.
 *
 * @author Narender
 * @version 1.5.0
 */
public class ItemCreation {

    //hold item list
    private ArrayList<Item> allItemsInGame;
/**
 * initialize array list and call createMethod()
 * @see #createItems
 */
    public ItemCreation() {
        allItemsInGame = new ArrayList();
        createItems();
    }
    /**
     * this method is used to create Item class object and added to the array list
     * 
     */

    public void createItems() {

        Item  excaliburSword, key, frontGateKey, magicalKnife;

        excaliburSword = new Item("excaliburSword", "The legendary Excalibur", 100);
        key = new Item("key", "It has a shape of a heart", 100);
        frontGateKey = new Item("frontGateKey", "To open the front gate door", 100);
        magicalKnife = new Item("MagicalKnife", "Knife with magical powers", 100);

        allItemsInGame.add(excaliburSword);
        allItemsInGame.add(key);
        allItemsInGame.add(frontGateKey);
        allItemsInGame.add(magicalKnife);
    }
/**
 * Allocate a Item object with specific name
 * @param stringItem is the Item object specific name
 * @return Item object
 */
    public Item getItem(String stringItem) {
        Item itemToReturn = null;
        for (Item item : allItemsInGame) {
            if (item.getName().contains(stringItem)) {
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }

}
