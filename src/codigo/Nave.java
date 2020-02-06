
package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Sergio Vilches
 */
public class Nave {
    
    Image imagen = null;
    public int posX = 0;
    public int posY = 0;
    
    public Nave(){
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (Exception e) {
            
        }
    }
}
