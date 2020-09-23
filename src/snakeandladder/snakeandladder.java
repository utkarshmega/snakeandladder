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
		//System.out.println("Number on dice = "+dice);
		while(pos<=100)
		{
			int play = rnd.nextInt(3);
			
			if(play != noplay) {
				if(play==ladder)
				{
					pos += dice;
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
		System.out.println("The player reached the position 100 and won");
		
	}
	
}