package day05_Matematiksel�slemler;

public class C02_Matematiksel�slemler {

	public static void main(String[] args) {

		
		int sayi1=10;
		int sayi2=20;
		
		String str1="Ali";
		String str2="Can";
		
		System.out.println(sayi1+sayi2+str1);
		System.out.println(sayi1+sayi2+str1+str2);
		System.out.println(sayi1+sayi2+str1+" "+str2);   // bo�luk i�in t�rnak i�areti-bo�luk b�rak�l�r.
		
		
		System.out.println(str1+sayi1+sayi2);    // Ali1020    
		
		// str1 ile sayi1'i toplar, birisi String oldugu i�in sonucu String olarak verir. Stringi tekrardan sayi2 ile toplar.String verir. 
		
		
		System.out.println(str1+(sayi1+sayi2));    // Ali30   

	    // �nce parantezi yapar. sonra stringin yan�na string olarak yazar.
		
		System.out.println(sayi1*sayi2+str1);  
        
		System.out.println(str1+sayi1*sayi2);   // �arpma sa�da dahi olsa �ncelik �arpman�n oldugu i�in �arpar ve Alinin yan�na yazar.
		
		// i�lem �nceligi her zaman �ok i�e yarar. Java yukar�dan a�ag�ya ve soldan sa�a do�ru �al���r ve yazd�r�r.
		
		
	}

}
