package day09_nestedIfElseStatement;

public class C03_Ternary {

	public static void main(String[] args) {
		

		int x=3;
		
		//  x%2==0 ? "cift sayi" : "tek sayi" ;   // Kodu kabul etmedi. Mutlaka bir atama yapmam�z gerekiyor. Variable olusturmam�z laz�m.
		
		String tekMiCiftMi=x%2==0 ? "cift sayi" : "tek sayi" ;
		System.out.println(tekMiCiftMi);     //cift gelir kar��l�k        // boolean ile yap�yoruz Ternaryi, boolean olmak zorunda. True oder Falsch.
		
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		
		// Ternary iki t�rl� kullan�labilir
		
		// ya donen sonuca gore bir variable olusturup assign ederiz      
        // veya direk syso icine yazip sonucu yazdiririz
        
        
        
        // eger ternary de donecek sonuclar ayni data turunden degilse
        // atama yapamayiz, sadece syso ile yazdirabiliriz
        
        System.out.println(x>5 ? "Aferin" : 4); // Aferin
        
         // String sonuc = x>5 ? "Aferin" : 4;   Atama yapmaya �al��t�k,atama yapamad�k  = i�arti atama yapar
		                // 4 � kabul etmez ��nk� 4 int.  ( T�rnak i�inde yazarsak sorun olmaz. T�rnak i�i String olur zaten
		

	}

}
