package day06_Wrapper;

public class C02_Concatenation {

	public static void main(String[] args) {
		
		String str1= "Java";
		String str2= "Guzel";
		int sayi1=5;
		int sayi2=4;
		
		// Yukaridaki variable'lari kullanarak asagidaki metinleri yazdiralim
		
		// Java Guzel 54
		System.out.println(str1+" "+str2+" "+sayi1+sayi2);
		
		// Java 5 Guzel
		System.out.println(str1+" "+sayi1+" "+str2);
		
		// Java 94
		System.out.println(str1+" "+(sayi1+sayi2)+sayi2);
		
		// Java 19
		System.out.println(str1+" "+(sayi1-sayi2)+(sayi1+sayi2));
		
		// 54 Guzel
		System.out.println(sayi1+""+sayi2+" "+str2);
		// Bir variable týrnak iþareti içerisine konmaz. Eðer Variablei týrnak iþareti içine koyarsak Variableýn ismini yazzdýrmýþ
		// oluruz, degerini yazdýramayýz
		// System.out.println("sayi1+sayi2"+str2);  bu þekilde yaparsak ((sayi1+sayi2Guzel yazar))
		
		
		
		System.out.println(sayi1+sayi2+str2);   // 9 güzel yazýyor. Java soldan saga iþlem yapar.
		                                       //  Karþýsýna ilk çýkan iþlem toplama oldugu için topluyor
 		                                       // 54 yazdýrmak için Stringe çevirmeliyiz. 
                                             //  Bir int. String yapmanýn en kolay yolu önüne veya sonuna ""(Hiçlik) getirmektir!!!
	
	  //  En iyi kod çalýþan koddur :D :D :D
	
	}

}
