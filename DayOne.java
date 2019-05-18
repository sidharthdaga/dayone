package dayOne;

import java.io.*;
import java.util.*;

public class DayOne {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("read.txt"));
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
		input.close();
	}
}
