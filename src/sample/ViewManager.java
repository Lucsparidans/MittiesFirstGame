package sample;

import javafx.stage.Stage;

import java.util.Stack;

public class ViewManager {
    private Stack<Stage> viewStack;
    public ViewManager(Stage stage){
        viewStack.push(stage);
    }
}
