# Chinese-Chess
Ancient chinese board game

We're using these naming conventions:

-MAKE VARIABLE AND FUNCTION NAMES SELF-DESCRIPTIVE

-use the underscore naming convention (func_number_one isntead of FuncNumberOne)

-pls pls pls comment your code

-if possible start java files with a capital letter


Pieces:
Soldier (equiv to pawn in western chess)

Chariot (ie rook)

Horse (ie knight)

Elephant (ie bishop)

Advisor (the guys who stay in the box w/ general)

General (ie king)

Cannon (the guys who jump over pieces to capture)


broad outline for a piece ctor:
public Piece(int x_init, int y_init, String col_set, Game current) { //NOTE: COLOUR IS NOW A STRING

  x = x_init;
  
  y = y_init;
  
  colour = col_set;
  
  g = current;
  
}

To get to the java files, navigate to: app/src/main/java/gameapps/chinesechess

Java File Descriptions:

main.java - java file for the start screen

Board.java - the 'wrapper' file for initializing controller

Controller.java - houses the controller class

Piece.java - superclass Piece (should be abstract)

Soldier.java

Chariot.java

Horse.java

Elephant.java

Advisor.java

General.java

Cannon.java

the XML files are for the graphics stuff
