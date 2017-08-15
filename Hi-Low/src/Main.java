import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//new WB();
		//new MainScreen();
		
		
		Scanner keyboard = new Scanner(System.in);
		String answer; 
		
		Random r = new Random();
		int next;
		int previous=0;
		int counter=0;
		boolean lose=false;
		do{
			do{
			next=Math.abs((r.nextInt() % 10));
			}while(previous==next);
			System.out.println("****************");
			System.out.println("Previous: "+previous);
			System.out.println("Higher or Lower?");
			answer = keyboard.next();
			
			if(answer.equals("h")&& previous<next){
				System.out.println("win");
			}
			else if(answer.equals("h") && previous>next){
				System.out.println("lose");
				System.out.println("it was " + next);
				lose=true;
			}
			else if(answer.equals("l") && previous>next){
				System.out.println("win");
			}
			else if(answer.equals("l") && previous<next){
				System.out.println("lose");
				System.out.println("It was: " + next);
				lose=true;
			}
			
			
			previous=next;
			counter++;
		}while(!lose);

		keyboard.close();
		System.out.println("GAME OVER");
		
		
	}

}
