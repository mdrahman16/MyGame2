package ass3.mygame2;


import java.util.ArrayList;


/**
 * The class is used to add or remove item at Player Inventory.Player will be informed which item player has or had
 *
 * @author Narender
 * @version 1.5.0
 */
public class Player
{
    // hold player item info
    private ArrayList<Item> playerItem;
    
    /**
     * initialize item list
     */
    public Player()
    {
        playerItem = new ArrayList();
    }
    
   /**
    * add a item in player inventory
    * @param item to be added  in player inventory
    */
    
    public void addItemInventory(Item item){
        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
      
    }
    /**
     * removed item from player inventory
     * @param item to be removed from player inventory
     */

    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    /**
 * Allocate a Item object with specific name
 * @param stringItem is the Item object specific name
 * @return Item object
 */
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    /**
     * return list of item 
     * @return list of item
     */
    public String printAllInventory(){

        String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    
}
