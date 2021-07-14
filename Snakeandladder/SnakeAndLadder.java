package Snakeandladder;

public class SnakeAndLadder {
	
	static int option = 0;
	static int option2 = 0;
	static int position1 = 0;
	static int position2 = 0;
	static int numDiceRolls = 0;

	public static int player1 ()
	{
		int diceRoll = 0;

		System.out.println("PLAYER 1's CHANCE");
		diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
		numDiceRolls++;
		System.out.println("DICE ROLLED FOR PLAYER 1 AND YOU HAVE: " + diceRoll);

		option = (int) (Math.floor(Math.random() * 10 ) % 3 + 1);
		switch (option)
		{
			case 1:
				System.out.println("PLAYER 1 HAS PASSED HIS CHANCE!!");
				System.out.println("Position of player 1 after Pass: " + position1);
				break;
			case 2:
				System.out.println("PLAYER 1 GOT A LADDER!!");
				if ((position1 + diceRoll) > 100)
				{
					position1 = position1 - diceRoll;
					break;
				}
				else
				{
					position1 = position1 + diceRoll;
					System.out.println("Position of player 1 after Ladder: " + position1);
					break;
				}
			case 3:
				System.out.println("PLAYER 1 GOT A SNAKE!!");
				position1 = position1 - diceRoll;
				if (position1 < 0)
				{
					position1 = 0;
				}
				System.out.println("Position of player 1  after Snake: " + position1);
				break;
		}
		if (position1 == 100)
		{
			System.out.println("Player 1 has won !!");
			System.out.println("Total Dice Rolls = " + numDiceRolls);
			System.exit(0);
		}
		return diceRoll;
	}


	public static int player2 ()
	{
		int diceRoll = 0;
		System.out.println("PLAYER 2's CHANCE");
		diceRoll = (int) (Math.floor(Math.random() * 10 ) % 6 + 1);
		numDiceRolls++;

		System.out.println("DICE ROLLED FOR PLAYER 2 AND YOU HAVE: " + diceRoll);
		option2 = (int) (Math.floor(Math.random() * 10 ) % 3 + 1);
		switch (option2)
		{
			case 1:
				System.out.println("PLAYER 2 HAS PASSED HIS CHANCE!!");
				System.out.println("Position of player 2 after Pass: " + position2);
				break;
			case 2:
				System.out.println("PLAYER 2 GOT A LADDER!!");
				if ((position2 + diceRoll) > 100)
				{
					position2 = position2 - diceRoll;
					break;
				}
				else
				{
					position2 = position2 + diceRoll;
					System.out.println("Position of player 2 after Ladder: " + position2);
					break;
				}
			case 3:
				System.out.println("PLAYER 2 GOT A SNAKE!!");
				position2 = position2 - diceRoll;
				if (position2 < 0)
				{
					position2 = 0;
				}
				System.out.println("Position of player 2 after Snake: " + position2);
				break;
		}
		if (position2 == 100)
		{
			System.out.println("Player 2 has Won !!");
			System.out.println("Total Dice Rolls = " + numDiceRolls);
			System.exit(0);
		}
		return diceRoll;
	}


	public static void main (String[] args)
	{
		System.out.println("WELCOME TO THE SNAKE AND LADDER GAME!!");
		while  (position2 < 100 && position1 < 100)
		{
			player1();
			if (option == 1)
			{
				player2();
			}
			else if (option == 2)
			{
				player1();
			}
			else if (option == 3)
			{
				player2();
			}
			else if (option2 == 1)
			{
				player1();
			}
			else if (option2 == 2)
			{
				player2();
			}
			else if (option2 == 3)
      	{
         	player1();
      	}
		}
	}
}