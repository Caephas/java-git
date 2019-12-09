/*Write an application that inputs
three integers from the user and displays the sum, average, product,
smallest and largest of the numbers.*/
import java.util.Scanner;
public class Arithmetic2 {

	public static void main(String[] args) {
		Scanner bobby = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = bobby.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = bobby.nextInt();
		System.out.print("Enter third integer: ");
		int num3 = bobby.nextInt();
		int sum1 = num1 + num2 + num3;
		System.out.println(sum1);
		int sum2 = (num1 + num2 + num3)/3;
		System.out.println(sum2);
		int sum3 = num1 * num2 * num3;
		System.out.println(sum3);
		
		
		// TODO Auto-generated method stub

	}

}
//I've not been able to figure this one out
