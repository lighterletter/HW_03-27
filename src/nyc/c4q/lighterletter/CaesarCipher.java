package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/25/15.
 */

import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String string = sc.nextLine();

        System.out.println("Enter a second string");

        String encoded = sc.nextLine();

        //checks if input is the same phrase using a cycpher check.
        if (codeBreakers(string, encoded)) {
            System.out.println("Same phrase");
        } else {
            System.out.println("not same phrase");
        }
    }

    public static boolean codeBreakers(String input1, String input2) {

        for (int i = 0; i <= 25; i++) {//runs through the iteration of possible strings until
            //phrase is found. If not. It returns false.

            String decoded = decode(input2, i);
            System.out.println("input1: " + input1);
            System.out.println("decoded: " + decoded);
            if (input1.equals(decoded)) {

                return true;
            }

        }

        return false;
    }

}