public class testClass {
	
	/*
	 * This is a test comment using the vim text editing
	 * system.
	 */

	private static int i = 1;
	private static int j = 3;
	private static double d = 3.14159;
	private static int[] myArray;

	public static void main(String[] args) {
		System.out.println("This is a test. i = " + i + " j = " + j);
		System.out.println("This is pi: " + d);
		printStuff();
		printLuke(Integer.parseInt( args[0]) );
		printName("My name" , 5);
		arrayMethod(4);
		System.out.println();
		arrayMethod(5);	
		System.out.println();
		extraFunction(Integer.parseInt(args[0]));

		return;	
	}

	public static void printStuff() {
		for(int i = 0; i<10; i++) {
			System.out.println("Print command: " + i);
			System.out.println("Print command's square: " + i*i);
			System.out.println("Print command's cube: " + i*i*i);
			System.out.println();
		}

		return;
	}
	
	public static void arrayMethod(int i) {
		myArray = new int[i];
		for(int j=0; j<i; j++){
			myArray[j] = j*j;
			System.out.println(myArray[j]);
		}

		return;	
	}
	
	public static void extraFunction(int i) {
		for (int j = 0; j<i; j++) {
			System.out.println(i);
		}

		return;
	}

	public static void printLuke(int i) {
		System.out.println("Print 'Luke' " + i + " times.");
		for(int j = 0; j<i; j++){
			System.out.println("Luke");
		}

		return;
	}

	public static void printName(String name, int times) {
		System.out.println("Print " + name + " " + times + " times.");
		for(int i = 0; i<times; i++) {
			System.out.println(name);
		}

		return;
	}
}
