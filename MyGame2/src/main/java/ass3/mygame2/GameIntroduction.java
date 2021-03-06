
package ass3.mygame2;

import java.util.Scanner;

/**
 * Provided introduction to the user how to play this game.Before the start, Introduction will be shown to user.
 * 
 * @author Narender
 * @version 1.5.0
 */
public class GameIntroduction {

    Game game = new Game();
    String gameIntro = ("-----------------------------------------------------------------------------------------\n"
            + "----------Game Introduction----------\n"
            + "World of Zuul\" is a very simple, text based adventure game \n"
            + "There are 4 Rooms in the game(Castle,Kitchen,Frontgate, FrontYard).\n"
            + "If the room is looked then first you have to find the key. \n"
            + "Player can walk around the room with the help go+(direction) command. \n"
            + "Each room has certain itme in it. which can be taken with the help of take + (item) command. \n"
            + "You can quit game any time just enter 'Quit'in input window \n"
            + "Direction availiable in Game:North, South, East, West.\n"
            + "Item availiable in game: excaliburSword,front gate key, magical knife, key \n"
            + "Command that can be used in game: Go, quit, help, take, drop, use, inventory and inspect \n"
            + "-----------------------------------------------------------------------------------------");
/**
 * Display game introduction. after introduction if user press 'y' then user can play this game
 */
    public void gameIntro() {
        System.out.println(gameIntro);
        System.out.println("Please press  Y to  start the game and press any key to Quit the game \n Your input: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        if (userInput.equals("Y") || userInput.equals("y")) {
            game.play();
        } else {
            System.exit(0);
        }

    }

}
