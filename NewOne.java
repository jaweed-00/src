import java.util.Random;
import java.util.Scanner;

public class NewOne {

	public static void main(String[] args){
		// TODO Auto-generated method stub
Random r = new Random();
Random f = new Random();
Scanner in = new Scanner(System.in);
String playagain;
 //we ask the player to throw two dices  
do {
	System.out.println("throwing the dice");
	System.out.println(r.nextInt(6)+ 1);
	System.out.println("throw another dice");
	System.out.println(f.nextInt(6)+ 1);
	System.out.println("playagain (y/n)");
	playagain = in.nextLine();
	// the game can continue 
} while (playagain.equals("y"));
	if (playagain.equals("n")) {
		System.out.println("thank you for your playing");
	}
}
}