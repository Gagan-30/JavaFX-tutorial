package Buttons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Application2 extends Application
{

    @Override
    public void start(Stage primaryStage)  
    {
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(box, 800, 400);
        
        Label lblText = new Label();
        lblText.setText("Hello World");
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        box.getChildren().add(btn);
        box.getChildren().add(lblText);
        
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle (ActionEvent event)
            {
                System.out.println("Hello World!");
            }
        });
        
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
    
      public static void main(String[] args) 
    {
        launch(args);
    }
}
