package oldMacDonald;

public class oldMacDonald {

	public static void main(String[] args) {
		buildVerse();
		animals("cow", "moo");
		buildVerse();
		animals("pig", "oink");
		buildVerse();
		animals("duck", "quack");
		buildVerse();
		animals("horse", "neigh");
		buildVerse();
		animals("lamb", "baa");
//		buildVerse();
//		animals("dog", "woof");
		buildVerse();
		animals("chicken", "buck");
		buildVerse();
		finale();
	}

	public static void buildVerse() {
		System.out.println("Old MacDonald had a farm, E-I-E-I-O\n");
	}

	public static void animals(String animal, String sound) {
		System.out.println("And on that farm he had a " + animal + " E-I-E-I-O \nWith a " + sound + " " + sound
				+ " here\r\n" + "And a " + sound + " " + sound + " there\r\n" + "Here a " + sound + ", there a " + sound
				+ "\r\n" + "Everywhere a " + sound + " " + sound);
	}

	public static void finale() {
		System.out.println("With a cluck cluck here\r\n" + "And a cluck cluck there\r\n"
				+ "Here a cluck, there a cluck\r\n" + "Everywhere a cluck cluck\r\n" + "With a baa baa here\r\n"
				+ "And a baa baa there\r\n" + "Here a baa, there a baa\r\n" + "Everywhere a baa baa\r\n"
				+ "With a neigh neigh here\r\n" + "And a neigh neigh there\r\n" + "Here a neigh, there a neigh\r\n"
				+ "Everywhere a neigh neigh\r\n" + "With a quack quack here\r\n" + "And a quack quack there\r\n"
				+ "Here a quack, there a quack\r\n" + "Everywhere a quack quack\r\n" + "With a oink oink here\r\n"
				+ "And a oink oink there\r\n" + "Here a oink, there a oink\r\n" + "Everywhere a oink oink\r\n"
				+ "With a moo moo here\r\n" + "And a moo moo there\r\n" + "Here a moo, there a moo\r\n"
				+ "Everywhere a moo moo");
	}
}
