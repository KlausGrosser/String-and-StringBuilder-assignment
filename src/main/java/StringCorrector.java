package main.java;

import java.util.Scanner;

public class StringCorrector {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String originText, oldPhrase, newPhrase;
        String oldChar, newChar;

        demo = charReplacer(originText, oldChar, newChar);


        System.out.println("Please enter a text:");
        originText = myScanner.nextLine();

        System.out.println("Please enter the one character you want to replace:");
        oldChar = myScanner.nextLine();
        System.out.println("Enter the new character to be added:");
        newChar = myScanner.nextLine();
        System.out.println(charReplacer(originText, oldChar, newChar));

        System.out.println("Enter the one word you want to replace:");
        oldPhrase = myScanner.nextLine();
        System.out.println("Enter a new word to be added");
        newPhrase = myScanner.nextLine();
        System.out.println(wordReplacer(originText, oldPhrase, newPhrase));


    }

    public static String wordReplacer(String origin, String oldWord, String newWord) {
        if (origin.length() > 500) {
            return "Sorry, your text exceeds the 500 characters limit.";
        }
        StringBuilder result = new StringBuilder(origin);
        int startIndex = origin.indexOf(oldWord); // e.g. startIndex: 7
        int endIndex = startIndex + oldWord.length(); // endIndex : 7 + .replacedWord.length()
        result.replace(startIndex, endIndex,newWord);
        return result.toString();
    }

    public static String charReplacer(String origin, String oldCharacter, String newCharacter) {
        if (origin.length() > 500) {
            return "Sorry, your text exceeds the 500 characters limit.";
        }
        StringBuilder result = new StringBuilder(origin);
        int startIndex = origin.indexOf(oldCharacter); // e.g. startIndex: 7
        int endIndex = startIndex + oldCharacter.length(); // endIndex : 7 + .replacedWord.length()
        result.replace(startIndex, endIndex,newCharacter);
        return result.toString();
    }

public static String replaceChar(String origin, char oldCharacter, char newCharacter ) {
    String changed = origin.replace(oldChar,newChar);
    return changed;
}
}
