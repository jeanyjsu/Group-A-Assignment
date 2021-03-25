import java.util.Scanner;
public class NumberTable {
     public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter a width: ");
          int widthOfTable = scan.nextInt();
          System.out.println("Now a height: ");
          int heightOfTable = scan.nextInt();

          Table table = new Table(widthOfTable, heightOfTable);


          for(int i = 0; i < heightOfTable; i++ ){
               for(int j = 0; j < widthOfTable; j++){
                    System.out.print(table.toString());
               }
               if(i % widthOfTable == 0 || i > 0){
                    System.out.println("|");
               }else{
                    System.out.print(table.toString());
               }
          }
          scan.close();
     }
}

