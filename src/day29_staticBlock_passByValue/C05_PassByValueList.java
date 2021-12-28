package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList {

	public static void main(String[] args) {

		/*
		 bir list olu�tural�m.
		 sora list elemanlar�n� degi�tir methodu yaz�p orada list elemanlar�ndan baz�lar�n� degi�tirelim.
		 method void olsun.
		 main methoda d�nd�kten sonra yeniden listi yazd�ral�m
		 */
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		listElemanlarDegistir(harfler);
		
		System.out.println("ma�N mETHODA DONUNCE L�ST : " + harfler);  // Obje olunca i�in i�inde objenin kendisini degi�tiremeyiz
		// Ama baz� elemanlar�n� degi�tirebiliriz. Yani listenin baz� elemanla�n� degi�tirebilirz.
		// Ama listenin kendisini degi�tiremeyiz.	
		
		
		listDegistir(harfler);// Methodda yen deger atad�g�m halde harfler listesi degi�medi. 
		System.out.println("Liste yeni list atad�kan sonra Main methoda d�n�nce List : "+ harfler);
		// Java da list ve array gibi objeler i�inde Pass By Value ge�erlidir. Yani farkl� bir methodda array veya liste yeni deger atamas�
		// yaparsan�z orjinal array veya list degi�mez.
		
		// Liste eleman eklemek veya ��karmakla degi�mez.
		
		
	}

	private static void listDegistir(List<String> harfler) {   // methodda yeni deger atardg�m halde harfler listesi degi�medi
		                                                       // elemanlar�n� yazmad�k. listenin kendisini yazd�k ama degi�tiremedik
		                                                       // a�ag�dakinde ise elemanlar� degi�tirdik.

		harfler=new ArrayList<>();
		
		System.out.println("Liste yeni deger atay�nca: "+ harfler);// Bo� list oldu. Yeni deger atay�nca.
		
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {

		harfler.set(0, "D");     // ��in i�inde obje olunca obje degi�mez ama objenin elemanlar�n� degi�tirebilirz.
		                        // Listenin kendisi degi�mez ama elemanlar� degi�ir.
		
		System.out.println("METHODDA DEG��T�RDG�M�Z L�ST : " + harfler);
		
	}

}
