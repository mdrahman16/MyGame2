package ass3.mygame2;

import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * this class hold information about the room.Some of the rooms are  set to locked. Each room has has exit and some items in it.
 * 
 * @author  narender
 * @version 1.5.0
 */

public class Room 
{
    private String description;
    private String name;
    private boolean isLocked;
    private HashMap<String, Room> exits;        // stores exits of this room.
    private ArrayList<Item> roomItem;
    private HashMap<Room, Item> roomHashMapItem;
/**
 * create a room object
 * @param name is the name of the room
 * @param description is the description of the room
 * @param isLocked is used to set room locked or unlocked
 */
   
    public Room(String name, String description, boolean isLocked) 
    {
        this.description = description;
        this.name = name;
        this.isLocked = isLocked;
        exits = new HashMap<>();
        roomItem = new ArrayList();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * get The short description of the room
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString() + ".\n" + getAllItems();
    }
/**
 * return an items list
 * @return items list
 */
    public String getAllItems(){

        return "You have some " + listOfItems();

    }
/**
 * return items in the room
 * @return items in room
 */
    private String listOfItems(){

        String returnString = "items:";
        for(Item item : roomItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }

    /**
     * return item object based on input string
     *
     * @param stringItem taken from the command which was converted into a String
     * @return Item class according to the input String
     */
    public Item getRoomItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: roomItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
/**
 * add item in the room 
 * @param item to be added in the room
 */
    public void addItemInRoom(Item item){
        roomItem.add(item);
    }
/**
 * remove item from room
 * @param item to be removed from room
 */
    public void removeItemInRoom(Item item){
        if(roomItem.size() > 0){
            roomItem.remove(item);
        }
    }
/**
 * add item in specific room 
 * @param room where item will be added
 * @param item to be added in specific room
 */
    public void addHashMapItemInRoom(Room room, Item item){
        roomHashMapItem.put(room, item);
    }

    /**
     * return room status. true if locked 
     *
     * @return The return value
     */

    public boolean getLockedStatus(){
        return isLocked;
    }
/**
 * set room locked status(true is locked or false is unlocked)
 * @param newStatus set room status
 */
    public void setLockedStatus(boolean newStatus){
        isLocked = newStatus;
    }
    /**
     * return name of a room
     * @return name of room
     */
    public String getName(){
        return name;
    }

    
}

