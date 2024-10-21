package Memento;

class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void append(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getState());
    }
}