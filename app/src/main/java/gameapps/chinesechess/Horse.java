package gameapps.chinesechess;

public class Horse extends Piece {
    public Horse(int x_init, int y_init, String col_set,Game current) {
        x = x_init;
        y = y_init;
        colour = col_set;
        g = current;
    }
    //@override
    boolean valid_move(int x_dest, int y_dest) {
        if (0 <= x_dest && x_dest <= 8
                && 0 <= y_dest && y_dest <= 9) {
            if (g.is_occupied(x_dest,y_dest) != colour) {
                int x_length = x - x_dest;
                int y_length = y = y_dest;
                if (Math.abs(x_length) == 1 && Math.abs(y_length) == 2) {
                    if (g.is_occupied(x, y + (y_length/2)) == "free") {
                        return true;
                    }
                }
                else if (Math.abs(x_length) == 2 && Math.abs(y_length) == 1) {
                    if (g.is_occupied(x + (x_length/2), y) == "free") {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //@override
    boolean make_move(int x_dest, int y_dest) {
        if (valid_move(x_dest,y_dest)) {
            x = x_dest;
            y = y_dest;
            return true;
        }
        return false;
    }
}