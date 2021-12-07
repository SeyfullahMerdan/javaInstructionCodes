package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;
		Integer sayi2=20;
		
		System.out.println(sayi1+sayi2);   //birisi primitive birisi non-primitive...
		
		// sayi2.byteValue(); gibi methodlar gelir karþýmýza //
		// sayi1. yazýnca method çýkmaz. primitivedir. int dir
		// sayi2. yazýnca method gelir. sayi2 Integer dir, wrapper classdir.
		
		String tel1="3456789";
		String tel2="9874563";
		
		System.out.println(tel1 + tel2);
 				
		//yan yana yazar. toplamaz.  toplamak için bir aþagý sutundaki gibi yapmamýz lazým... 
		
		System.out.println(Integer .valueOf(tel1) + Integer.valueOf(tel2));  // Toplama yapar
		
		// String bir ifadede matematiksel deger oldugundan emin isek valueOf'u kullanabiliriz.
		
		
		System.out.println(Integer.MIN_VALUE);    // -2147483648      min. ve max. degerleri ezberlemye gerek yok. bu þekilde çagýrýrýz ve gelir.
		System.out.println(Integer.MAX_VALUE);   // 2147483647       int. ' in minimum ve maksimum degerlerini verir.
		 
		System.out.println(Double.MAX_VALUE);  // 1.7976931348623157E308  ''E308'' demek 308 tane 0 var..10üzeri 308..
		System.out.println(Short.MAX_VALUE); //   32767           ...double ve shortun max. degerleri...
		
		
		// Her String matematiksel ifadeye çevrilmez. aþagýdakinde hata verir çünkü b harfi var...numerik ifade olmasý lazým.
		
		// String caddeNo="B203";
		String caddeNo= "203";
		String sokakNo="1564";
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		
		// Integer.valueOf  (String olarak numerik ifade) methodu String olarak kaydedilmiþ olan
		// numerik ifadeleri sayýya çevirir. Ancak String ifadede numerik olmayan bir karakter varsa
		// Java hata verir.   ''java.lang.NumberFormatException'' çalýþmayý durdurur.
		// BU stops execution HATASIdýr
		
		System.out.println("Hello World");  // Bir önceki iþlem hatalý olduðu için bir önceki satýrda çalýþmayý durdurdu.Hatalý satýrda çalýþmayý býraktý.
		                                     // o yüzden bu satýrý çalýþtýrmadý. Bu yüzden hatalý satýrý düzelttik. (yorum içine aldýk)

		
	}

}

