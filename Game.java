package gameapps.chinesechess;
import java.util.Vector;

/**
 * Created by Abel on 3/29/2016.
 */
public class Game {
    Vector red; //vector of Pieces
    Vector black; // vector of Pieces
    boolean gg;
    public Game() {
        gg = false;
        for (int i = 0; i < 5; i++) {
            Soldier p = new Soldier(2*i,3,true);
            Soldier q = new Soldier(2*i,6,false);
            red.addElement(p);
            black.addElement(q);
        }
        for (int i = 0; i < 2; i++) {
            Chariot a = new Chariot(6*i+1,2,true);
            Chariot b = new Chariot(6*i+1,7,false);
            red.addElement(a);
            black.addElement(b);
        }
    }
}
