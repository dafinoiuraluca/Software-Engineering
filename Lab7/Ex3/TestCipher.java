package Lab7.Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestCipher {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Encrypt or decrypt: ");
        String choice = input.nextLine();
        do {
            if(choice == "encrypt") {
                System.out.println("What's the name of the input file?");
                String file = input.next();
                System.out.println("What's the name of the output file?");
                String out = input.next();
                System.out.println(Encipher(file, out));
            }
            else if(choice == "decrypt") {
                System.out.println("What's the name of the input file?");
                String file = input.next();
                System.out.println("What's the name of the output file?");
                String out = input.next();
                System.out.println(Decipher(file, out));
            }
        } while(choice != "encrypt" && choice != "decrypt");
    }


    public static String Encipher(String input, String output) throws FileNotFoundException {
        File file = new File(input);
        PrintStream encoded = new PrintStream(file);
        File reader = new File(input);
        Scanner in = new Scanner(reader);
        while(in.hasNextLine()) {
            String word = in.nextLine();
            String cipher = word.toUpperCase();
            String encipher = " ";
            for(int i = 0; i < cipher.length(); i++) {
                char current = cipher.charAt(i);
                char newChar = crypt(current, 1);
                encipher = encipher + newChar;
            }
            encoded.println(encipher);
        }
        encoded.close();
        return "DONE";
    }

    public static String Decipher(String input, String output) throws FileNotFoundException{
        PrintStream decoded = new PrintStream(output);
        File reader = new File(input);
        Scanner in = new Scanner(reader);
        while(in.hasNextLine()) {
            String word = in.nextLine();
            word = word.toUpperCase();
            String cipher = word;
            String decipher = " ";
            for(int i = 0; i < cipher.length(); i++) {
                char current = cipher.charAt(i);
                char newChar = decrypt(current, 1);
                decipher = decipher + current;
            }
            decoded.println(decipher);
        }
        decoded.close();
        return "DONE";
    }

    public static char crypt(char c, int shift) {
        char encrypted = c;
        shift = 1;
        if(Character.isLetter(encrypted)) {
            int enc;
            if((int) encrypted + shift > 91) {
                enc = encrypted - 65;
                enc += 1;
                enc = enc % 26;
                enc += 65;
                encrypted = (char) enc;
            }
            else {
                enc = encrypted + 1;
                encrypted = (char) enc;
            }
        }
        return encrypted;
    }

    public static char decrypt(char c, int shift) {
        char decrypted = c;
        shift = 1;
        if(Character.isLetter(decrypted)) {
            int dec;
            if((int) decrypted - 1 < 65) {
                dec = decrypted + 65;
                dec -= 1;
                dec = dec % 26;
                dec -= 65;
                decrypted = (char) dec;
            }
            else {
                dec = decrypted - 1;
                decrypted = (char) dec;
            }
        }
        return decrypted;
    }
}
