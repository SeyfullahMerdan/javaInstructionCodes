package day35_encapsulation_inheritance;

public class Isci extends Muhasebe {

	protected String statu;
	protected String mesleði;
	protected String Sendika;

	public Isci() { // kendim 36. derste constructor ekledim.

		System.out.println("Isci parametresiz constructor çalýþtý"); // >>>>>>>>>Çalýþtýgýný görmek için içine SYSO ile
																		// yazdýrýyorum.

	}

	public static void main(String[] args) {

		Isci isci1 = new Isci();

		isci1.mesleði = "Kaynakçý";
		isci1.saatUcreti = 20;
		isci1.isim = "Emine";

		isci1.maas = isci1.maasHesapla();
		System.out.println(isci1.isim + "'nin maaþý: " + isci1.maas);

	}
}
