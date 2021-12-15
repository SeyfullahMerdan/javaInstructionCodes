package day20_scope;

public class InstanceVar2 {

	String adres = "Ankara";
	String dogumYeri; // Otomatik olarak null atayacak
	double notOrtalamasi; // 0
	double yasOrt = 12.3;
	char cinsiyet = 'E'; // space olur deger atanmaz ise
	char karakter;
	boolean ogrenciMi = true; // false olur eðer deðer atanmaz ise
	boolean izinliMi;

	public static void main(String[] args) {
		// Ýnstance variablelara main methoddan direk ulaþýlabilir mi? Hayýr
		// Obje oluþturarak ulaþýlabilir. Class ismini kopyalarým ve sonra obje ismini
		// yazarým***

		InstanceVar2 ali = new InstanceVar2(); // !!!!!!!!!!!! OBJEYÝ BU ÞEKÝLDE OLUÞTURUYORUZ VE METHODLARA
												// VARÝABLELARA ULAÞIYORUZ. !!!!!!!!!!!!!!
		System.out.println(ali.adres); // Ankara. Çünkü Classýn içinde baþka bir deger atanmamýþ.
		System.out.println(ali.dogumYeri); // null
		System.out.println(ali.notOrtalamasi); // 0.0 Atayacak
		System.out.println(ali.yasOrt); // 12.3 yazdýrýr. Degiþmemiþ, main method içinde. yukarýdaki degeri alýr o
										// zaman...
		System.out.println(ali.cinsiyet); // E
		System.out.println(ali.karakter); // space
		System.out.println(ali.ogrenciMi); // true
		System.out.println(ali.izinliMi); // false ------- deðer atanmadýðý için.

		staticMethod();

	}

	public static void staticMethod() {

		// Ýnstance variablelara static methoddan direk ulaþýlabilir mi? Hayýr
		// Obje oluþturarak ulaþýlabilir. Class ismini kopyalarým ve sonra obje ismini
		// yazarým***

		InstanceVar2 Merdan = new InstanceVar2();
		Merdan.adres = "Münchener straße 93";
		Merdan.dogumYeri = "Mersin";
		Merdan.notOrtalamasi = 97;

		System.out.println(Merdan.adres + Merdan.dogumYeri + Merdan.notOrtalamasi);

	}

	public void staticOlmayanMethod() {

		System.out.println(adres);
		System.out.println(yasOrt);
		// Ýnstance variablelara static olmayan methoddan direk ulaþýlabilir mi? Evet
		// ulaþýlabilir.
	}

}
