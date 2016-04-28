package gameapps.chinesechess;

public class General extends Piece {
	public General(int x_init, int y_init, String colour_set, Game current){
		x = x_init;
		y = y_init;
		colour = colour_set;
	}

	boolean valid_move(int x_dest, int y_dest){
		int y_max = 2;
		int y_min = 0;
		
		if(colour == "black"){
			y_max = 9;
			y_min = 7;
		}
		
		
		if((x_dest >= 3)&&(x_dest <= 5)&&(y_dest >= y_min)&&(y_dest <= y_max)){
			if(((abs(x_dest - x_init)) > 1)||((abs(y_Dest - y_init)) > 1)){
				return false;
			}
			else{
				if((abs(x_dest - x_init)) == 1)&&((y_dest - y_init) != 0)||((abs(y_dest - y_init)) == 1)&&((x_dest - x_init) != 0)){
					return false;
				}
				else{
					if(is_occupied(x_dest,y_dest) == colour){
						//so it is occupied by ally
						return false;
					}
					else{
						//insert if in the line of fire, then invalid
						return true;
					}
				}
			}
		}
		else{
			return false;
		}
	}
	boolean make_move(int x_dest, int y_dest) {
        	if (valid_move(x_dest,y_dest)) {
            		x = x_dest;
            		y = y_dest;
            		return true;
        	}
        	return false;
	}
}
