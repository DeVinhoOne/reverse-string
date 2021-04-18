package ReverseString;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (\"x\" to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            String[] letters = input.split("");
            StringBuilder reverseString = new StringBuilder();
            for (int i = letters.length - 1; i >= 0; i--) {
                reverseString.append(letters[i]);
            }
            System.out.println(reverseString);
        }

        scanner.close();
    }
}
