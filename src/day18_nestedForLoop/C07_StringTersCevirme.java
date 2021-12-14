package day18_nestedForLoop;

import java.util.Scanner;

public class C07_StringTersCevirme {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("bir kelime girin: ");
		String yazi = scan.nextLine();

		String cevrilen = ali(yazi);
		System.out.println("Çevrilen Yazi: " + cevrilen);
		scan.close();
	
	
	String ex="Merdan";
	System.out.println((ex.substring(1)) + (ex.charAt(0)));
	
	
	}

	public static String ali(String yazi) {
		if (yazi.isEmpty()) {
			return yazi;
		}
		return ali(yazi.substring(1)) + yazi.charAt(0);
	}

}