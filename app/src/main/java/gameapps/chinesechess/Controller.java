package gameapps.chinesechess;

/**
 * Created by Abel on 3/28/2016.
 */
public class Controller {
    Game g;
    public Controller() {
        g = new Game(this);
    }
    public void begin() {
        while (!g.game_over()) {
            //stuff
        }
    }
}