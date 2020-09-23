package snakeandladder;

import java.util.Random;
public class snakeandladder {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int ladder = 1;
		int snake = 2;
		int noplay = 0;
		int player1pos = 0;
		int player2pos = 0;
		boolean player1 = true;
		
		//System.out.println("Number on dice = "+dice);
		
		while(player1pos!=100 && player2pos!=100)
		{
			if(player1)
			{
				int dice = rnd.nextInt(6) + 1;
				int play = rnd.nextInt(3);
				
				if(play != noplay) {
					if(play==ladder)
					{
						player1pos += dice;
						if(player1pos>100)
							player1pos -= 100;
					}
					
					else if(play == snake)
					{
						player1pos -= dice;
						if(player1pos<0)
							player1pos = 0;
					}
					player1 = false;
				}
				else
					player1 = false;
			}
			else
			{
				int dice = rnd.nextInt(6) + 1;
				int play = rnd.nextInt(3);
				
				if(play != noplay) {
					if(play==ladder)
					{
						player2pos += dice;
						if(player2pos>100)
							player2pos -= 100;
					}
					
					else if(play == snake)
					{
						player2pos -= dice;
						if(player2pos<0)
							player2pos = 0;
					}
					player1 = true;
				}
				else
					player1 = true;
			}
		}
		if(player1pos==100)
			System.out.println("The player1 reached the position 100 and won");
		else
			System.out.println("The player2 reached the position 100 and won");
		
	}
	
}