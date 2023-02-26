package Game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Application4 extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        Group g = new Group();
        Scene scene = new Scene(g, 800, 600);
        
        Image imgBack = new Image(getClass().getResourceAsStream("background.png"));
        ImageView ivBack = new ImageView (imgBack);
        g.getChildren().add(ivBack);
        
        primaryStage.setTitle("Flyer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
