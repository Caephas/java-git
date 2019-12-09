/*Write an application that asks the user to enter
two integers, obtains them from the user and displays the larger number
followed by the words "is larger". If the numbers are equal, print the
message "These numbers are equal".*/
import java.util.Scanner;
public class Comparison {

	public static void main(String[] args) {
		Scanner bobby = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int num1 = bobby.nextInt();
		System.out.print("Enter second value: ");
		int num2 = bobby.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is larger ");	
		}
		if (num1<num2) {
			System.out.println(num2 + " is larger");
		}
		if (num1 == num2) {
			System.out.println("These numbers are equal!!");
		}
		// TODO Auto-generated method stub

	}

}
