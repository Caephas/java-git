import java.util.Random;
public class Random_class {

	public static void main(String[] args) {
		int die1, die2, countDouble = 0;
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			die1 = rand.nextInt(7);
			die2 = rand.nextInt(7);
			if (die1 == die2) {
				countDouble++;
			}
			
		}
		System.out.println(" I rolled " + countDouble + " doubles");
		// TODO Auto-generated method stub

	}

}
