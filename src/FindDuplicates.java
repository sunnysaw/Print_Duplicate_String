/*
Question : Write an efficient program to print all the duplicates and their counts in the input string.
_______________________________________________________________________________________________________
Algorithm: Let input string be “geeksforgeeks”
Construct character count array from the input string.
count[‘e’] = 4
count[‘g’] = 2
count[‘k’] = 2
 */

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the word on which you want to perform operation :");
//        String name = input.nextLine();
//        System.out.println("Printing the result :");
//        ArrayList  string = new ArrayList<>();
//
//    }
//}

public class FindDuplicates {
    public static void main(String[] args) {
        String input = "sunny love muskan";
        printDuplicates(input);
    }

    public static void printDuplicates(String input) {
               // Initialize an array to store the frequency of each character (assuming ASCII characters)
        int[] charFrequency = new int[256];

        // Calculate the frequency of each character in the input string
        for (int i = 0; i < input.length(); i++) {
           charFrequency[input.charAt(i)]++;
        }

        // Print the duplicate characters
        System.out.println("Duplicates in the input string:");
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 1) {
                System.out.println((char) (i) + " count " + charFrequency[i]);
                // To avoid printing duplicates multiple times
            }
        }
    }
}
