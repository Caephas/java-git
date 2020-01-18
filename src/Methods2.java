import java.util.Scanner;
public class Methods2 {

	public static void main(String[] args) {
		  double num1, num2, num3, avg;
	        Scanner bobby = new Scanner(System.in);
	        System.out.println("Enter three numbers: ");
	        num1 = bobby.nextDouble();
	        num2 = bobby.nextDouble();
	        num3 = bobby.nextDouble();
	        avg = average(num1,num2,num3);
	        System.out.println("The avearge is = " + avg);
		// TODO Auto-generated method stub

	}
	 public static double average(double x, double y, double z ){
	        double avg = (x + y + z)/3;
	        return avg;
	 }

}
