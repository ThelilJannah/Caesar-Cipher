package CC;

import java.util.Scanner;
import java.util.Random;

public class CaesarCipher {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int max = 90;
        int min = 65;

        try {
            System.out.println("Enter 1 for Encryption and 2 for Decryption: ");
            int mode = scan.nextInt();

            System.out.print("Enter the text(s): ");
            String w = scan.next();

            if(w.matches("[a-zA-Z]+")){

                String text = w.toUpperCase();
                System.out.print("Enter a key (1-25) | 0 if there's none: ");
                int key = scan.nextInt();

                char[] c = text.toCharArray();
                char[] d = new char[c.length];

                if(mode == 1 || mode == 2) {
                    if (key >= 1 && key <= 25) {
                        main.caesar(c, d, max, min, key, mode);
                    }else if (mode == 1 && key == 0) {
                        int randomKey = rand.nextInt(25) + 1;
                        System.out.print("key: " + randomKey + " | ");
                        main.caesar(c, d, max, min, randomKey, mode);
                    }else if (mode == 2 && key == 0) {
                        for (int j = 1; j <= 25; j++) {
                            System.out.print(j + ". ");
                            main.caesar(c, d, max, min, j, mode);
                            System.out.println();
                        }
                    }else{
                        System.out.println("Invalid key.");
                    }

                }else System.out.println("Invalid mode.");
            }else
                System.out.println("Enter letters only.");


        }catch (Exception e) {
            System.out.println("Something went wrong, try again.");
        }


    }

}