package Pt1;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColour;

	public void speak() {
		System.out.println("Hello my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + age + " Years old");
		System.out.println("My eye colour is " + eyeColour);
	}

	public void eat() {
		System.out.println("eating...");
	}

	public void walk() {
		System.out.println("walking....");
	}

	public void work() {
		System.out.println("working...");
	}

}
