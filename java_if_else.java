
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                // taking input from the user
        Scanner scn = new Scanner (System.in);
        
        int n = scn.nextInt();
        //Initiating the function
        Java_if_else(n);
        
        }
    // Using fuctions to solve this question
    public static void Java_if_else(int n) {
        if (n % 2 == 0 && 5 < n && n < 21) {
            System.out.println("Weird");

        } else if (n % 2 == 0 || n > 20 && 1 < n && n < 6) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }

}
