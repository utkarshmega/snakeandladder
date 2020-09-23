package snakeandladder;

import java.util.Random;
public class snakeandladder {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int dice = rnd.nextInt(6) + 1;
		
		System.out.println("Number on dice = "+dice);
	}
	
}