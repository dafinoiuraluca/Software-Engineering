package Lab6.Ex4;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    HashMap<Word, Definition> dictionary = new HashMap<>();

    public void addWord(Word w, Definition d) {
        dictionary.put(w, d);
    }

    public Definition getDefinition(String w) {
        if(dictionary.containsKey(w)) {
            Definition d = dictionary.get(w);
            System.out.println(d);
        }
        else {
            System.out.println("The word entered does not exist in the dictionary");
        }
        return null;
    }


    public void getAllWords() {
        for(Word w : dictionary.keySet()) {
            dictionary.get(w);
            System.out.println(w);
            System.out.println("\n");
        }
    }


    public Definition getAllDefinitions(){
        for(Map.Entry<Word, Definition> entry : dictionary.entrySet()){
            System.out.println(entry.getValue());
        }
        return null;
    }

    public void displayChoices() {
        System.out.println("1. Add word to the dictionary: ");
        System.out.println("2. Get definition of a word from the dictionary");
        System.out.println("3. Get all words in the dictionary");
        System.out.println("4. Get all definitions from the dictionary");
        System.out.println("Enter your option (1, 2, 3, 4, q - quit): ");
    }

}
