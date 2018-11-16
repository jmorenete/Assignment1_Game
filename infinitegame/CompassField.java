package infinitegame;

import java.util.Scanner;

public class CompassField {

	
	public String CompassInput() {
		System.out.println("Enter direction you wish to move in (north/south/east/west): ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
		
	}
	
	
}
