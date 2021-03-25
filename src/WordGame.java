import java.util.Scanner;
import java.util.Random;

public class WordGame
{
   public static void main (String[] args)
    {
         String newWord = "";
         int score = 0;
         String again = "y";
         Scanner scan = new Scanner(System.in);
         Random rand = new Random();
         Scanner word = new Scanner(System.in);
         
         while (again.equalsIgnoreCase("y"))
         {
              char letter ='a';
              letter = (char) (rand.nextInt(26) + 'a');
              String newLetter = String.valueOf(letter);
              System.out.println("Your Chosen letter is: " + letter);
              System.out.print("Write a word that begins with the chosen letter above: ");
              newWord = word.next().toLowerCase();
              
              if (newWord.startsWith(newLetter))
              {
                   for (int i = 0; i < newWord.length(); i++)
                   {
                        score += (int) (newWord.charAt(i));
                   }
                   
                   
                   System.out.println("Your score is: " + score);
              }
              else
              System.out.println("Your score is 0.\nYou did not begin your word with the chosen letter");
              
              System.out.print("Do you want to play again? type Y or N");
              again = scan.next();
              if (again.equalsIgnoreCase("y"))
              score = 0;
         }
         System.out.print("Game ended. Thank you for playing!");
    }
}
