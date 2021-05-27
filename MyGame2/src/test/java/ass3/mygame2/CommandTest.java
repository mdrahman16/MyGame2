
package ass3.mygame2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *this class is used to test CommandTet
 * @author Narender
 */
public class CommandTest {

    Command instance;

    /**
     *Initialize Command object.
     */
    public CommandTest() {
        // "go" is first word and "north" is second
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
