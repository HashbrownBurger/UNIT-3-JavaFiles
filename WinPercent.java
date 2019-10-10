import java.util.Scanner;
public class WinPercent{
public static void main(String[]args){

  double SetGo = 0.0;

  while (SetGo == 0.0){
  System.out.println("Enter games played and number of wins");
  Scanner scan = new Scanner(System.in);
  double GamesPlayed = scan.nextInt();
  double GamesWon = scan.nextInt();

    if(GamesPlayed < GamesWon)
      System.out.println("Can't have more wins than games");
      else if(GamesPlayed <= 0 && GamesWon < 0)
        System.out.println("Games and/or wins can't be less than 0");
        else
        SetGo++;

        while (SetGo == 1.0){
    double WinPercent = ((GamesWon/GamesPlayed)*100);
    System.out.println("You Won " + WinPercent + " Percent of Games");
    SetGo++;
}
}
}
}
