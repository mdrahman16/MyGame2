/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import java.util.ArrayList;
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
public class ItemCreationTest {
    ArrayList<Item> listOfItem;
    Item key;

    /**
     *initialize Item and array list object
     */
    public ItemCreationTest() {
        listOfItem = new ArrayList();
        key = new Item("key", "It has a shape of a heart", 100);
        testCreateItems();
    }
    
   
    /**
     * Test of createItems method, of class ItemCreation.
     * add Item object in array list
     */
    @Test
    public void testCreateItems() {
        System.out.println("createItems");
       
       listOfItem.add(key);
        
    }

    /**
     * Test of getItem method, of class ItemCreation.
     * test if the same item is still in the list
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Item expResult = key;
        Item result = listOfItem.get(0);
        assertEquals(expResult, result);
        
    }
    
}
