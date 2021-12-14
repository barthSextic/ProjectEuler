
import java.io.*;
import java.util.Scanner;

public class P11 {

	private static FileReader fr;
	private static final String file = new String("numberGrid.txt");
	public static void main(String[] args) {
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // try catch
		Scanner scanner = new Scanner(fr);
		System.out.println("EOP");
	} // main method
	
}
