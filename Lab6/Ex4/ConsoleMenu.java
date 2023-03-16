package Lab6.Ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner option = new Scanner(System.in);
        Scanner word = new Scanner(System.in);
        Scanner def = new Scanner(System.in);

        dictionary.displayChoices();
        String opt = null;
        do {
            opt = option.nextLine();
            switch(opt) {
                case "1":
                    System.out.println("Add word: ");
                    Word w = new Word();
                    w.setName(word.nextLine());
                    System.out.println("Add definition for the word: ");
                    Definition d = new Definition();
                    d.setDescription(def.nextLine());

                    dictionary.addWord(w, d);

                    dictionary.displayChoices();
                    break;
                case "2":
                    System.out.println("Get a definition. Insert a word: ");
                    String new_word = word.nextLine();
                    dictionary.getDefinition(new_word);
                    dictionary.displayChoices();
                    break;
                case "3":
                    System.out.println("Get all words");
                    dictionary.getAllWords();
                    dictionary.displayChoices();
                    break;
                case "4":
                    System.out.println("Get all definitions");
                    dictionary.getAllDefinitions();
                    dictionary.displayChoices();
                    break;
                case "q":
                    System.out.println("Choice doesn't exist. Program ended.");
                    System.exit(0);
            }
        } while(!opt.equals("q"));
    }
}
