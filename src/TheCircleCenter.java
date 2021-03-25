import java.util.Scanner;
public class TheCircleCenter {
     public static void main(String[] args){
          int width, height;
          int radius;
          System.out.println("Please enter a width for the block: ");
          Scanner scan = new Scanner(System.in);
          width = scan.nextInt();
          System.out.println("Please enter a height for the block: ");
          height = scan.nextInt();
          radius = width/4;



          for (width = -radius; width <= radius; width++){
               for (height = -radius; height <= radius; height++){
                    if (width*width + height*height <= (radius*radius)){
                         System.out.print("O ");
                    }
                    else{
                         System.out.print("# ");
                    }
               }
               System.out.println("");
               scan.close();
          }
    }
}
