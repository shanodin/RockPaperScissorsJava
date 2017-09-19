package com.example.user.rockpaperscissorslabjava;

import java.util.Random;

/**
 * Created by user on 19/09/2017.
 */

public class NumberGenerator {

    public int generateNumber(int numberOfElements) {
        Random random = new Random();
        int randomNumber = random.nextInt(numberOfElements);
        return randomNumber;
    }

}
