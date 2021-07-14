package Snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to SnakeAndLadder");
		
		//Printing player position UC1
		int position = 0;
		int diceRoll = 0;
		int numDiceRolls = 0;
		System.out.println("The player Position is:-" + position);
		
		while (position <= 100) {
			int win = 100;
			if (position < 0)
			{
				position = 0;
			}
			
		
		//added dice roll UC2
		 diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
		System.out.println("DICE ROLLED AND YOU HAVE: " + diceRoll);
		position = position + diceRoll;
		System.out.println("New Position of Player is: " + position);
		
		//random check
		int option = (int) (Math.floor(Math.random() * 10 ) % 3 + 1);
		switch (option) {
		
		case 1:
			System.out.println("PLAYER HAS PASSED HIS CHANCE");
			System.out.println("POSITION AFTER PASS: " + position);
			break;
		case 2:
			System.out.println("PLAYER GOT A LADDER!!");
			if ((position + diceRoll) > win)
			{
				position = position - diceRoll;
				break;
			}
			else
			{
				position = position + diceRoll;
				System.out.println("POSITION AFTER LADDER: " + position);
				break;
			}
		case 3:
			System.out.println("PLAYER GOT A SNAKE");
			position = position - diceRoll;
			System.out.println("POSITION AFTER SNAKE: " + position);
			break;
		
		}
	}
		System.out.println("Total number of Dice Rolls required to win is: " + numDiceRolls);
}
	}
