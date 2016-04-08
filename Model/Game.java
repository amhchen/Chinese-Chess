// dunno how you want to implement this, do whatever you think is best.
// should probably have a function is_occupied() since the array of pieces is stored here
// get each piece to call this function in their valid_move() when necessary

package gameapps.chinesechess;
import java.util.Vector;

/**
 * Created by Abel on 3/29/2016.
 */
public class Game {
    Vector red; //vector of Pieces
    Vector black; // vector of Pieces
    boolean gg;
    Controller c;
    public Game(Controller control) {
        gg = false;
        c = control;
        for (int i = 0; i < 5; i++) {
            Soldier p = new Soldier(2*i,3,true);
            Soldier q = new Soldier(2*i,6,false);
            red.addElement(p);
            black.addElement(q);
        }
        for (int i = 0; i < 2; i++) {
            Cannon a = new Cannon(6*i+1,2,true);
            Cannon b = new Cannon(6*i+1,7,false);

            Horse c = new Horse(6*i+1,0,true);
            Horse d = new Horse(6*i+1,9,false);

            Chariot e = new Chariot(8*i,0,true);
            Chariot f= new Chariot(8*i,9,false);

            Elephant g = new Elephant(4*i+2,0,true);
            Elephant h = new Elephant(4*i+2,9,false);

            Advisor j = new Advisor(3*i+2,0,true);
            Advisor k = new Advisor(3*i+2,9,false);
            
            red.addElement(a);
            red.addElement(c);
            red.addElement(e);
            red.addElement(g);
            red.addElement(j);
            black.addElement(b);
            black.addElement(d);
            black.addElement(f);
            black.addElement(h);
            black.addElement(k);
        }
    }
    
    public String is_occupied(int x_coord, int y_coord) {
        for (int i = 0; i < red.length(); i++) {
            if (red[i].x == x_coord && red[i].y == y_coord) {
                return "red";
            }
        }
        for (int i = 0; i < black.length(); i++) {
            if (black[i].x == x_coord && black[i].y == y_coord) {
                return "black";
            }
        }
        return "free";
    }
    
}
