// Prompt the user to enter an integer
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		Scanner bobby = new Scanner (System.in);
		System.out.print("Enter first number: " );
		int num1 = bobby.nextInt();
		System.out.print("Enter second number: ");
		int num2 = bobby.nextInt();
		int sum = num1 + num2;
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
