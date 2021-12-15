package day20_scope;

public class InstanceVar2 {

	String adres = "Ankara";
	String dogumYeri; // Otomatik olarak null atayacak
	double notOrtalamasi; // 0
	double yasOrt = 12.3;
	char cinsiyet = 'E'; // space olur deger atanmaz ise
	char karakter;
	boolean ogrenciMi = true; // false olur e�er de�er atanmaz ise
	boolean izinliMi;

	public static void main(String[] args) {
		// �nstance variablelara main methoddan direk ula��labilir mi? Hay�r
		// Obje olu�turarak ula��labilir. Class ismini kopyalar�m ve sonra obje ismini
		// yazar�m***

		InstanceVar2 ali = new InstanceVar2(); // !!!!!!!!!!!! OBJEY� BU �EK�LDE OLU�TURUYORUZ VE METHODLARA
												// VAR�ABLELARA ULA�IYORUZ. !!!!!!!!!!!!!!
		System.out.println(ali.adres); // Ankara. ��nk� Class�n i�inde ba�ka bir deger atanmam��.
		System.out.println(ali.dogumYeri); // null
		System.out.println(ali.notOrtalamasi); // 0.0 Atayacak
		System.out.println(ali.yasOrt); // 12.3 yazd�r�r. Degi�memi�, main method i�inde. yukar�daki degeri al�r o
										// zaman...
		System.out.println(ali.cinsiyet); // E
		System.out.println(ali.karakter); // space
		System.out.println(ali.ogrenciMi); // true
		System.out.println(ali.izinliMi); // false ------- de�er atanmad��� i�in.

		staticMethod();

	}

	public static void staticMethod() {

		// �nstance variablelara static methoddan direk ula��labilir mi? Hay�r
		// Obje olu�turarak ula��labilir. Class ismini kopyalar�m ve sonra obje ismini
		// yazar�m***

		InstanceVar2 Merdan = new InstanceVar2();
		Merdan.adres = "M�nchener stra�e 93";
		Merdan.dogumYeri = "Mersin";
		Merdan.notOrtalamasi = 97;

		System.out.println(Merdan.adres + Merdan.dogumYeri + Merdan.notOrtalamasi);

	}

	public void staticOlmayanMethod() {

		System.out.println(adres);
		System.out.println(yasOrt);
		// �nstance variablelara static olmayan methoddan direk ula��labilir mi? Evet
		// ula��labilir.
	}

}
