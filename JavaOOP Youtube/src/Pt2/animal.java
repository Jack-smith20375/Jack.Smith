package Pt2;

public class animal {

	int age;
	String gender;
	double weightInLbs;

	public animal(int age, String gender, double weightInLbs) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping..");
	}

	
}
