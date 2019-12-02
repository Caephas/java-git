/*Write an application that asks the user to enter two
integers, obtains them from the user and prints their sum, product,
difference and quotient (division).*/
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println("The addition of the two numbers is = " + sum);
		int sum2 = num1 * num2;
		System.out.println("The product of the two numbers is = " + sum2);
		int sum3 = num1 - num2;
		System.out.println("The difference of the two numbers is = " + sum3);
		int sum4 = num1 / num2;
		System.out.println("The quotient of the two numbers is = " + sum4);
		// TODO Auto-generated method stub

	}

}
