package com.example.user.rockpaperscissorslabjava;

import java.util.ArrayList;

/**
 * Created by user on 19/09/2017.
 */

public class RockPaperScissors {

    ArrayList<String> elements;

    public RockPaperScissors(){
        elements = new ArrayList<>();
        setUpElements();
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public int getLength() {
        return elements.size();
    }

    public void setUpElements() {
        elements.add("Rock");
        elements.add("Paper");
        elements.add("Scissors");
    }

    public String getElementByIndex(int index) {
        return this.elements.get(index);
    }

    public String getRandomElement(NumberGenerator numberGenerator) {
        int randomIndex = numberGenerator.generateNumber(getLength());
        String randomElement = getElementByIndex(randomIndex);
        return randomElement;
    }


}
