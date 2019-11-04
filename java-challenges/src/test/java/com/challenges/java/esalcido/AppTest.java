package com.challenges.java.esalcido;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.challenges.java.esalcido.logicalAndBitwise.LogicalAndBitwiseChallenge;
import com.challenges.java.esalcido.interfaces.InterfaceChallange;
import com.challenges.java.esalcido.optional.OptionalChallenge;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testOptional(){
        assertEquals("Virus1theOneTRINITY", OptionalChallenge.run());
        
    }

    @Test

    public void testLogicalAndBitwiseChallange(){
        assertEquals(74, LogicalAndBitwiseChallenge.run());
    }
}
