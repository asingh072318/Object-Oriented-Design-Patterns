package BehavioralDesignPattern.MementoPattern.java;

public class Driver {
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();
        CareTaker careTaker = new CareTaker();
        textEditor.setContent("Hello 1 friend");
        careTaker.save(textEditor);
        System.out.println("Content after first save: "+textEditor.getContent());

        textEditor.setContent("Hello  2 friends");
        System.out.println("Content after second change: "+textEditor.getContent());

        careTaker.undo(textEditor);
        System.out.println("Content after first undo: "+textEditor.getContent());

        careTaker.undo(textEditor);
        System.out.println("Content after second undo: "+textEditor.getContent());
    }
}
