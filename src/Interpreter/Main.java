package Interpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "5 + 2 - 3";
        int result = Interpreter.evaluate(expression);
        System.out.println("Result: " + result);  // Output: 4
    }
}
