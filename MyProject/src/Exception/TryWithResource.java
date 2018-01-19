package Exception;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		System.out.println("Please provide a Input value : ");
		try(Scanner consoleScanner = new Scanner(System.in)){
			System.out.println("You typed interger : " + consoleScanner.nextInt());
		}

	}

}
