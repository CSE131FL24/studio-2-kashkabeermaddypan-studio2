package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your starting amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter your win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit: ");
		double winLimit = in.nextDouble();
		double totalAmount = startAmount;
		int totalPlays = 0;
		
		
		while(totalAmount != 0 && totalAmount != winLimit) {
			double random = (int) (Math.random()*100+1);
			if (random >= winChance) {
				totalAmount--;
				System.out.println("loss");
				System.out.println(totalAmount);
				totalPlays++;
			}
			else {
				totalAmount++;
				System.out.println("win");
				System.out.println(totalAmount);
				totalPlays++;
			}
		}
		System.out.println("Total amount ended with is " + totalAmount);
		System.out.println("Total plays are " + totalPlays);
	
		double a = (1 - winChance)/(winChance);
		double expectedRuin = (Math.pow(a, startAmount) - (Math.pow(a, winLimit))/(1 - (Math.pow(a, winLimit))));
				System.out.println("Expected ruin: " + expectedRuin);
	}
	

}
