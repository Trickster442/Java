package Week4;
import java.util.Scanner;
import java.util.Random;
public class Guess_game {
//	public static void main(String [] args) {
//		for(int remaining = 10 ; remaining > 0 ; remaining--) {
//			Random correct = new Random();
//			int correct_num = correct.nextInt(10);
//			Scanner input = new Scanner(System.in);
//			System.out.print("The number you entered is : ");
//			int num = input.nextInt();
//			if (num != correct_num) {
//				System.out.println("Guess again");
//				System.out.printf("Number of guess remaining %d", --remaining);
//				System.out.println();
//				continue;
//			}
//			else if(num == correct_num){
//				System.out.println("Correct guess");
//				
//				break ;
//			}
//			else {
//				System.out.println("Finished");
//			}
//		
//		}
//		
//	}
	int remaining;
	Random correct = new Random();
	final int correct_num = correct.nextInt(101);
	
	void guess(){
		System.out.println("Select any number from 0 to 100");
		for(remaining = 10 ; remaining > 0 ; remaining--) {
		System.out.printf("\t Number of guess remaining %d \n", remaining);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		if (num < correct_num) {
			System.out.println("Low");
		}
		else if(num > correct_num){
			System.out.println("High");
		}
		else {
			System.out.println("You won");
			break;
		}
	}
	if (remaining == 0) {
           System.out.println("You lost. The correct number was: " + correct_num);
    }	
}
}
