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
		// Bir variable t�rnak i�areti i�erisine konmaz. E�er Variablei t�rnak i�areti i�ine koyarsak Variable�n ismini yazzd�rm��
		// oluruz, degerini yazd�ramay�z
		// System.out.println("sayi1+sayi2"+str2);  bu �ekilde yaparsak ((sayi1+sayi2Guzel yazar))
		
		
		
		System.out.println(sayi1+sayi2+str2);   // 9 g�zel yaz�yor. Java soldan saga i�lem yapar.
		                                       //  Kar��s�na ilk ��kan i�lem toplama oldugu i�in topluyor
 		                                       // 54 yazd�rmak i�in Stringe �evirmeliyiz. 
                                             //  Bir int. String yapman�n en kolay yolu �n�ne veya sonuna ""(Hi�lik) getirmektir!!!
	
	  //  En iyi kod �al��an koddur :D :D :D
	
	}

}
