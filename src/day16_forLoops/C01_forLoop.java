package day16_forLoops;

public class C01_forLoop {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 10; i += 2) { // S�n�r� dahil etmek istiyorsak e�ittir koyar�z.

			System.out.print(i + "       "); // yan yana olsun istersek -ln sileriz. Yanyana yazar�z.
			// (i + " " ) yaparsak yanyana yaz�p araya bo�luk koyar
		}

		// forLoop ba�lang� ve biti� �art� bir say�n�n degerine bagl� olan durumlarda
		// tercih edilir.

		/*
		 * for (int i = 0; i < 10; i--) {
		 * 
		 * System.out.println(i + " "); // bu bir kodalama hatas�d�r!!! }
		 */
		
		// Eger ba�lang�� say�s� art��/azal�� ile biti� degerine yakla�m�yor,
		// uzakla��yor ise Loop hi� bir zaman durmaz
		// loop hi� bir zaman durmaz.
		// Bu duruma sonsuz loop deriz ve bu durumun ger�ekle�mesini istemeyiz.

		for (int i = 0; i > 10; i++) { // Loop broken OLDU ! �L� DOGMU�TUR ! forLoop �al���r ama forBody �al��maz!!!
			System.out.println(i + " "); // i=0 i>10 == False bu durumda �al��m�yor kod...
		}

		// e�er ilk deger i�in biti� �art� true olmazsa daha ilk ad�mda loop broken olur*********************
		//
		// dolay�s�yla loop body hi� �al��madan,loop'un sonras�na ge�ilir.
		// lopp �al���r ama hi� bir i�lem yapmaz.*************************

		// 3 DURUM S�Z KONUSU..
		
		// 1-) Regular YAN� NORMAL KOD
		// 2-) Sonsuz D�ng� (Sonsuz Loop) HATA VERD��� DURUM
		// 3-) �al���p Sonu� vermeme durumu �ALI�TIGI AMA SONU� VERMED�G� DURUM.

	}

}
