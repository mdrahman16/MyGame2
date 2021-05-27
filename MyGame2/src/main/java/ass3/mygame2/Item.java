package ass3.mygame2;

/**
 * This class hold all the items in the game that use can be used to destroy the
 * enemy or to gain strength.
 *
 * @author Narender
 * @version 1.5.0
 *
 */

public class Item {

    private String description;
    private String name;
    private int destructivePower;
    private double healingPower;

    /**
     * Create an Item object.
     *
     * @param name is the name of the Item.
     * @param description is the description about the item. how that item can
     * be used in the game
     * @param destructivePower is the power that can be used to destroy the
     * enemy
     */
    public Item(String name, String description, int destructivePower) {
        this.name = name;
        this.description = description;
        this.destructivePower = destructivePower;
    }

    /**
     * Create an Item object.
     *
     * @param name is the name of the Item.
     * @param description is the description about the item. how that item can
     * be used in the game
     * @param healingPower is the power that can be used to heal player
     */
    public Item(String name, String description, double healingPower) {
        this.name = name;
        this.description = description;
        this.healingPower = healingPower;
    }

   /**
    * gets item name
    * @return item name
    */
    public String getName() {
        return name;
    }
/**
 * gets item description
 * @return item description
 */
    public String getDescription() {
        return description;
    }
    /**
     * gets item power
     * @return item destructive power
     */

    public int getPower() {
        return destructivePower;
    }
    /**
     * gets item healing power
     * @return item healing power
     */
    public double getHealingPower(){
    return healingPower;
    }
}
