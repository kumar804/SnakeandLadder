package Snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to SnakeAndLadder");
		
		//Printing player position UC1
		int position = 0;
		System.out.println("The player Position is:-" + position);
		
		//added dice roll UC2
		int diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
		System.out.println("Dice Roll: " + diceRoll);
		position = position + diceRoll;
		System.out.println("New Position of Player is: " + position);
	}

}
