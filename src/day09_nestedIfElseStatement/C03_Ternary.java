package day09_nestedIfElseStatement;

public class C03_Ternary {

	public static void main(String[] args) {
		

		int x=3;
		
		//  x%2==0 ? "cift sayi" : "tek sayi" ;   // Kodu kabul etmedi. Mutlaka bir atama yapmamýz gerekiyor. Variable olusturmamýz lazým.
		
		String tekMiCiftMi=x%2==0 ? "cift sayi" : "tek sayi" ;
		System.out.println(tekMiCiftMi);     //cift gelir karþýlýk        // boolean ile yapýyoruz Ternaryi, boolean olmak zorunda. True oder Falsch.
		
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		
		// Ternary iki türlü kullanýlabilir
		
		// ya donen sonuca gore bir variable olusturup assign ederiz      
        // veya direk syso icine yazip sonucu yazdiririz
        
        
        
        // eger ternary de donecek sonuclar ayni data turunden degilse
        // atama yapamayiz, sadece syso ile yazdirabiliriz
        
        System.out.println(x>5 ? "Aferin" : 4); // Aferin
        
         // String sonuc = x>5 ? "Aferin" : 4;   Atama yapmaya çalýþtýk,atama yapamadýk  = iþarti atama yapar
		                // 4 ü kabul etmez çünkü 4 int.  ( Týrnak içinde yazarsak sorun olmaz. Týrnak içi String olur zaten
		

	}

}
