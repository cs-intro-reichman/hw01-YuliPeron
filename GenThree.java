/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int range;
		int minInRange;

		if(a>b) {
			range = a - b ;
			minInRange = b;
		}
		else {
			range = b - a ;
			minInRange = a;
		}

		int randomA = (int)((Math.random() * range) + minInRange );
		int randomB = (int)((Math.random() * range) + minInRange );
		int randomC = (int)((Math.random() * range) + minInRange );

		int min = Math.min((Math.min(randomA,randomB)),randomC);

		System.out.println(randomA);
		System.out.println(randomB);
		System.out.println(randomC);
		System.out.println("The minimal generated number was " + min);
	}
}
