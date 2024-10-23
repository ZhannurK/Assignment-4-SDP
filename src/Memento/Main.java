package Memento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial text to append: ");
        String initialText = scanner.nextLine();
        editor.append(initialText);
        System.out.println("Current Text: " + editor.getText());

        history.save(editor.save());
        System.out.println("Text state saved.");

        System.out.print("Enter more text to append: ");
        String newText = scanner.nextLine();
        editor.append(newText);
        System.out.println("Current Text: " + editor.getText());

        System.out.print("Do you want to undo the last change? (yes/no): ");
        String undoOption = scanner.nextLine();

        if (undoOption.equalsIgnoreCase("yes")) {
            Memento previousState = history.undo();
            if (previousState != null) {
                editor.restore(previousState);
                System.out.println("Undo successful.");
            }
        }

        System.out.println("Current Text after undo option: " + editor.getText());

        scanner.close();
    }
}