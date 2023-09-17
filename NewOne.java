import java.util.Random;
import java.util.Scanner;

public class NewOne {

	public static void main(String[] args){
		// TODO Auto-generated method stub
Random r = new Random();
Random f = new Random();
Scanner in = new Scanner(System.in);
String playagain;

do {
	System.out.println("throwing the dice");
	System.out.println(r.nextInt(6)+ 1);
	System.out.println("throw another dice");
	System.out.println(f.nextInt(6)+ 1);
	System.out.println("playagain (y/n)");
	playagain = in.nextLine();
	
} while (playagain.equals("y"));
	
}
}