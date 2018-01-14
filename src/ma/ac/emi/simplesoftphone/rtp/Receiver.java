package ma.ac.emi.simplesoftphone.rtp;

import javax.media.*;
import java.io.IOException;

public class Receiver {
    private String locator;
    private MediaLocator mediaLocator;
    private Player player;

    private Receiver(String locator) {
        this.locator = locator;
        this.mediaLocator = new MediaLocator(locator);
        try {
            player = Manager.createRealizedPlayer(mediaLocator);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoPlayerException e) {
            e.printStackTrace();
        } catch (CannotRealizeException e) {
            e.printStackTrace();
        }
        player.start();
    }

    public static Receiver from(String locator){
        return new Receiver(locator);
    }
}