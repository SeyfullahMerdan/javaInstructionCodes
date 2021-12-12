package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
	
	//  Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

		
			Scanner scan=new Scanner(System.in);
			System.out.println("Lütfen bir cümle giriniz.");
			String cumle=scan.nextLine();
			
			System.out.println("Lütfen varlýðýný kontrol etmek için bir harf giriniz.");
			char krk=scan.next().charAt(0) ;
			
			int index=cumle.indexOf(krk);        // girilen karakterin cümledeki index'ini verir.
			
			
			if (index<0) {
				System.out.println("Girdiginiz harf verilen cümlede yok.");
			} else {
			System.out.println("Girdiginiz harf verilen cümlede var.");
			 }
		
			scan.close();
	}

}
