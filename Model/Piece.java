//do your superclass code here

public abstract class Piece {
  int x;
  int y;
  bool colour; //red = true
  abstract int make_move(int x_dest, int y_dest);
}
