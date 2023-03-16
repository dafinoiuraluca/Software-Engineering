package Lab7.Ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) throws Exception {
        File file = new File("D:/Facultate/SE/Clone/Hello/data.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        Scanner scanner = new Scanner(System.in);
        String s;
        char check = 0;
        int contor = 0;
        while((s = in.readLine()) != null) {
            System.out.println(s);
            System.out.println("Give a character: ");
            char c = scanner.next().charAt(0);
            for(int i = 0; i < file.length(); i++) {
                if(s.charAt(i) == c) {
                    contor++;
                }
            }
        }
        System.out.println(contor);
        in.close();
    }
}
