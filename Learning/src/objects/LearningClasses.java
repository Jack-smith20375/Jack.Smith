package objects;

public class LearningClasses {

	/*
	 * The introduction to object-oriented concepts in the lesson titled
	 * Object-oriented Programming Concepts used a bicycle class as an example, with
	 * racing bikes, mountain bikes, and tandem bikes as subclasses. Here is sample
	 * code for a possible implementation of a Bicycle class, to give you an
	 * overview of a class declaration. Subsequent sections of this lesson will back
	 * up and explain class declarations step by step. For the moment, don't concern
	 * yourself with the details.
	 */

	public class Bicycle
	{

		// the Bicycle class has
		// three fields
		public int cadence;
		public int gear;
		public int speed;

		// the Bicycle class has
		// one constructor
		public Bicycle(int startCadence, int startSpeed, int startGear)
		{
			gear = startGear;
			cadence = startCadence;
			speed = startSpeed;
		}

		// the Bicycle class has
		// four methods
		public void setCadence(int newValue)  //first method
		{
			cadence = newValue;
		}

		public void setGear(int newValue)   //second Method
{
			gear = newValue;
		}

		public void applyBrake(int decrement)   //third method
		{
			speed -= decrement;
		}

		public void speedUp(int increment)   //fourth method
		{
			speed += increment;
		}

	}

}
