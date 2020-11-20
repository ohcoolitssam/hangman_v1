import java.lang.*;

 /**
  * This class file is used to set up values and methods that will be used in the driver called "GamePlay."
  * The java.lang.* package is stated above so that the various methods from it can be used below.
  * 
  * @author Samuel Phillips
  * @version 10/13/18; FALL2018 ITSC 1213-002
  */
 public class GameWord
 {
   // fields used in methods below are stated here & are used as private so
   // their values can not be changed outside of the GameWord class
   private String phrase;
   private StringBuilder inProgress;
   private int numberWrongGuesses;
   private StringBuilder state;
   private boolean gameOver;
   String filename;
   char choice;
   
   /**
    * No-args constructor method that sets all values to null or zero.
    **/
   public GameWord( )
   {
       // inProgress StringBuilder object is created
       // as well as a phrase String object
       inProgress = new StringBuilder( );
       phrase = new String( );
       // the numberWrongGuesses field is given a value here
       numberWrongGuesses = 0;
       // a state StringBuilder object is created
       state = new StringBuilder( );
       // the gameOver primitive variable stated in the fields is given a value here, showing that the game is not over
       gameOver = false;
    }
    
   /**
    * Constructor that sets values when the phraseToGuess parameter is put in play.
    **/
    public GameWord(String phraseToGuess)
    {
        // phrase, state, and inProgress objects are created
        phrase = new String(phraseToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        // a for loop to set a certain amount of '_' depending on the length of the phrase
        for(int k = 0; k < phrase.length( ); k++)
        {
            inProgress.append( "_ ");
        }
        // the numberWrongGuesses field is given a value here
        numberWrongGuesses = 0;
        // the gameOver primitive variable stated in the fields is given a value here, showing that the game is not over
        gameOver = false;
    }
    
   /**
    * Mutator method that sets a new phrase by changing phraseToGuess.
    **/
    public void setPhrase(String phraseToGuess)
    {
        // phrase, state, and inProgress objects are created
        phrase = new String(phraseToGuess);
        state = new StringBuilder( );
        inProgress = new StringBuilder( );
        // a for loop that takes the new phrases length and sets a certain amount of '_' in inProgress depending on that length
        for(int k = 0; k < phrase.length( ); k++)
        {
            inProgress.append( "_");
        }
        // numberWrongGuesses value is declared
        numberWrongGuesses = 0;
        // state is updated
        state = new StringBuilder( );
        // gameOver field is declared, showing that the game is not over
        gameOver = false;
    }
    
   /**
    * Accessor method that checks to see if you have lost, and then returns the gameOver value to ensure that 
    * the game is over.
    **/
    public boolean getGameOver( )
    {
        // an if statement is used to see if the numberWrongGuesses is greater than 7
        // if it is greater than 7, then the gameOver will be true and the game will end as gameOver is returned
        if (numberWrongGuesses > 7)
        {
            
        gameOver = true;
    }
     return gameOver;
    }
    
   /**
    * Method used to find certain characters typed.
    * If the found character is correct, then the numberWrongGuesses will not increase.
    * However, if the found character is incorrect, then the numberWrongGuesses will increase.
    **/
    public void find(char symbol)
    {
        // primitive variables count and pos are stated below
        int count = 0;
        int pos = 0;
        // pos is equaled to the index of a certain letter on the phrase
        pos = phrase.indexOf(symbol);
        // a while loop is used to cycle through all the letters on the phrase
        while(pos != -1)
        { 
          count++;
          inProgress.setCharAt(pos*2,symbol);
          pos = phrase.indexOf(symbol, pos + 1);;
        }
        // an if statement is used when the count does not increment, indicating that a wrong letter was guessed
        // thus making the numberWrongGuesses variable increase and then the state is updated
        if(count == 0)
        {
            numberWrongGuesses++;
            updateState( );
        }
    }
    
   /**
    * Method used to check and see if all the letters of the inProgress sentence/word have been changed to the likes of the phrase's letters.
    * Once all the letters of inProgress are the exact same of the phrase's, then the match is made true and the player has won. 
    **/
    public boolean checkWin( )
   {
      // primitive value used to show if the inProgress sentence/word matches the phrase sentence/word
      boolean match = true;
      
      // a for loop is used to cycle through all the letters of inProgress
      for (int i = 0; i < inProgress.length(); i++)
      {
          // an if statement is used to make sure that there are no '_' characters left in the inProgress sentence/word
          // if there is, then match will be made false and the game will continue until the number of wrong guesses reaches 7
          // if the inProgress sentence/word does not have any '_' characters and equals the phrase, then the match will be true
          // and the player will win
          // in the end, the match variable is returned
          if (inProgress.charAt(i) == '_')
          {
              match = false;
            } else if (inProgress.toString() == phrase)
            {
                match = true;
            }
         
      }
         return match;
   }
   
   /**
    * Method that updates the state of the hangman, after a certain number of wrong guesses are made.
    * Has a maximum of 7 wrong guesses before the player loses.
    **/
    private void updateState( )
    { 
      // a switch statement is used to precisely update the hangman according to the amount of wrong guesses
      // as each case increases, the number of wrong guesses increases, and so does the hangman until the full picture
      // is drawn and the gameOver variable is made true to show that the player has lost
       switch(numberWrongGuesses)
       {
           case 1: state.append("\n\t\t\t\t\t 0");
                   break;
           case 2: state.append( "\n\t\t\t\t       /");
                   break;
           case 3: state.append(" |");
                   break;
           case 4: state.append( " \\");
                   break;
           case 5: state.append("\n\t\t\t\t         |");
                   break;
           case 6: state.append("\n\t\t\t\t        /");
                   break;
           case 7: state.append(" \\\n\n\t\t\t\t      OH NO!!\n");
                   gameOver = true;
                   
        
      }
      
   }
  
   /**
    * Method that updates the inProgress StringBuilder, along with the state and a line to separate the turns of the game.
    **/
   public String toString(  )
  {
      // an updated inProgress and state is returned at the end of each turn, along with a line that separates each turn
      return new String("\n***************************************\n" 
            + inProgress + "\n" + state.toString( ));
  }
 
}