package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

	static List<Integer> list = new ArrayList<>();
	static List<Integer> playerPosition = new ArrayList<>();
	static List<Integer> cpuPosition= new ArrayList<>();

	public static void main(String[] args) {
		char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', ' ', '-', ' ', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', ' ', '-', ' ', '-' }, { ' ', '|', ' ', '|', ' ' } };
		while (true) {
			takeUserInput(gameBoard, "human");
			takeUserInput(gameBoard, "cpu");
			printGameBoard(gameBoard);
			checkResult();
		}
	}

	public static void takeUserInput(char[][] gameBoard, String user) {
		int position = 0;

		char ch = ' ';
		if (user.equalsIgnoreCase("human")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("please give a number input");
			position = sc.nextInt();
			ch = 'X';
			while (true) {
				if (!list.contains(position)) {
					list.add(position);
					playerPosition.add(position);
					break;
				} else {
					System.out.println("number is taken...give other input...");
					position = sc.nextInt();
				}
			}
		}
		else {
			ch = 'O';
			Random random = new Random();
			position = random.nextInt(1,9);
			while (true) {
				if(list.size()==9) {
					break;
				}
				if (!list.contains(position)) {
					list.add(position);
					cpuPosition.add(position);
					break;
				} else {
//					System.out.println("number is taken...give other input...");
					position = random.nextInt(1,9);
				}
			}
		}

		switch (position) {
		case 1:
			gameBoard[0][0] = ch;
			break;
		case 2:
			gameBoard[0][2] = ch;
			break;
		case 3:
			gameBoard[0][4] = ch;
			break;
		case 4:
			gameBoard[2][0] = ch;
			break;
		case 5:
			gameBoard[2][2] = ch;
			break;
		case 6:
			gameBoard[2][4] = ch;
			break;
		case 7:
			gameBoard[4][0] = ch;
			break;
		case 8:
			gameBoard[4][2] = ch;
			break;
		case 9:
			gameBoard[4][4] = ch;
			break;
		default:
			break;
		}
	}

	public static void printGameBoard(char[][] gameBoard) {
		for (char[] cs : gameBoard) {
			for (char ch : cs) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	static List<List> winning;
	static {
		List topRow=Arrays.asList(1,2,3);
		List midRow=Arrays.asList(4,5,6);
		List botRow=Arrays.asList(7,8,9);
		List leftCol=Arrays.asList(1,4,7);
		List midCol=Arrays.asList(2,5,8);
		List rightCol=Arrays.asList(3,6,9);
		List diagonal=Arrays.asList(1,5,9);
		List diagonal2=Arrays.asList(3,5,7);
		
		winning=new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(diagonal);
		winning.add(diagonal2);
	}
	
	public static void checkResult() {
		
		for (List list : winning) {
			if(playerPosition.containsAll(list)) {
				System.out.println("You Won");
				System.exit(0);
			}
			else if(cpuPosition.containsAll(list)) {
				System.out.println("You Lose");				
				System.exit(0);
			}
			else if(cpuPosition.size()+playerPosition.size()==9) {
				System.out.println("Match draw");				
				System.exit(0);
			}
		}
	}
}

