import java.util.*;
import java.io.*;

/**
 * GamePlay is the class driver for the GameWord class and carries out all the functions of the Hangman game.
 * The java.io.* and java.util.* packages are called above so that their methods can be used below.
 * 
 * @author Samuel Phillips
 * @version 10/13/18; FALL2018 ITSC 1213-002
 */
public class GamePlay
{
   public static void main(String[ ] args) throws IOException
   {
       //local variables and objects are called before the execution
       String filename = new String();
       String phrase = new String();
       
       // a guess primitive variable is stated for the used array
       char guess;
       // a new scanner object is created to be used for when a new character is entered by the player each round
       Scanner in = new Scanner(System.in);
       // a new scanner object called choiceIn is created to be used for the user to input a specific category
       Scanner choiceIn = new Scanner(System.in);
       // primitive variable choice is stated to be used when choosing the category below
       char choice;
       
       // a do/while loop is used to prompt the user if they want to go again, creating an infinite loop if 'o' or 'O' is typed
       do {
       // the used array is stated in the do/while loop so that each preceding time the game is restarted,
       // the array values are reset to null values
       boolean [ ] used = new boolean[255];
       
       //statement stated to give the player choices on what kind of random words will be used as the hangman secret phrase
       System.out.println("Choose a category of phrases to guess: " + 
                        "\n A: Music Genres" + 
                        "\n B: Video Game Genres" + 
                        "\n C: Top 20 Ranking Men's National Soccer Teams in the World" + 
                        "\n D: Types of Sports" +
                        "\n E: Ye Olde Language");
       
       // the primitive variable choice is equal to the next character the user inputs via the choiceIn scanner
       choice = choiceIn.next().charAt(0);   
       
       // many if statements are used based on what category the player chooses
       // one a letter category is typed, the filename variable will change to the desired .txt file name
       if (choice == 'a' || choice == 'A') {
           filename = "MusicGenres.TXT";
           
        } else if (choice == 'b' || choice == 'B') {
            filename = "GameTypes.TXT";
            
        } else if (choice == 'c' || choice == 'C') {
           filename = "TopSoccer.TXT";
           
        } else if (choice == 'd' || choice == 'D') {
           filename = "SportsTypes.TXT";
           
        } else if (choice == 'e' || choice == 'E') {
           filename = "YeOldeWords.TXT";
           
       // if an incorrect character is entered, then the player will be given an error
       // and will then need to close and then reopen the program
        } else {
            System.out.println("Error: you have typed a wrong choice, please close and then load the program once more to try again.");
            break;
        }
       
       // a new scanner object is created with the parameter being the desired category .txt file name chosen above
       // this scanner class opens up the file for it to be read by the program
       Scanner input = new Scanner(new File(filename));
       
       // a random object called num is created
       Random num = new Random();
       // a primitive variable x is created and the num object is used to generate a random number from 1 to 20
       int x = num.nextInt(20) +1;
       
       // a random phrase is chosen via these various if statements
       // the farther down a number is, the more phrases the statements cycle 
       // through until it gets to the right line and sets it equal to phrase
        if (x == 1) {
            phrase = input.nextLine();
        } else if (x == 2) {
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 3) {
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        }  else if (x == 4) {
            input.nextLine();
            input.nextLine();
            input.nextLine(); 
            phrase = input.nextLine();
        }  else if (x == 5) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine(); 
        }  else if (x == 6) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        }  else if (x == 7) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        }  else if (x == 8) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        }  else if (x == 9) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 10) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 11) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 12) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 13) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 14) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 15) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 16) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();   
        } else if (x == 17) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 18) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 19) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();
        } else if (x == 20) {
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            input.nextLine();
            phrase = input.nextLine();       
        }
       
       // the gameword constructor is called here, using the edited phrase from above
       GameWord myPhrase = new GameWord(phrase);
       
       // the hangman game starts with the randomly chosen phrase from above being converted to a string and
       // having all its charactersreplaced with '_'s to start off the guessing game
       System.out.println("\n" + myPhrase.toString( ));
       
       // a while loop is used to check up on the hangmang game at the end of each turn by
       // checking whether there is no game over and there is no check win
       while(!myPhrase.checkWin( ) && ! myPhrase.getGameOver( ))
       {
        
        // do/while statement is used to print out a statement stating for the player to enter
        // a character they want to guess, with the character being entered via the in scanner object and being equale to
        // the primitive variable guess
         do{
           System.out.print("\nEnter your character: ");
           guess = in.nextLine( ).charAt(0);
        // a if statement with a parameter of the used array from above is used make sure whether a previously entered character
        // was entered again
        // if so, then the player will be prompted with a statement
           if(used[guess]) { 
           System.out.println("That letter already guessed.");
        }
        }while (used[guess]);
        
        // the used array with the primitive character guess variable is set to true if the guess was correct
         used[guess] = true;
        // the find method from the GameWord class is calle to make sure that the previous guess was actually correct
         myPhrase.find(guess);
        // the while loop starts all over with myPhrase updating and being stated in a statement
         System.out.println("\n" + myPhrase.toString( ));
       }
       
       // an if statement is used to see if the player has correctly guessed the word
       // if the player has, then he/she will be presented with a winner message and
       // will be prompted if they want to go again or if they want to quit
       if(myPhrase.checkWin( ))
       {
         System.out.println("\nYou got it! Thank you player, very cool!");
         System.out.println("\nWant to play again?" + "\nType 'o' or 'O' without quotations to play again " +
                            "\nor Type 's' or 'S' if you want to stop playing: ");
         // if the statement is 'o' or 'O', then the game restarts
         // if the statement is 's' or 'S', or anything other than 'o' or 'O', then the program ends
         choice = choiceIn.next().charAt(0);
       }
       
       // an if statement used to see if the player has reached the max amount of wrong guesses
       // if the player has, then he/she will be presented with a game over message and
       // will be prompted if they want to go again or if they want to quit
       if(!myPhrase.checkWin())
       {
       System.out.println("Game Over");  
       System.out.println("\nThe answer was actually: " + phrase); 
       System.out.println("\nWant to try again?" + "\nType 'o' or 'O' without quotations to do so " +
                          "\nor Type 's' or 'S' if you want to stop playing: ");
       // if the statement is 'o' or 'O', then the game restarts
       // if the statement is 's' or 'S', or anything other than 'o' or 'O', then the program ends
       choice = choiceIn.next().charAt(0);
       }
       
       // the file is then closed with the scanner being closed
       input.close();
   } while (choice == 'o' || choice == 'O');
   
  
}
}


