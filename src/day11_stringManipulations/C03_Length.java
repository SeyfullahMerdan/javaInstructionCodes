package day11_stringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1="Ali Kahyao�lu";
		System.out.println(str1.length());    // 13  bo�lugu da al�r
		
		// Verilen Str1'in son harfini yazd�r�n.
		
		System.out.println(str1.charAt(str1.length()-1));
		                             //son harfin indexi           // dinamik yap� diyoruz buna...
		                  // son harf................
		String str2="";
		System.out.println(str2.length());  // 0 verdi java...
		
		String str3=null;     // null degeri bizim bu variable � bilerek olu�turdugumuzu ve bilerek deger atamad�g�m�z� belirtiyor.
		//  System.out.println(str3.length());       java.lang.NullPointerException Hatas� verir!
		
		
		// String str4;
		
		System.out.println(str3);  // null -- daha sonra deger atayacag�z, yazmazsak hata verir...
    //		System.out.println(str4);    java burada hata verir ��nk� string str4 � yazd�k ama deger atamd�k. null yazmal�yd�k...
		
		
		 //  null pointer olusturdugumuz fakat sonra kullanacagimiz bir String'i isaretlemek icin kullanilir
        //   Bir String i yazdirdigimizda null cikiyorsa turkce olarak
        //    "Ben bu degiskeni olusturdum ama henuz deger atamadim" demek istiyor
	

	}

}
