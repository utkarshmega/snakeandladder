package snakeandladder;

import java.util.Random;
public class snakeandladder {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int ladder = 1;
		int snake = 2;
		int noplay = 0;
		int pos = 0;
		int nooftimes = 0;
		//System.out.println("Number on dice = "+dice);
		while(pos!=100)
		{
			int dice = rnd.nextInt(6) + 1;
			int play = rnd.nextInt(3);
			nooftimes++;
			if(play != noplay) {
				if(play==ladder)
				{
					pos += dice;
					if(pos>100)
						pos -= dice ;
				}
				
				else if(play == snake)
				{
					pos -= dice;
					if(pos<0)
						pos = 0;
				}
				
				System.out.println("New position = "+pos);
			}
		}
		System.out.println("Number of times the dice was thrown is = "+nooftimes);
		System.out.println("The player reached the exact position 100 and won");
		
	}
	
}