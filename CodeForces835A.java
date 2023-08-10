import java.util.Scanner;

public class CodeForces835A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter an integer: ");
		int words = scanner.nextInt();
		//System.out.println("Enter an integer: ");
		int p1time = scanner.nextInt();
		//System.out.println("Enter an integer: ");
		int p2time = scanner.nextInt();
		//System.out.println("Enter an integer: ");
		int p1ping = scanner.nextInt();
		//System.out.println("Enter an integer: ");
		int p2ping = scanner.nextInt();
		int player1score = p1ping + words * p1time + p1ping;
		int player2score = p2ping + words * p2time + p2ping;
		if (player1score < player2score) {
			System.out.println("First");
		}
		if (player1score > player2score) {
			System.out.println("Second");
		}
		if (player1score == player2score) {
			System.out.println("Friendship");	
			}
	}

}
