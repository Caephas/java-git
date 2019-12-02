//Input an integer and assign the result to int variable value.
//Assume Scanner variable input can be used to read a value
//from the keyboard.
import java.util.Scanner;
public class Scanner2 {
	public static void main(String []args) {
		Scanner zaga = new Scanner (System.in);
		System.out.print("Enter first number: ");
		int num1 = zaga.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = zaga.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum is " + sum);
		
		
	}

}
