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
public class PlayerTest {
   Item item; 
    public PlayerTest() {
        item= new Item("gun", "It is a gun", 50);
    }
    
  

    /**
     * Test of addItemInventory method, of class Player.
     */
    @Test
    public void testAddItemInventory() {
        System.out.println("addItemInventory");
       
        Player instance = new Player();
        instance.addItemInventory(item);
        
    }
    
     

    /**
     * Test of removeItemInventory method, of class Player.
     */
    @Test
    public void testRemoveItemInventory() {
        System.out.println("removeItemInventory");
        
        Player instance = new Player();
        instance.removeItemInventory(item);
        
    }

   /**
     * Test of getPlayerItem method, of class Player.
     */
    @Test
    public void testGetPlayerItem() {
        
        System.out.println("getPlayerItem");
        String stringItem = "gun";
        Player instance = new Player();
        //it is null because item was removed by testRemoveItemInventory() method 
        Item expResult = null;
        Item result = instance.getPlayerItem(stringItem);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printAllInventory method, of class Player.
     */
  
    
}
