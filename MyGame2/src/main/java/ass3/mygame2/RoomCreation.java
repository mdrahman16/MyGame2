package ass3.mygame2;

import java.util.ArrayList;

/**
 * this class is used to create room. add item in each room. And to set Exit direction of each room.
 *
 * @author Narender
 * @version 1.5.0
 *
 */
public class RoomCreation {

    //list of a all room in game
    private ArrayList<Room> allRoomInGame = new ArrayList();

    private ItemCreation itemCreation;
/**
 * initialize itemCreation and creating room
 
 */
    public RoomCreation() {
        itemCreation = new ItemCreation();
        createRooms();
    }
/**
 * the method is used to create room with exit and item in room
 * 
 */
    private void createRooms() {

        Room castle, kitchen, frontGate, frontYard;
        // createing room
        castle = new Room("castle", "You are at the castle", false);
        kitchen = new Room("kitchen", "The kitchen door has a shape of a heart", false);
        frontGate = new Room("frontGate", "There is a giant ogre", true);
        frontYard = new Room("frontYard", "Front yard is beautiful", false);
          // seting exit
        castle.setExit("east", kitchen);
        castle.setExit("south", frontGate);
        frontGate.setExit("north", castle);
        frontYard.setExit("west", frontYard);
          // adding item in each room
        castle.addItemInRoom(itemCreation.getItem("excaliburSword"));
        castle.addItemInRoom(itemCreation.getItem("key"));
        kitchen.addItemInRoom(itemCreation.getItem("frontGateKey"));
        frontYard.addItemInRoom(itemCreation.getItem("magicalKnife"));

        allRoomInGame.add(castle);
        allRoomInGame.add(frontGate);
        allRoomInGame.add(kitchen);
        allRoomInGame.add(frontYard);

    }

     /**
     * return room object based on input string
     *
     * @param stringRoom taken from the command which was converted into a String
     * @return Room class object according to the input String
     */
    public Room getRoom(String stringRoom) {
        Room roomToReturn = null;
        for (Room room : allRoomInGame) {
            if (room.getName().contains(stringRoom)) {
                roomToReturn = room;
            }
        }
        return roomToReturn;
    }

}
