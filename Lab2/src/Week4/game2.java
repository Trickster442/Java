package Week4;

public class game2 {
	private int happiness ;
	private int tiredness ;
	private int dirtiness ;
	private int hungriness ;
	
	game2()
	{
		this.happiness = 5;
		this.tiredness = 5 ;
		this.dirtiness = 0 ;
		this.hungriness = 5 ;
	}
	
	void feed() {
		if (hungriness < 0) {
			hungriness = 0 ;
		}
		else if (hungriness > 10) {
			hungriness = 10;
		}
		else {
			hungriness -= 5;
		}
	}
	
	void walk() {
		if (happiness < 0) {
			happiness = 0 ;
		}
		else if (happiness > 10) {
			happiness = 10;
		}
		else {
			happiness += 3;
		}
		
		
		if (tiredness < 0) {
			tiredness = 0 ;
		}
		else if (tiredness > 10) {
			tiredness = 10;
		}
		else {
			tiredness += 2;
		}
	}
	
	void clean() {
		if (dirtiness < 0) {
			dirtiness = 0 ;
		}
		else if (dirtiness > 10) {
			dirtiness = 10;
		}
		else {
			dirtiness -= 10;
		}
	}
	
	void pet() {
		if (happiness < 0) {
			happiness = 0 ;
		}
		else if (happiness > 10) {
			happiness = 10;
		}
		else {
			happiness += 5 ;
		}
	}
	
	String mood() {
		if (tiredness == 10) return "asleep";
		if (hungriness >= 7) return "Hungry";
        if (tiredness >= 8) return "Tired";
        if (dirtiness >= 7) return "Dirty";
        if (happiness >= 7) return "Happy";
        if (happiness >= 3 && happiness <= 6) return "Content";
        return "Sad";
	}
	
	
}
