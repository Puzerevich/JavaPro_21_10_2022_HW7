package Task_6;

import java.util.Random;
import java.util.Scanner;


public class GuessTheWord {

    private Random random = new Random();
    private String[] words;
    private char[] chars;
    private String hiddenWord;
    private String enterWord;
    private Scanner enter = new Scanner(System.in);

    public void startGm(){
        words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        chars = new char[]{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*',};
        hiddenWord = words[random.nextInt(words.length)];
        workProcess();
    }


    public void workProcess(){
        do{
            System.out.println("Guess the word: ");
            enterWord = enter.nextLine();
            printInfo(enterWord, initOutput());
        }while(!enterWord.equals(hiddenWord));
    }


    private String initOutput() {
        int cnt = 0;
        for (int j = 0; j < Math.min(enterWord.length(), hiddenWord.length()); j++) {
            if (hiddenWord.toLowerCase().charAt(j) == enterWord.toLowerCase().charAt(j)) {
                chars[j] = enterWord.toLowerCase().charAt(j);
            } else chars[j] = '*';
           // System.out.println("res: "+hiddenWord.charAt(j));
        }
        return new String(chars);
    }

    private void printInfo(String enterWord, String output) {
        if (enterWord.equals(hiddenWord)) {
            System.out.println("Good job, " + enterWord + " is a hidden word!");
            enter.close();
        } else System.out.println(hiddenWord+" Try again!\n" + output);
    }

}
