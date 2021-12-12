package day11_stringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1="Ali Kahyaoðlu";
		System.out.println(str1.length());    // 13  boþlugu da alýr
		
		// Verilen Str1'in son harfini yazdýrýn.
		
		System.out.println(str1.charAt(str1.length()-1));
		                             //son harfin indexi           // dinamik yapý diyoruz buna...
		                  // son harf................
		String str2="";
		System.out.println(str2.length());  // 0 verdi java...
		
		String str3=null;     // null degeri bizim bu variable ý bilerek oluþturdugumuzu ve bilerek deger atamadýgýmýzý belirtiyor.
		//  System.out.println(str3.length());       java.lang.NullPointerException Hatasý verir!
		
		
		// String str4;
		
		System.out.println(str3);  // null -- daha sonra deger atayacagýz, yazmazsak hata verir...
    //		System.out.println(str4);    java burada hata verir çünkü string str4 ü yazdýk ama deger atamdýk. null yazmalýydýk...
		
		
		 //  null pointer olusturdugumuz fakat sonra kullanacagimiz bir String'i isaretlemek icin kullanilir
        //   Bir String i yazdirdigimizda null cikiyorsa turkce olarak
        //    "Ben bu degiskeni olusturdum ama henuz deger atamadim" demek istiyor
	

	}

}
