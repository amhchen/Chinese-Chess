package gameapps.chinesechess;

public class Chariot extends Piece {
    public Chariot(int x_init, int y_init, String colour_set, Game current) {
        x = x_init;
        y = y_init;
        colour = colour_set;
        g = current;
    }

    boolean valid_move(int x_dest, int y_dest) {
        //check array to see if x,y is occupied
        //assume the x,y position is free

        //check for: colour,board boundaries, valid piece movement
        //advanced: check if entering line of fire
        if (x_dest < 0 || x_dest > 8
                || y_dest < 0 || y_dest > 9) {
            return false;
        } else {

            if (y_dest == y) {
                for (int spots_x = Math.max(x_dest, x); spots_x < Math.max(x_dest, x); spots_x++) {
                    // check if there are pieces in between on each spot
                    if (g.is_occupied(spots_x, y) != "free") {
                        return false;
                    }
                }
                return true;
            } else if (x_dest == x) {
                for (int spots_y = Math.max(y_dest, y); spots_y < Math.max(y_dest, y); spots_y++) {
                    // check if there are pieces in between on each spot
                    if (g.is_occupied(x, spots_y) != "free") {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }
}