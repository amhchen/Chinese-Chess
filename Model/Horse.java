//example horse class

public class Horse extends Piece {
  public Horse(int x_init, int y_init, String col_set) {
    x = x_init;
    y = y_init;
    colour = col_set;
  }
  @override
  bool valid_move(int x_dest, int y_dest) {
     if (is_occupied(x_dest,y_dest) != colour) {
       int x_length = x - x_dest;
       int y_length = y = y_dest;
       if (abs(x_length) == 1 &&abs(y_length) == 2) {
         if (is_occupied(x, y + (y_length/2)) != colour) {
           return true;
         }
        else if (abs(x_length) == 2 && abs(y_length) == 1) {
          if (is_occupied(x + (x_length/2), y) != colour) {
            return true;
          }
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
