import java.util.Scanner;
public class ThePlusBlock {
     public static void main(String[] args){
          int width, height, blockWidth, blockHeight;
          System.out.println("Please enter a width for the block: ");
          Scanner scan = new Scanner(System.in);
          width = scan.nextInt();
          System.out.println("Please enter a height for the block: ");
          height = scan.nextInt();

          for(blockWidth= 1; blockWidth <= width; blockWidth++){
               for(blockHeight = 1; blockHeight <= height; blockHeight++){
                    if((blockWidth == width / 2) || (blockHeight == height/2)){
                    System.out.print(" ");
                    }
                    else
                         {
                              System.out.print("#");
                              System.out.print("#");
                         }
               }
               System.out.println("");
          }
          scan.close();
     }
}