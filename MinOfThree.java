import java.util.Scanner;
public class MinOfThree{
public static void main(String [] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Input Three Intigers");
  int num1 = scan.nextInt();
  int num2 = scan.nextInt();
  int num3 = scan.nextInt();

  if(num1 <= num2 && num1 <= num3)
    System.out.print(num1 + " ");
  if(num2 <= num1 && num2 <= num3)
    System.out.print(num2 + " ");
  if(num3 <= num2 && num3 <= num1)
    System.out.print(num3 + " ");







}
}
