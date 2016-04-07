public class Chariot extends Piece
  public Soldier(int x_init, int y_init, bool colour_set) {
    x = x_init;
    y = y_init;
    colour = colour-set;
    
  bool valid_move(int x_dest, int y_dest)
  //check array to see if x,y is occupied
  //assume the x,y position is free
  
  //check for: colour,board boundaries, valid piece movement
  //advanced: check if entering line of fire
    if(x_dest < x_boundary_left or 
      x_dest > x_boundary_right or 
      y_dest < y_boundary_bot or 
      y_dest > y_boundary_top) {
      return false;
    else {
    
      if(y_dest == y) {
        for(int spots_x = Math.max(x_dest,x);spots_x < Math.max(x_dest,x); spots_x++){
          // check if there are pieces in between on each spot
          if spots_x - occupied {
            return false;
          }
        }
        return true;
      }
      else if(x_dest == x) {
        for(int spots_y = Math.max(y_dest,y);spots_y < Math.max(y_dest,y); spots_y++){
          // check if there are pieces in between on each spot
          if spots_y - occupied {
            return false; 
          }
        }
        return true;
     }
     else return false;
