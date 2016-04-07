public class Soldier extends Piece {
  bool crossed;
  public Soldier(int x_init, int y_init, bool colour_set) {
    x = x_init;
    y = y_init;
    colour = colour-set;
    crossed = false;
  }
  bool valid_move(int x_dest, int y_dest) {
  //check array to see if x,y is occupied
  //assume the x,y position is free
  
  //check for: colour,if crossed,board boundaries
  //advanced: check if entering line of fire
  if(colour) //red
    //boundaries (x: 0-8, y: 0-9)
    // river: y = 4,5
      if(x_dest < x_boundary_left or 
      x_dest > x_boundary_right or 
      y_dest < y_boundary_bot or 
      y_dest > y_boundary_top) {
        //something something x_boundary invalid
        return false;}
      else {
        //grid boundaries valid
        //check for river crossing later
        //checking forward movement
        if(((y_dest - y) == 1)&&(x_dest == x)){
          return true;} // my.x = 3 my.y = 4; make_move(4,7)
        else if(crossed){
            if(((x_dest - x) == 1)&&(y_dest == y)){
              return true;}}
        else return false;
      
  else { //black
    //code later
  
  };
  @override
  bool make_move(int x_dest, int y_dest) {
    if (valid_move(x_dest,y_dest)) {
    x = x_dest;
    y = y_dest;
      if(colour) {//red
        if(y_dest == 5)
          crossed = true;
      }
      else {
        if(y_dest == 4)
          crossed = true;
      }
    }
}


