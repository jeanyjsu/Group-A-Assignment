import java.util.Scanner;

public class CircleCenterMirror {
     public static void main(String[] args) {
          int width, height, blockWidth, blockHeight;
          System.out.println("Please enter a width for the block: ");
          Scanner scan = new Scanner(System.in);
          width = (scan.nextInt()) / 2;
          System.out.println("Please enter a height for the block: ");
          height = (scan.nextInt()) / 2;
          for (blockWidth = 1; blockWidth <= width; blockWidth++) {
               for (blockHeight = 1; blockHeight == height; blockHeight--) {

                    System.out.print("#");
               }
               System.out.println("*");
          }
          scan.close();
     }
}
