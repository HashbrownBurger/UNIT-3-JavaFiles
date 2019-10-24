
import java.util.Scanner;

public class Multiples{
  public static void main(String[] args){
    boolean running = true;


    while(running){
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert a max");
    int max = scan.nextInt();
    boolean run = false;
    int num = 1;

          if(max <= 0)
          System.out.println("Max can't be negative or 0. Re-enter a max");
          else{
          System.out.println("Insert a multiple");
          int multiple = scan.nextInt();

           if(multiple <= 0)
          System.out.println("multiple can't be negative or 0");

        else if(max < multiple)
              System.out.println("Multipe must be less than max");
          else run = true;

          if(run){
          for(int i = 1; i <= max; i++){
          if(i % multiple == 0){
            if(num < 5){
            System.out.print(i + " ");
            num++;
          }
            else{
            System.out.println(i + " ");
            num = 1;
          }
          }
}
running = false;
}

  }
}
}
}
