import java.util.Scanner;
public class DrinkDrive{
public static void main(String [] args){

  Scanner scan = new Scanner(System.in);
  int age = scan.nextInt();

  if(age >= 21)
    System.out.println("Can Drink and Drive");
    else if(age >=17 && age<=21)
    System.out.println("Can Drive but Not Drink");
    else
    System.out.println("Can't Drive or Drive");



}
  }
