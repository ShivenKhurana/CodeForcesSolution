package app;

import java.util.Scanner;

public class CodeForces935B {
	public static void main(String[] args) {
		/*
		 * Create the scanner create variables for the 2 lines of input, num and move
		 * create a variable, 2 use a function to find a certain char in the string,
		 * assign in to one do the same for the second var make a for loop i = 1; i <=
		 * num; i++ do each move and check if they are crossing a border add it to a
		 * variable 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int num;
		int i;
		int coin;
		int x;
		int y;
		String move;
		x = 0;
		y = 0;
		coin = 0;
		while (scanner.hasNextInt()) {
			num = scanner.nextInt();
			move = scanner.next();

			for (i = 0; i < num - 1; i++) {
				if (move.charAt(i) == 'U')
					y++;
				else
					x++;
				if (x == y && move.charAt(i) == move.charAt(i + 1))
					coin++;
			}
			System.out.println(coin);
		}
		scanner.close();
	}

}
