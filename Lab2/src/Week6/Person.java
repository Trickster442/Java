package Week6;


public class Person {
    private final String name;
    private int age;
    
    public Person(String name, int age) {
        if(name == null || age < 0) {
            String message = "name = " + name + ", age = " + age;
            throw new IllegalArgumentException(message);
        }
        
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public String getGreeting() {
        return "Hello, " + name + "!";
    } 
    
    public int getAge() {
        return age;
    }
    
    public void haveBirthday() {
        age++;
    }
}
