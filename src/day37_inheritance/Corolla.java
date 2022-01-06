package day37_inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi = 4;
	String uretimYeri = "Türkiye";

	public static void main(String[] args) {

		Corolla araba1 = new Corolla(); // Corolla-data türü olarak düþünebiliriz.

		// Class ismi && Data türü // obje ismi //assignment // keyword // Constructor
		// (call)

		// String str=new String ("Ali Can") ---- String de class ismi ama ayný zamanda
		// data typedir

		// Java da obje oluþturdugumuz her class ismi ayný zamanda bir data türüdür.
		// Bu örnegimiz için corolla hem class adý, hem de oluþturdugumuz araba1
		// objesinin data typedir.

		// Java da obje üretilen her bir class ayný zamanda non-primitive data türü
		// olur.

		System.out.println(araba1.calisiyorMu);// true
		System.out.println(araba1.uretimYeri);// Türkiye
		System.out.println(araba1.tekerSayisi);// 4
		////// ****************
		Toyota araba2 = new Corolla();
		System.out.println(araba2.calisiyorMu);// true // Data type olarak Toyota yý seçtigim için
		System.out.println(araba2.uretimYeri);// Japonya // Datalarý üst classdan alýyor,hangi özeliklere sahip olmasýný
		System.out.println(araba2.tekerSayisi);// 0 // istiyorsam oradan oluþturuyorum
		////// ****************
		Araba araba3 = new Corolla();
		System.out.println(araba3.tekerSayisi); // 0
		////// ****************
		Araba araba4 = new Araba();
		araba4.calisiyorMu = true;
		////// ****************
		Toyota araba5 = new Toyota();
		araba5.pahaliMi = false;

		// **OBJE OLUÞTURURKEN CONSTRUCTORI TAKÝP ET!!!** ÇALÞTIRACAGIMIZ YERÝ
		// BELÝRLEMEK ÝÇÝN SONDAKÝ CONS. KISMI
		// ***** CLASS ÜYESÝ BULMAK ÝÇÝN DATA TÜRÜNE BAK****!!! ALCACAGIMIZ DATALARI
		// ALCAGIMIZYERÝ BULMAK ÝÇÝN ÝLK KISIM,DATA TÜRÜNE/CLASS iSMÝNE
	}

}
