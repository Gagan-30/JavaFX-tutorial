package Game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Baddie 
{
     int x,y,dx,dy;
    ImageView ivBaddie;
    
    Baddie()
    {
        dx=10;
        dy=10;
        Image imgRocket = new Image (getClass().getResourceAsStream("Baddie.png"));
        ivBaddie = new ImageView (imgRocket);
        ivBaddie.setLayoutX(dx);
        ivBaddie.setLayoutY(dy);
    }
    
    public ImageView getImageView()
    {
        return ivBaddie;
    }
}
