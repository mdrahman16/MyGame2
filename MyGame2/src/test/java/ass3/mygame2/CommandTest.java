/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Narender
 */
public class CommandTest {

    Command instance;

    public CommandTest() {
        instance = new Command("go", "north");
    }

    /**
     * Test of getCommandWord method, of class Command.
     */
    @Test
    public void testGetCommandWord() {
        System.out.println("getCommandWord");

        String expResult = "go";
        String result = instance.getCommandWord();

        assertEquals(expResult, result);

    }

    /**
     * Test of getSecondWord method, of class Command.
     */
    @Test
    public void testGetSecondWord() {
        System.out.println("getSecondWord");
        String expResult = "north";
        String result = instance.getSecondWord();

        assertEquals(expResult, result);

    }

    /**
     * Test of isUnknown method, of class Command.
     */
    @Test
    public void testIsUnknown() {
        System.out.println("isUnknown");
        
        boolean expResult = false;
        boolean result = instance.isUnknown();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasSecondWord method, of class Command.
     */
    @Test
    public void testHasSecondWord() {
        System.out.println("hasSecondWord");
        
        boolean expResult = true;
        boolean result = instance.hasSecondWord();
        assertEquals(expResult, result);
        
    }

}
