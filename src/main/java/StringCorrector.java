package main.java;

import java.util.Scanner;

public class StringCorrector {
    public static void main(String[] args) {
        String myString, phrase1, phrase2, dPhrase;
        char c1, c2;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type a text to be checked:");
        myString = myScanner.nextLine();
        //check the length:
        System.out.println(characterLimitCheck(myString));
        System.out.println("Please type the one character you wish to replace:");
        c1 = myScanner.nextLine().charAt(0);
        System.out.println("Please type a character you wish to replace with:");
        c2 = myScanner.nextLine().charAt(0);
        System.out.println(replaceOneCharacter(myString,c1,c2));
        System.out.println("Please type a character you wish to replace in all the text:");
        c1 = myScanner.nextLine().charAt(0);
        System.out.println("Please type a character you wish to replace with:");
        c2 = myScanner.nextLine().charAt(0);
        System.out.println(replaceAllCharacters(myString,c1,c2));
        System.out.println("Please type the one phrase that you wish to replace:");
        phrase1 = myScanner.nextLine();
        System.out.println("Please type a phrase that you wish to replace with:");
        phrase2 = myScanner.nextLine();
        System.out.println(replaceOnePhrase(myString, phrase1, phrase2));
        System.out.println("Please type a phrase you wish to replace in all the text:");
        phrase1 = myScanner.nextLine();
        System.out.println("Please type a phrase you wish to replace with:");
        phrase2 = myScanner.nextLine();
        System.out.println(replaceAllPhrases(myString,phrase1,phrase2));
        System.out.println("Please type a phrase that you wish to delete");
        dPhrase = myScanner.nextLine();
        System.out.println(deletePhrase(myString, dPhrase));

    }

    /**
     * Checks if the entered text doesn't surpass the 500 character limit.
     * @param str : typeOf String : indicates the original text to replace chars inside it.
     * @return : typeOf String : an error message or an ok message.
     */
    public static String characterLimitCheck(String str){
        return str.length() > 500 ? "Error, you surpassed the limit of 500 characters." : "Ok";
    }

    /**
     * First occurrence only replaced.
     * @param str : typeOf String : indicates the original text to replace chars inside it.
     * @param oldChar : typeOf char : old character to be replaced.
     * @param newChar : typeOf char : new character to have in place of the old one.
     * @return : typeOf String : the result after the replacement.
     */
    public static String replaceOneCharacter(String str, char oldChar, char newChar){
        StringBuilder result = new StringBuilder(str);
        int startIndex = str.indexOf(oldChar);
        result.replace(startIndex,startIndex+1, String.valueOf(newChar));
        return result.toString();
    }

    /**
     * Replaces all occurrences of one char with another char:
     * @param str : typeOf String : indicates the original text to replace chars inside it.
     * @param oldChar : typeOf char : old character to be replaced.
     * @param newChar : typeOf char : new character to have in place of the old one.
     * @return : typeOf String : the result after the replacement.
     */
    public static String replaceAllCharacters(String str, char oldChar, char newChar){
        String result = str.replace(oldChar, newChar);
        return result;
    }

    /**
     * First occurrence only.
     * @param str : typeOf String : the original sentence we want to change inside it.
     * @param oldPhrase : typeOf String : the old phrase to be replaced.
     * @param newPhrase : typeOf String : the new phrase we want to take place of the old one.
     * @return : typeOf String : the result after the replacement.
     */
    public static String replaceOnePhrase(String str, String oldPhrase, String newPhrase){
        StringBuilder result = new StringBuilder(str);
        int startIndex = str.indexOf(oldPhrase);
        int endIndex = startIndex+oldPhrase.length();
        result.replace(startIndex,endIndex, String.valueOf(newPhrase));
        return result.toString();
    }

    /**
     * Replaces all occurrences of one phrase with another phrase:
     * @param str : typeOf String : indicates the original text to replace chars inside it.
     * @param oldPhrase : typeOf String : the old phrase to be replaced.
     * @param newPhrase : typeOf String : the new phrase we want to take place of the old one.
     * @return : typeOf String : the result after the replacement.
     */
    public static String replaceAllPhrases(String str, String oldPhrase, String newPhrase) {
        String result = str.replace(oldPhrase, newPhrase);
        return result;
    }
    /** write a method to delete a phrase from the text.
     * Only first occurrence will be deleted.
     * @param str : typeOf String : the original sentence we want to change inside it.
     * @param phrase : typeOf String : the phrase to be deleted.
     * @return : typeOf StringBuilder :
     */
    public static StringBuilder deletePhrase(String str, String phrase){
        StringBuilder result = new StringBuilder(str);
        int startIndex = str.indexOf(phrase);
        int endIndex = startIndex+phrase.length();
        result.delete(startIndex, endIndex);
        return result;
    }


}
