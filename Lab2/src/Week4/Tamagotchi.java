package Week4;
public class Tamagotchi {
    private int happiness;
    private int hunger;
    private int tiredness;
    private int dirtiness;

    public Tamagotchi() {
        this.happiness = 5;
        this.hunger = 5;
        this.tiredness = 0;
        this.dirtiness = 0;
    }

    public void feed() {
        hunger -= 2;
        checkLimits();
    }

    public void walk() {
        happiness += 2;
        tiredness += 2;
        checkLimits();
    }

    public void pet() {
        happiness += 1;
        checkLimits();
    }

    public void clean() {
        dirtiness -= 2;
        checkLimits();
    }

    public String checkMood() {
        if (tiredness >= 10) return "Asleep";
        if (hunger >= 7) return "Hungry";
        if (tiredness >= 8) return "Tired";
        if (dirtiness >= 7) return "Dirty";
        if (happiness >= 7) return "Happy";
        if (happiness >= 3 && happiness <= 6) return "Content";
        return "Sad";
    }

    public void timePasses() {
        hunger++;
        dirtiness++;
        tiredness++;
        if (tiredness >= 10) tiredness = 0;
        if (dirtiness >= 10) dirtiness = 0;
        if (hunger >= 7 || dirtiness >= 7) happiness--;
        checkLimits();
    }

    private void checkLimits() {
        happiness = Math.max(0, Math.min(happiness, 10));
        hunger = Math.max(0, Math.min(hunger, 10));
        tiredness = Math.max(0, Math.min(tiredness, 10));
        dirtiness = Math.max(0, Math.min(dirtiness, 10));
    }

    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.feed();
        System.out.println("Initial mood: " + tamagotchi.checkMood());

        tamagotchi.feed();
        System.out.println("After feeding: " + tamagotchi.checkMood());

        tamagotchi.walk();
        System.out.println("After walking: " + tamagotchi.checkMood());

        tamagotchi.clean();
        System.out.println("After cleaning: " + tamagotchi.checkMood());

        tamagotchi.timePasses();
        System.out.println("After time passes: " + tamagotchi.checkMood());
    }
}
