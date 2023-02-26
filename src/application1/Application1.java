package application1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Application1 extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
       StackPane root = new StackPane();
       
       Scene myScene = new Scene(root, 800, 400);
       
       Label lblText = new Label();
       lblText.setText("Hello World");
       root.getChildren().add(lblText);
       
       primaryStage.setScene(myScene);
       primaryStage.show();
    }

  
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
