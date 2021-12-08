package day09_nestedIfElseStatement;

import java.util.Scanner;

public class C01_NestedIf {

	public static void main(String[] args) {
		
		/* Nested If kullanarak asagidaki soruyu cozen kodu yaziniz. Kullanicidan bir
		 * sifre girmesini isteyin Eger ilk harf buyuk harf ise “A” olup olmadigini
		 * kontrol edin. Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre”
		 * yazdirin. Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk
		 * harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		 */
	   
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir sifre giriniz.");
		
		char ilkKarakter=scan.next().charAt(0);
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') {      // büyük harfleri seçmiş olacak.
			if (ilkKarakter=='A') {
				System.out.println("Gecerli Sifre");              // Büyük harf kısmını hallettik burada
			} else {
                System.out.println("Gecersiz Sifre");
			}
			
			
		} else if (ilkKarakter>='a' && ilkKarakter<='z') {  // küçük harfleri seçer
                if (ilkKarakter=='z') {
					System.out.println("Gecerli Sifre");
				} else {
                    System.out.println("Gecersiz Sifre");            // Küçük harf kısmını hallettik burada
				} 
			
			
		} else {  // geriye kalan tüm karakterler
		
		System.out.println("Gecerli sifre olması icin harf ile baslayınız.");
			                                                                      // Ekstra yazılanlar,harf dışı yazılanları burada hallettik.
	
		}
		

		scan.close();
		
	}

}
