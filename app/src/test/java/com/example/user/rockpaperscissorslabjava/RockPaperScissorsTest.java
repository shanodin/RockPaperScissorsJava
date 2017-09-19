package com.example.user.rockpaperscissorslabjava;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 19/09/2017.
 */

public class RockPaperScissorsTest {

    RockPaperScissors game;

    @Before
    public void before() {
        game = new RockPaperScissors();

    }

//    @Test
//    public void checkGameStartsWithNoElementsToChoose() {
//        assertEquals(0, game.getLength());
//    }

    @Test
    public void canGetElements(){
        assertNotNull(game.getElements());
    }

    @Test
    public void canSetUpElements() {
        assertEquals(3, game.getLength());
    }

    @Test
    public void canGetElementByIndex(){
        assertEquals("Rock", game.getElementByIndex(0));
    }

    @Test
    public void canGetRandomElement() {
        game.setUpElements();
        NumberGenerator zeroGenerator;
        zeroGenerator = Mockito.mock(NumberGenerator.class);
        Mockito.when(zeroGenerator.generateNumber(Mockito.anyInt()))
                .thenReturn(0);
        String randomElement = game.getRandomElement(zeroGenerator);
        assertEquals("Rock", randomElement);
    }

}
