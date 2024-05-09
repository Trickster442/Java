package Week4;
import java.util.Scanner;

public  class MainTamagotchi{
	public static void main(String[] args) {
		Tamagotchi myTamagotchi = new Tamagotchi();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Initial Status");
		displayStatus(myTamagotchi);
	      while (true) {
	            // Display menu options
	            System.out.println("Choose an action:");
	            System.out.println("1. Feed the Tamagotchi");
	            System.out.println("2. Take the Tamagotchi for a walk");
	            System.out.println("3. Clean the Tamagotchi");
	            System.out.println("4. Pet the Tamagotchi");
	            System.out.println("5. Pass time");
	            System.out.println("6. Get current mood");
	            System.out.println("7. Exit");
	            // Read user input
	            System.out.print("Choose number: ");
	            int choice = scanner.nextInt();
	            // Perform action based on user choice
	            switch (choice) {
	                case 1:
	                    myTamagotchi.feed();
	                    break;
	                case 2:
	                    myTamagotchi.walk();
	                    break;
	                case 3:
	                    myTamagotchi.clean();
	                    break;
	                case 4:
	                    myTamagotchi.pet();
	                    break;
	                case 5:
	                    myTamagotchi.passTime();
	                    break;
	                case 6: 
	                	myTamagotchi.getMood();
	                	break;
	                case 7:
	                    System.out.println("Exiting...");
	                    scanner.close(); // Close the Scanner
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	            // Display status after action
	            displayStatus(myTamagotchi);
	        }
	    }
	 private static void displayStatus(Tamagotchi tamagotchi) {
	        System.out.println("Hungriness: " + tamagotchi.getHungriness());
	        System.out.println("Happiness: " + tamagotchi.getHappiness());
	        System.out.println("Cleanness: " + tamagotchi.getCleanness());
	        System.out.println("Tiredness: " + tamagotchi.getTiredness());
	        System.out.println("Mood: " + tamagotchi.getMood());
	    }
}