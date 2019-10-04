import java.util.Scanner;
public class Temp{
public static void main(String [] args){

  Scanner scan = new Scanner(System.in);
  int temp = scan.nextInt();

  if(temp>83)
    System.out.println("Hot");
    else if(temp<=83&&temp>=68)
    System.out.println("Ideal");
      else if(temp <= 67 && temp>= 45)
      System.out.println("Cool");
        else
        System.out.println("Cold");
      }
    }
