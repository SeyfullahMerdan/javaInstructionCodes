package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;
		Integer sayi2=20;
		
		System.out.println(sayi1+sayi2);   //birisi primitive birisi non-primitive...
		
		// sayi2.byteValue(); gibi methodlar gelir kar��m�za //
		// sayi1. yaz�nca method ��kmaz. primitivedir. int dir
		// sayi2. yaz�nca method gelir. sayi2 Integer dir, wrapper classdir.
		
		String tel1="3456789";
		String tel2="9874563";
		
		System.out.println(tel1 + tel2);
 				
		//yan yana yazar. toplamaz.  toplamak i�in bir a�ag� sutundaki gibi yapmam�z laz�m... 
		
		System.out.println(Integer .valueOf(tel1) + Integer.valueOf(tel2));  // Toplama yapar
		
		// String bir ifadede matematiksel deger oldugundan emin isek valueOf'u kullanabiliriz.
		
		
		System.out.println(Integer.MIN_VALUE);    // -2147483648      min. ve max. degerleri ezberlemye gerek yok. bu �ekilde �ag�r�r�z ve gelir.
		System.out.println(Integer.MAX_VALUE);   // 2147483647       int. ' in minimum ve maksimum degerlerini verir.
		 
		System.out.println(Double.MAX_VALUE);  // 1.7976931348623157E308  ''E308'' demek 308 tane 0 var..10�zeri 308..
		System.out.println(Short.MAX_VALUE); //   32767           ...double ve shortun max. degerleri...
		
		
		// Her String matematiksel ifadeye �evrilmez. a�ag�dakinde hata verir ��nk� b harfi var...numerik ifade olmas� laz�m.
		
		// String caddeNo="B203";
		String caddeNo= "203";
		String sokakNo="1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		// Integer.valueOf  (String olarak numerik ifade) methodu String olarak kaydedilmi� olan
		// numerik ifadeleri say�ya �evirir. Ancak String ifadede numerik olmayan bir karakter varsa
		// Java hata verir.   ''java.lang.NumberFormatException'' �al��may� durdurur.
		// BU stops execution HATASId�r
		
		System.out.println("Hello World");  // Bir �nceki i�lem hatal� oldu�u i�in bir �nceki sat�rda �al��may� durdurdu.Hatal� sat�rda �al��may� b�rakt�.
		                                     // o y�zden bu sat�r� �al��t�rmad�. Bu y�zden hatal� sat�r� d�zelttik. (yorum i�ine ald�k)

		
	}

}

