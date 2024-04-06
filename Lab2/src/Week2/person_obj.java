package Week2;

public class person_obj {
	public static void main(String[] args) {
		Person person1 = new Person("Sandip", 20);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		
		Person alice = new Person("Alice", 19);
		Person bob = new Person("Robert", 71);
		alice.yearsUntilRetirement();
		bob.yearsUntilRetirement();
		
		Person alice2 = new Person("Alice", 19);
		Person bob2 = new Person("Robert", 71);
		System.out.println(alice2.greet(bob2));
	}
}
