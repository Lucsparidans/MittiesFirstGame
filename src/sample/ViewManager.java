package sample;

import javafx.stage.Stage;

import java.util.Stack;

public class ViewManager {
    private Stack<Stage> viewStack;
    public ViewManager(Stage stage){
        this.viewStack = new Stack<>();
        viewStack.push(stage);
    }
    public void push(Stage s){
        if(!viewStack.isEmpty()){
            viewStack.peek().hide();
        }
        if (s != null){
            this.viewStack.push(s);
        }
    }
    public void render(){

        viewStack.peek().show();
    }
}
