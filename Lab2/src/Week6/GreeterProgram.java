package Week6;

import java.io.*;

public class GreeterProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(
            new InputStreamReader(System.in)
        );
         
        try {
            System.out.println("Please enter your name.");
            System.out.print("> ");
            String name = keyboard.readLine();
            
            System.out.println("Please enter your age.");
            System.out.print("> ");
            int age = Integer.parseInt(keyboard.readLine());
            
            if(age < 0) {
                System.out.println("Your age can't be negative!");
            } else {
                Person person = new Person(name, age);
                System.out.println(person.getGreeting());
                
                person.haveBirthday();
                System.out.println("You'll be " + person.getAge() + " next year.");
            }
        } catch(NumberFormatException ex) {
            System.out.println("That's not a number!");
        }
    }
}