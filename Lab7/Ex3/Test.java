package Lab7.Ex3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Give the name of the file: ");
        String filename = in.nextLine();
        File file = new File(filename);
        Path path = Paths.get(file.getAbsolutePath());
        System.out.println(path.toString());
        String str = String.valueOf(Files.readAllLines(path));
        String opt;
        System.out.println("Introduce your option (1 for encrypting, 2 for decrypting, q for quiting");
        int length = str.length();
        do {
            opt = in.nextLine();
            switch (opt) {
                case "1":
                    System.out.println(encrypt(str));
                    File encryptedfile = new File("data.enc");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(encryptedfile));
                    writer.write(str);
                    break;

                case "2":
                    System.out.println(decrypt(str));
                    File decryptedfile = new File("data.dec");
                    BufferedWriter writer2 = new BufferedWriter(new FileWriter(decryptedfile));
                    writer2.write(str);
                    break;
                case "q":
                    System.exit(0);
            }
        } while(opt != "q");
        in.close();
    }


    private static String encrypt(String str) {
        int shift = 1;
        String s = " ";
        int len = str.length();
        for(int i = 0; i < len; i++) {
            char c = (char)(str.charAt(i) + shift);
            if(c > 'z') {
                s += (char)(str.charAt(i) - (26 - shift));
            }
            else {
                s += (char)(str.charAt(i) + shift);
            }
        }
        return s;
    }

    private static String decrypt(String str) {
        int shift = 1;
        String s = " ";
        for(int i = 0; i < str.length(); i++) {
            char c = (char)(str.charAt(i) - shift);
            if(c > 'z') {
                s += (char)(str.charAt(i) - (26 + shift));
            }
            else {
                s += (char)(str.charAt(i) - shift);
            }
        }
        return s;
    }

//    private static String encrypt(String str, int length, int shift) {
//        StringBuilder stringBuilder = new StringBuilder();
//        char c;
//        for(int i = 0; i < length; i++) {
//            c = str.charAt(i);
//            if(Character.isLetter(c)) {
//                c = (char) (str.charAt(i) + shift);
//
//                if((Character.isLowerCase(str.charAt(i)) && c > 'z')
//                        || (Character.isUpperCase(str.charAt(i)) && c > 'Z')) {
//                    c = (char) (str.charAt(i) - (26 - shift));
//                }
//            }
//            stringBuilder.append(c);
//        }
//        return stringBuilder.toString();
//    }
}
