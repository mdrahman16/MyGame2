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
public class RoomCreationTest {
    
    
    public RoomCreationTest() {
    }
    
    
    /**
     * Test of getRoom method, of class RoomCreation.
     * All room has been tested by changing name of variable StringRoom and expResult
     */
    @Test
    public void testGetRoomCastle() {
        System.out.println("getRoom");
        String stringRoom = "castle";
        RoomCreation instance = new RoomCreation();
        String expResult ="castle"; 
        Room result = instance.getRoom(stringRoom);
        assertEquals(expResult, result.getName());
         
    }
    
    
}
