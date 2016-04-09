package gameapps.chinesechess;
public class Elephant extends Piece {
    public Elephant(int x_init, int y_init, String col_set, Game current) {
        x = x_init;
        y = y_init;
        colour = col_set;
        g = current;
    }
    boolean valid_move(int x_dest, int y_dest) {
        int y_min = 0;
        int y_max = 4;
        if (colour == "black") {
            y_min = 5;
            y_max = 9;
        }
        if (0 <= x_dest && x_dest <= 8 &&
                y_min <= y_dest && y_dest <= y_max) {
            if (g.is_occupied(x_dest,y_dest) != colour) {
                int x_length = x - x_dest;
                int y_length = y - y_dest;
                if (Math.abs(x_length) == 2 && Math.abs(y_length) == 2) {
                    if (g.is_occupied(x + (x_length/2), y + (y_length/2)) == "free") {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //@override
    public boolean make_move(int x_dest, int y_dest) {
        if (valid_move(x_dest,y_dest)) {
            x = x_dest;
            y = y_dest;
            return true;
        }
        return false;
    }
}