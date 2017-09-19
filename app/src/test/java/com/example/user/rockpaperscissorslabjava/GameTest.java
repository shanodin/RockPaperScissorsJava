package com.example.user.rockpaperscissorslabjava;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/09/2017.
 */

public class GameTest {

    Game rockPaperScissors1;
    Game rockPaperScissors2;
    RockPaperScissors elements;

    @Before
    public void before() {
        elements = new RockPaperScissors();
        elements.setUpElements();
        NumberGenerator zeroGenerator;
        zeroGenerator = Mockito.mock(NumberGenerator.class);
        Mockito.when(zeroGenerator.generateNumber(Mockito.anyInt()))
                .thenReturn(0);
        String randomElement = elements.getRandomElement(zeroGenerator);
        rockPaperScissors1 = new Game("Paper", randomElement);
        rockPaperScissors2 = new Game("Rock", randomElement);
    }

    @Test
    public void gameCanDecideAWinner() {
        assertEquals("Player Wins", rockPaperScissors1.playGame());
    }

    @Test
    public void gameCanRecogniseDraw() {
        assertEquals("Draw", rockPaperScissors2.playGame());
    }


}
