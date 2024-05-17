package Week4;
public class Tamagotchi {
	private int happiness;private int hungriness;private int cleanness;private int tiredness;
	public Tamagotchi() {
		this.happiness = 5;
		this.hungriness = 5;
		this.cleanness = 5;
		this.tiredness = 5;
	}
	public int getHungriness() {
        return hungriness;
    }
    public int getHappiness() {
        return happiness;
    }
    public int getCleanness() {
        return cleanness;
    }
    public int getTiredness() {
        return tiredness;
    }
	public void feed() {
		hungriness -= 5;
		if (hungriness < 0)
            hungriness = 0;
	}
	public void walk() {
		hungriness += 3;
		tiredness += 2;
		checkLimits();
	}
	public void pet() {
		happiness += 5;
		checkLimits();
	}
	public void clean() {
		cleanness += 10;
		if (cleanness >10) {
			cleanness = 10;
		}
	}
	public String getMood() {
		 if (tiredness == 10)
	            return "asleep";
	        else if (tiredness >= 8)
	            return "tired";
	        else if (hungriness >= 7)
	            return "hungry";
	        else if (cleanness < 3)
	            return "dirty";
	        else if (happiness >= 8)
	            return "happy";
	        else if (happiness >= 4)
	            return "Ok";
	        else
	        	return "sad"; 	
	}
	public void passTime() {
		hungriness += 1;
        cleanness -= 1;
        if (tiredness == 10)
            tiredness = 0; ///special case where tamgotchi is too tired and sleep.
        else
            tiredness += 1;
        if (hungriness >= 7)
            happiness -= 1;
        if (cleanness < 3)
            happiness -= 1;
        checkLimits();
	}
	private void checkLimits() {
        hungriness = Math.min(Math.max(hungriness, 0), 10);
        happiness = Math.min(Math.max(happiness, 0), 10);
        cleanness = Math.min(Math.max(cleanness, 0), 10);
        tiredness = Math.min(Math.max(tiredness, 0), 10);
    }
}
