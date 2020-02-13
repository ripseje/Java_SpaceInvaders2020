package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Jorge Cisneros
 */
public class Explosion {
    Image imagen1 = null;
    Image imagen2 = null;
    
    public int posX = 0;
    public int posY = 0;
    
    public int tiempoDeVida = 50;
    
    Clip sonidoExplosion;
    
    public Explosion(){
        try {
            sonidoExplosion = AudioSystem.getClip();
            sonidoExplosion.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonidos/explosion.wav")));
           
        } catch (UnsupportedAudioFileException ex) {
        } catch (IOException ex) { 
        } catch (LineUnavailableException ex) {
        }
    }
    
}
