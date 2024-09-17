package BehavioralDesignPattern.MementoPattern.java;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> memstack;

    public CareTaker(){
        this.memstack = new Stack<>();
    }

    public void save(TextEditor textEditor){
        memstack.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if(!memstack.empty()){
            textEditor.restore(memstack.pop());
        }
        else {
            System.out.println("No state to undo");
        }
    }
}
