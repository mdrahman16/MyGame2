/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Narender
 */
public class CommandWordsTest {
    
    public CommandWordsTest() {
        
    }
    
    

    /**
     * Test of isCommand method, of class CommandWords.
     */
    @Test
    public void testIsCommand() {
        System.out.println("isCommand");
        //commnad words to be tested: "go", "quit", "help", "take", "drop", "use", "inventory", "inspect"
        //All command words are tested one by one
        String aString = "go";
        CommandWords instance = new CommandWords();
        boolean expResult = true;
        boolean result = instance.isCommand(aString);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of showAll method, of class CommandWords.
     */
    @Test
    public void testShowAll() {
        System.out.println("showAll");
        CommandWords instance = new CommandWords();
        //Must show "go", "quit", "help", "take", "drop", "use", "inventory", "inspect"
        instance.showAll();
        
    }
    
}
