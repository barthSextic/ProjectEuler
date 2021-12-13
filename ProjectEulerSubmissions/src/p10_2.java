
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
		System.out.println(sum - 1);
	} // main
	private static void build(int x) {
		for(int i = 0; i <= x; ++i) {
			container[i] = true;
		}
	} // build
	private static boolean[] math(boolean[] x) {
		half = x.length / 2;
		for (int i = 2; i <= half; ++i) {
			for (int j = i; j <= half; ++j) {
				try {
				if (i*j < x.length) {
					x[i*j] = false;
				} else {
					break;
				} // if else
				} catch(Exception e) {
					
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
