package gameapps.chinesechess;
import java.util.Vector;

/**
 * Created by Abel on 3/29/2016.
 */
public class Game {
    Controller c;
    Vector red; //vector of Pieces
    Vector black; // vector of Pieces
    boolean gg;
    public Game(Controller boss) {
        c = boss;
        reset_board();
    }

    public boolean game_over() {
        return gg;
    }

    public void reset_board() {
        gg = false;
        for (int i = 0; i < 5; i++) {
            Soldier p = new Soldier(2*i,3,"red",this);
            Soldier q = new Soldier(2*i,6,"black",this);
            red.addElement(p);
            black.addElement(q);
        }
        for (int i = 0; i < 2; i++) {
            Cannon a = new Cannon(6*i+1,2,"red",this);
            Cannon b = new Cannon(6*i+1,7,"black",this);

            Horse c = new Horse(6*i+1,0,"red",this);
            Horse d = new Horse(6*i+1,9,"black",this);

            Chariot e = new Chariot(8*i,0,"red",this);
            Chariot f= new Chariot(8*i,9,"black",this);

            Elephant g = new Elephant(4*i+2,0,"red",this);
            Elephant h = new Elephant(4*i+2,9,"black",this);

            Advisor j = new Advisor(3*i+2,0,"red",this);
            Advisor k = new Advisor(3*i+2,9,"black",this);
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
        General r = new General(0,4,"red",this);
        General bl = new General(9,4,"black",this);
        red.addElement(r);
        black.addElement(bl);
    }// end reset_board()

    public String is_occupied(int x_coord, int y_coord) {
        for (int i = 0; i < red.size(); i++) {
            Piece r = (Piece) red.get(i);
            if (r.getx() == x_coord && r.gety() == y_coord) {
                return "red";
            }
        }
        for (int i = 0; i < black.size(); i++) {
            Piece b = (Piece) red.get(i);
            if (b.getx() == x_coord && b.gety() == y_coord) {
                return "black";
            }
        }
        return "free";
    }

}
