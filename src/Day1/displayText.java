package Day1;
import java.util.Scanner;

public class displayText {
public static void main(String[] args) {
        // Prompt the user to enter a message
        System.out.println("Enter your message:");

        // Use a Scanner to read the user's input
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine();

        // Print the message using println (with a newline)
        System.out.println("Using println:");
        System.out.println(a);

        // Print the message using print (without a newline)
        System.out.print("Using print:");
        System.out.print(a);

        // Print a new line with escape sequences
        System.out.println("\n\nText with escape sequences:");
        System.out.println("Hello, \"Java Masterclass\" students!\nWelcome to Day 1.\nLet's get started!");
    }
}
