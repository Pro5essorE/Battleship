/*
 * This class represents a game of Battleship. It contains the 
 *
 * Code written by Toryn Bieri & Ethan Benzaquen. (Maybe we should have some sort of indicator that shows who certain parts of code were written by?)
 */

import java.util.*;
import Player.*;
//Insert other imports here when we figure out what we will need.

public class GameManager{

   //Contains a boolean variable that represents whether or not the game is running.
   private boolean gameRunning;
   
   //Contains either the player1 or player2 object, depending on whose turn it is supposed to be. Probably will only be used in the switchTurns method.
   // private Player currentPlayer; //Maybe we could change it to String or int instead?
   
   private int currentTurn;
   
   private Player player1; 
   
   private Player player2;
   
//    private Display gameDisplay;

   private boolean isGameOver;
   
   private boolean isReady;
   
   
   
   /*
    * Creates a new instance of a GameManager object, updating the instance variables by using the objects in the parameters.
    *
    * @param player1 The first player that will be participating in the game.
    * @param player2 The second player that will be participating in the game.
    * @param display The window where Battleship will be played.
    */
   public GameManager(Player player1, Player player2){
      gameRunning = false;
      
      this.player1 = player1;
      this.player2 = player2;
      
      currentTurn = 1;      
//       gameDisplay = display; <-----Commented out because I (Toryn) currently do not have access to the display class yet!
   }
   
   
   /*
    * Updates the currentTurn variable, setting it to 1 or 2. If it was 1 (representative of player 1's turn) it becomes 2, and vice versa.
    */
   private void switchTurns(){
      if(currentTurn == 1){
         currentTurn = 2;
      }
      else{
         currentTurn = 1;
      }
   }
   
   
   private void SendHit(){
      
   }
   
   /*
    * Starts the game of Battleship.
    */
   public void startGame(){
      gameRunning = true;
      
      SendHit();
   }


}
