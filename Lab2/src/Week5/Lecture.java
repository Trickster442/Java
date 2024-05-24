package Week5;
import java.util.Arrays ;
import java.util.List;
import java.util.* ;

public class Lecture {
	
	static String[] days = new String[] {"Monday","Tuesday","wednesday","Thursday","Friday","Saturday","Sunday"};
	public static void main (String [] args) {
		// primitive way to create array
		// first declare what type of data it will hold
		// as all the data type are / have their own class in java create object
		// you can assign limit also
		String [] array1 = new String [] {"a", "b"};
		System.out.println(array1[1]);
		System.out.println(array1.length);
		System.out.println(Arrays.toString(array1));  //to print its all content
		
		//You can also use array helper class to create an array
		//some of the methods in Arrays helper class
		// sort() to sort an array
		// fill () to fill item in array // it changes to same item passed
		
		
		// Collection is data structure that can hold multiple values
		// Types of collection are
		// List type //Set TYpe //Map type
		// List type are Array and linkedlist
		// Set type are hashSet or TreeSet
		// Map type are hashMap and TreeMap
		
		
		// List is an ordered sequence of values
		// Must be of same data type
		// List<String> means a list of string
		// List <Integer> means list of integer
		// Syntax for creating list is like
		// List<String> foods = new ArrayList<String>();
		List<String> foods = new ArrayList<String>();
		foods.add("aubergine");
		foods.add("broccoli");
		foods.add("cabbage");
		System.out.println(foods.get(0));  //indexing
		System.out.println(foods.size());
		System.out.println(foods.isEmpty());
		System.out.println(foods.set(2, "ice-cream"));  //changes value at given index
		foods.add(3,"ice-cream");  //adds new item at given index
		System.out.println(foods.remove("broccoli"));
		System.out.println(foods.toString());
		
		
		//Map is a another word for dictionary
		// It contains a pair of "keys" and "values"
		// Keys must of the same type and values must of same type
		// For example : Map<String, Integer> 
		// means map from string to integer
		mapToUpperCase(days);
		
		
		// when using collection type you first get where are you using it from
		// for example i want to create hashmap object then
		// first implement from Map and then data type and then
		// create obj with new
		// for what like HashMap or HashTree
		
	}
	public static void mapToUpperCase(String[] array) {
		for(int i=0; i<array.length; i++) {
			array[i] = array[i].toUpperCase();
		}
		System.out.println(Arrays.toString(array));
	}
}
