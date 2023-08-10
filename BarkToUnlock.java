package app;
import java.util.Scanner;
 
public class BarkToUnlock {
 
	public static void main(String[] args) {
		/*
		 * Create Variables based on the input Import scanner, Scanner scanner =
		 * system.in
		 *  create 4 variables (int)
		 *  create 1 variable (String)
		 *  the string will be a scanner input
		 *  one int will be a scanner input
		 *  loop through the second scanner input
		 *  create a array make that an input
		 *  loop through the array (if)
		 *  print YES if succeed
		 */
 
		Scanner scanner = new Scanner(System.in);
		int i;
		int k;
		int n;
		String ns;
		ns = scanner.next();
		n = scanner.nextInt();
		String[] str = new String[n];
		for (i = 0; i < n; i++) {
			str[i] = scanner.next();
			if (str[i].equals(ns)) {
				System.out.println("YES");
				return;
			}
		}
		k = 1;
		for (i = 0; i < n; i++) {
			if (str[i].charAt(1) == ns.charAt(0)) {
				k = 0;
				break;
			}
		}
		if (k == 1) {
			System.out.println("NO");
			return;
		}
		for (i = 0; i < n; i++) {
			if (ns.charAt(1) == str[i].charAt(0)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
 
}