package day35_encapsulation_inheritance;

public class Isci extends Muhasebe {

	protected String statu;
	protected String mesle�i;
	protected String Sendika;

	public Isci() { // kendim 36. derste constructor ekledim.

		System.out.println("Isci parametresiz constructor �al��t�"); // >>>>>>>>>�al��t�g�n� g�rmek i�in i�ine SYSO ile
																		// yazd�r�yorum.

	}

	public static void main(String[] args) {

		Isci isci1 = new Isci();

		isci1.mesle�i = "Kaynak��";
		isci1.saatUcreti = 20;
		isci1.isim = "Emine";

		isci1.maas = isci1.maasHesapla();
		System.out.println(isci1.isim + "'nin maa��: " + isci1.maas);

	}
}
