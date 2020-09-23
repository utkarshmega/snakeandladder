package snakeandladder;

import java.util.Random;
public class snakeandladder {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int ladder = 1;
		int snake = 2;
		int noplay = 0;
		int pos = 0;
		int dice = rnd.nextInt(6) + 1;
		System.out.println("Number on dice = "+dice);
		int play = rnd.nextInt(3);
		
		if(play != noplay) {
			if(play==ladder)
				pos += dice;
			
			else if(play == snake)
				pos -= dice;
			
			System.out.println("New position = "+pos);
		}
		else 
			System.out.println("No play");
		
		
	}
	
}
