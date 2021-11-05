package controlselection.consonant;

import java.util.List;

public class ToConsonant {
    //private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String letterVowels = "aeioua";

    public char inspectCharacter(char character) {
        char feedback;
        if (letterVowels.contains(Character.toString(character))) {
            feedback = letterVowels.charAt(letterVowels.indexOf(Character.toString(character))+1);
        } else{
            feedback = character;
        }return feedback;
    }
}
