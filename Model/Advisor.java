public class Advisor extends Piece {
  public Advisor(int x_init, int y_init, String col_set) {
    x = x_init;
    y = y_init;
    colour = col_set;
  }
  @override
  bool valid_move(int x_dest, int y_dest) {
    int y_min = 0;
    int y_max = 2;
    if (colour == "black") {
      y_min = 7;
      y_max = 9;
    }
    if (3 <= x_dest <= 5 && y_min <= y_dest <= y_max) {
     if (is_occupied(x_dest,y_dest) != colour) {
       int x_length = x - x_dest;
       int y_length = y - y_dest;
       if (abs(x_length) == 1 && abs(y_length) == 1) {
         return true;
       }
      }
    }
    return false;
  }
   
   @override
   bool make_move(int x_dest, int y_dest) {
     if (valid_move(x_dest,y_dest)) {
       x = x_dest;
       y = y_dest;
       return true;
     }
     return false;
  }
}
