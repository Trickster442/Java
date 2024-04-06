package Week2;

public class Person {
	String name ;
	int age;
	Person(String name, int age){
		this.name = name ;
		this.age = age ;
	}
	
	String getName() {
		return this.name ;
	}
	
	int getAge() {
		return this.age ;
	}
	
	void setName(String name) {
		this.name = name ;
	}
	
	void setAge(int age) {
		this.age = age ;
	}
	void haveBirthday() {
		age++ ;
	}
	
	String greet(Person other) {
		return "Hello, " + other.getName() + "!" ;
	}
	
	void yearsUntilRetirement() {
		if(age < 68) {
			int years = 68-18;
			System.out.println(name + " can retire in " + years + " years.");
		} else {
			System.out.println(name + " can retire already!");
		}
	}
}
