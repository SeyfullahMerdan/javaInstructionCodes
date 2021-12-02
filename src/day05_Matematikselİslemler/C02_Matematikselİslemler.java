package day05_MatematikselÝslemler;

public class C02_MatematikselÝslemler {

	public static void main(String[] args) {

		
		int sayi1=10;
		int sayi2=20;
		
		String str1="Ali";
		String str2="Can";
		
		System.out.println(sayi1+sayi2+str1);
		System.out.println(sayi1+sayi2+str1+str2);
		System.out.println(sayi1+sayi2+str1+" "+str2);   // boþluk için týrnak iþareti-boþluk býrakýlýr.
		
		
		System.out.println(str1+sayi1+sayi2);    // Ali1020    
		
		// str1 ile sayi1'i toplar, birisi String oldugu için sonucu String olarak verir. Stringi tekrardan sayi2 ile toplar.String verir. 
		
		
		System.out.println(str1+(sayi1+sayi2));    // Ali30   

	    // önce parantezi yapar. sonra stringin yanýna string olarak yazar.
		
		System.out.println(sayi1*sayi2+str1);  
        
		System.out.println(str1+sayi1*sayi2);   // Çarpma saðda dahi olsa öncelik çarpmanýn oldugu için çarpar ve Alinin yanýna yazar.
		
		// iþlem önceligi her zaman çok iþe yarar. Java yukarýdan aþagýya ve soldan saða doðru çalýþýr ve yazdýrýr.
		
		
	}

}
