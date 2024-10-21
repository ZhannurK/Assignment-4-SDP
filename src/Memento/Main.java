package Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.append("Hello ");
        history.save(editor.save());

        editor.append("World!");
        System.out.println("Current Text: " + editor.getText());  // Output: Hello World!

        editor.restore(history.undo());
        System.out.println("After Undo: " + editor.getText());  // Output: Hello
    }
}