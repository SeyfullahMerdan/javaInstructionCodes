package day37_inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi = 4;
	String uretimYeri = "T�rkiye";

	public static void main(String[] args) {

		Corolla araba1 = new Corolla(); // Corolla-data t�r� olarak d���nebiliriz.

		// Class ismi && Data t�r� // obje ismi //assignment // keyword // Constructor
		// (call)

		// String str=new String ("Ali Can") ---- String de class ismi ama ayn� zamanda
		// data typedir

		// Java da obje olu�turdugumuz her class ismi ayn� zamanda bir data t�r�d�r.
		// Bu �rnegimiz i�in corolla hem class ad�, hem de olu�turdugumuz araba1
		// objesinin data typedir.

		// Java da obje �retilen her bir class ayn� zamanda non-primitive data t�r�
		// olur.

		System.out.println(araba1.calisiyorMu);// true
		System.out.println(araba1.uretimYeri);// T�rkiye
		System.out.println(araba1.tekerSayisi);// 4
		////// ****************
		Toyota araba2 = new Corolla();
		System.out.println(araba2.calisiyorMu);// true // Data type olarak Toyota y� se�tigim i�in
		System.out.println(araba2.uretimYeri);// Japonya // Datalar� �st classdan al�yor,hangi �zeliklere sahip olmas�n�
		System.out.println(araba2.tekerSayisi);// 0 // istiyorsam oradan olu�turuyorum
		////// ****************
		Araba araba3 = new Corolla();
		System.out.println(araba3.tekerSayisi); // 0
		////// ****************
		Araba araba4 = new Araba();
		araba4.calisiyorMu = true;
		////// ****************
		Toyota araba5 = new Toyota();
		araba5.pahaliMi = false;

		// **OBJE OLU�TURURKEN CONSTRUCTORI TAK�P ET!!!** �AL�TIRACAGIMIZ YER�
		// BEL�RLEMEK ���N SONDAK� CONS. KISMI
		// ***** CLASS �YES� BULMAK ���N DATA T�R�NE BAK****!!! ALCACAGIMIZ DATALARI
		// ALCAGIMIZYER� BULMAK ���N �LK KISIM,DATA T�R�NE/CLASS iSM�NE
	}

}
