import java.util.Random;
import java.util.Scanner;
public class JAWPROJECT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("throwig a dice!");
		Random r = new Random();
		Scanner in = new Scanner(System.in);
        String playagain;
       do { 
    	   System.out.println("throwing a dice!");
    	   System.out.println(r.nextInt(7)+1);
    	   System.out.println("playagain(y/n)?");
    	   playagain = in.nextLine();
    	   
    	   
    	   
	} while(playagain.equals("y"));
	}
}
