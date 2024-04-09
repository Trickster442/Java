package Week4;
import java.util.Scanner;
import java.util.Random;
public class Guess_game {
	public static void main(String [] args) {
		for(int remaining = 10 ; remaining > 0 ; remaining--) {
			Random correct = new Random();
			int correct_num = correct.nextInt(10);
			Scanner input = new Scanner(System.in);
			System.out.print("The number you entered is : ");
			int num = input.nextInt();
			if (num != correct_num) {
				System.out.println("Guess again");
				System.out.printf("Number of guess remaining %d", --remaining);
				System.out.println();
				continue;
			}
			else if(num == correct_num){
				System.out.println("Correct guess");
				
				break ;
			}
			else {
				System.out.println("Finished");
			}
		
		}
		
	}
}
