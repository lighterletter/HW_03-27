package nyc.c4q.lighterletter;

import java.util.Scanner;

/**
Hw assignment for the week of 3-22-15. Due Mach-27-15.
Problem set 1.
 (I based the some of the format for my code referencing my classmate's
 Sarah Kim. Github: hyunj0)

Write a function uniqueCharacters which accepts as input
 a string S. Given the string S return a string S2
which contains all the distinct characters in S. The in
put string will only contain lowercase characters. The
ordering of characters in the output string does not
matter.
*/

public class uniqueCharacters {

    public static String uniqueCharacters(String S) {//Method receives a string as input
        S.equalsIgnoreCase(S);//Changes characters to lower case.


        String S2 = "" + S.charAt(0);
            //Initializes string "S2" with a space in a string that
            //consists of string S starting at the first character 'char 0'

        for (int i = 1; i < S.length(); i++) {//Sorts the string Cadence. Counting each
                //character. Begins to count down from the highest character in  the
                // length of S.

            String c = S.substring( i , i + 1);//Creates a substring of S and denotes
                //each character from the first 'i' to the last 'i + 1'(loop adds as it counts)
                //and names it c.

            if ((S2.indexOf(c) != -1) ){//If 'S2' contains a character of 'c' it continues through
                //the loop. S2.contains(c) can also be used.
                continue;
            }

            else{//the string consists of every first instance of a character that appears.
                S2 = S2 + S.charAt(i);
            }

        }
        return (S2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in your input. \n" +
                "I'll return only the first instance of each letter.");
        String S = scanner.nextLine();

        System.out.println(uniqueCharacters(S));




    }
}
