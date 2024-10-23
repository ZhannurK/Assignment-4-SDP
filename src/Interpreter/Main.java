package Interpreter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression (e.g., 5 + 2 - 3): ");
        String expression = scanner.nextLine();

        int result = Interpreter.evaluate(expression);
        System.out.println("Result: " + result);

        scanner.close();
    }
}