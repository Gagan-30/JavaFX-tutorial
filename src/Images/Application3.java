package Images;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Application3 extends Application
{
    @Override
    public void start (Stage primaryStage)
    {
        StackPane root = new StackPane();
       
       Scene myScene = new Scene(root, 800, 600);
        
       Image imgPod = new Image(getClass().getResourceAsStream("Pod.png"));
       ImageView ivPod = new ImageView(imgPod);
       root.getChildren().add(ivPod);
       
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
