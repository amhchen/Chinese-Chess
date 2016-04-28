
public class Cannon extends Piece {
	
	public Cannon(int x_init, int y_init, String colour_set, Game current) {
		x = x_init;
		y = y_init;
		colour = colour_set;
  }
	bool valid_move(int x_dest, int y_dest) {
	//check array to see if x,y is occupied
	//assume the x,y position is free
  
	//check for: colour, valid move, capturing(hop)
	//advanced: check if entering line of fire
	//boundaries (x: 0-8, y: 0-9)
	if(x_dest < x_boundary_left or 
		x_dest > x_boundary_right or 
		y_dest < y_boundary_bot or 
		y_dest > y_boundary_top) {
		//beyond boundaries
		return false;}
	else {
		//grid boundaries valid
		//checking movement
		//check destination with is_occupied
		if((y_init == y_dest)&&(x_init == x_dest)){
			return false;
		}
		else if((y_dest != y_init)&&(x_dest != x_init)){
			return false;
		}
		else{
			if(is_occupied(x_dest,y_dest) == colour){
				return false;
			}
			else{
				int count = 0;
				if(x_init == x_dest){
					for(int i = Math.min(y_dest,y_init)+1; i < Math.max(y_dest,y_init); i++){
						if(is_occupied(x_dest,i) != "free"){
							count++;
							return false;
						}
					}
				}
					
				else{
					for(int i = Math.min(x_dest,x_init)+1; i < Math.max(x_dest,x_init); i++){
						if(is_occupied(i,y_dest) != "free"){
							count++;
							return false;
						}
					}
				}
				
				
				
				if((is_occupied(x_dest,y_dest) == "free")&&(count == 0)){
					return true;
				}
				if((is_occupied(x_dest,y_dest) != "free")&&(count == 1)){
					return true;
				}
				else{
					return false;
				}
			
			}
		}
	}
 
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
