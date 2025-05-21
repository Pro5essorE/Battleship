/*
 * This class represents a game of Battleship. It contains the 
 *
 * Code written by Toryn Bieri & Ethan Benzaquen. (Maybe we should have some sort of indicator that shows who certain parts of code were written by?)
 */

import java.util.*;
//Insert other imports here when we figure out what we will need.

public class GameManager{

   //Contains a boolean variable that represents whether or not the game is running.
   private boolean gameRunning;
   
   //Contains either the player1 or player2 object, depending on whose turn it is supposed to be. Probably will only be used in the switchTurns method.
   private Player currentPlayer; //Maybe we could change it to String or int instead?
   
   private Player player1; 
   
   private Player player2;
   
   private Display gameDisplay;
   
   /*
    * Creates a new instance of a GameManager object, updating the instance variables by using the objects in the parameters.
    *
    * @param player1 The first player that will be participating in the game.
    * @param player2 The second player that will be participating in the game.
    * @param display The window where Battleship will be played.
    */
   public GameManager(Player player1, Player player2, Display display){
      gameRunning = false;
      
      this.player1 = player1;
      this.player2 = player2;
      
      currentPlayer = player1;
      
      gameDisplay = display;
   }
   
   
   /*
    * Updates the currentPlayer object, so that it is the same as the player whose turn it is supposed to be.
    */
   public void switchTurns(){
      if(currentPlayer.equals(player1)){
         currentPlayer = player2;
      }
      else{
         currentPlayer = player1;
      }
   }
   
   private void hitPos(){
      
   }
   
   /*
    * Starts the game of Battleship.
    */
   public void startGame(){
      gameRunning = true;
   }


}
