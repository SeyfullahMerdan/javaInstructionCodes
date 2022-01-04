package day35_encapsulation_inheritance;

public class Muhasebe extends Personel {

	protected int saatUcreti;
	protected String statu;
	protected int maas;

	public Muhasebe() { // kendim 36. derste constructor ekledim.

		System.out.println("Muhasebe parametresiz constructor çalýþtý"); // >>>>>>>>>Çalýþtýgýný görmek için içine SYSO
																			// ile yazdýrýyorum.

	}

	public static void main(String[] args) {

		Muhasebe cls1 = new Muhasebe();
		cls1.isim = "Ali";
		System.out.println(cls1.soyisim); // Null - Parent class da deger atamamýþtým. Rahatlýkla ulaþýp,
											// degiþtirebiliyorum, okuyorum.

	}

	public int maasHesapla() {
		int maas = 8 * 25 * saatUcreti;

		return maas;
	}

}
