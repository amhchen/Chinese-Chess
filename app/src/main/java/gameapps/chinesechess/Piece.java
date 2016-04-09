package gameapps.chinesechess;

/**
 * Created by Abel on 4/8/2016.
*/
public abstract class Piece {
    int x;
    int y;
    Game g;
    String colour; //red = true
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    abstract boolean valid_move(int x, int y);
    boolean make_move(int x_dest, int y_dest) {
        if (valid_move(x_dest,y_dest)) {
            x = x_dest;
            y = y_dest;
            return true;
        }
        return false;
    }
}