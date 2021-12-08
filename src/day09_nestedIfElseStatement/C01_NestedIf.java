package day09_nestedIfElseStatement;

import java.util.Scanner;

public class C01_NestedIf {

	public static void main(String[] args) {
		
		/* Nested If kullanarak asagidaki soruyu cozen kodu yaziniz. Kullanicidan bir
		 * sifre girmesini isteyin Eger ilk harf buyuk harf ise �A� olup olmadigini
		 * kontrol edin. Ilk harf A ise �Gecerli Sifre� degilse �Gecersiz Sifre�
		 * yazdirin. Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk
		 * harf z ise �Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
		 */
	   
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir sifre giriniz.");
		
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {      // b�y�k harfleri se�mi� olacak.
			if (ilkKarakter=='A') {
				System.out.println("Gecerli Sifre");              // B�y�k harf k�sm�n� hallettik burada
			} else {
                System.out.println("Gecersiz Sifre");
			}
			
			
		} else if (ilkKarakter>='a' && ilkKarakter<='z') {  // k���k harfleri se�er
                if (ilkKarakter=='z') {
					System.out.println("Gecerli Sifre");
				} else {
                    System.out.println("Gecersiz Sifre");            // K���k harf k�sm�n� hallettik burada
				} 
			
			
		} else {  // geriye kalan t�m karakterler
		
		System.out.println("Gecerli sifre olmas� icin harf ile baslay�n�z.");
			                                                                      // Ekstra yaz�lanlar,harf d��� yaz�lanlar� burada hallettik.
	
		}
		

		scan.close();
		
	}

}
