import java.util.Scanner;
public class GuessMy {
   public static void main(String[] args) {
    int numbertoguess=(int)
    (Math.random()*100)+1;
    int userguess=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Guess a number between 1 and 100:");
    while (userguess!=numbertoguess) {
      System.out.println("enter your guess:");
      userguess=scanner.nextInt();
      if(userguess<numbertoguess){
        System.out.println("too low! try again .");

      }
      else if(userguess>numbertoguess){
        System.out.println("too high! try again.");
      }else{
        System.out.println("congratulations! you guessed the number.");

      }
    }
    scanner.close();
  }
}