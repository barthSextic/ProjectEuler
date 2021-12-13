
public class p10 {

	/*
	 * 	Rick Howell
	 * 	This does not work
	 * 
	 *  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
	 */
	private static boolean flip;
	private static int n = 2, lim = 2000000, count = 0;
	
	public static void main(String[] args) {
		// idk why I need the ++ at the end of my initializer??
		for (n++; n <= lim; n+=2) {
			if (!modCheck(n)) {
				//System.out.println(n);
				count += n;
			}
		}
		System.out.println(count + 2);
	} // main	
	
	private static boolean modCheck(int x) {
		flip = false;
		for (int i = 3; i <= x/2; i+=2) {
			if (x % i == 0) {
				flip = true;
			}
		}
		return flip;
	} // modCheck
}
