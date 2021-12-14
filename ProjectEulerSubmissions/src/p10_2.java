
public class p10_2 {

	/*/
	 *  Rick Howell
	 *  This algorithm is ridiculously fast
	 *  I'm not sure why it's so fast
	 *  hmmmmm...
	 */
	private static int lim = 2000000, half;
	private static long sum = 0;
	private static boolean[] container;
	
	public static void main(String[] args) {
		container = new boolean[lim + 1];
		build(lim);
		count(math(container));
		System.out.println(sum);
	} // main
	private static void build(int x) {
		for(int i = 2; i <= x; ++i) {
			container[i] = true;
		}
	} // build
	private static boolean[] math(boolean[] x) {
		// Need to work in long data types or we'll wrap around the int limit
		half = x.length / 2;
		for (long i = 2; i <= half; ++i) {
			for (long j = i; j <= half; ++j) {
				try {
					if (i*j < x.length) {
						x[(int) (i*j)] = false;
					} else {
						break;
					} // if else
				} catch(Exception e) {
					System.out.println(i*j);
				} // try catch
			}
		}
		return x;
	} // math
	private static void count(boolean[] x) {
		for (int i = 0; i < x.length; ++i) {
			if (x[i]) {
				System.out.println(i);
				sum += i;
			}
		}
	} // count
}
