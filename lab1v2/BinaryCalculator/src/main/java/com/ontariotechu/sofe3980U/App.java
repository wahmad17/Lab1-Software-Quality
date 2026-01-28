package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Print the current local time
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get binary inputs from the user
        System.out.print("Enter the first binary number: ");
        String firstBinary = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String secondBinary = scanner.nextLine();

        // Create Binary objects
        Binary binary1 = new Binary(firstBinary);
        Binary binary2 = new Binary(secondBinary);

        // Print the binary numbers
        System.out.println("First binary number is " + binary1.getValue());
        System.out.println("Second binary number is " + binary2.getValue());

        // Choose operation
        System.out.println("Choose an operation: ");
        System.out.println("1. OR");
        System.out.println("2. AND");
        System.out.println("3. Multiply");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        Binary result = null;

        switch (choice) {
            case 1:
                result = Binary.or(binary1, binary2);
                System.out.println("Bitwise OR result: " + result.getValue());
                break;
            case 2:
                result = Binary.and(binary1, binary2);
                System.out.println("Bitwise AND result: " + result.getValue());
                break;
            case 3:
                result = Binary.multiply(binary1, binary2);
                System.out.println("Multiplication result: " + result.getValue());
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
