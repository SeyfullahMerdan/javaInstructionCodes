package day42_AbstractClasses;

public class Ustabasi extends Isci {

	public void statu() {
		System.out.println("Bu classdaki t�m personel ustabasidir. �mza: Ustaba��");
	}
	
	
	public void maas() {
		System.out.println("Ayl�k 10.000 Tldir. imza: Ustaba��");
	}
	
	
	public void mesai() {
		System.out.println("Ar�za ��z�lene kadar �al���r. imza: Ustaba��");
	}
	
	// OBje olu�turdgumuz en alttaki class parent classlardaki methodlar� 
	// override edince, classtan olu�turdugumuz objeler en dogru ve en spesifik �zel bilgilere kavu�tu.
	
	// Ama klasik parent-child ili�kisinde t�m methodlar� override etme mecburiyeti YOKTUR.
	
	// Java parent classlardaki t�m methodlar� override etmek MECBUR�YET� kazand�rmak i�in abstract class yap�s�n� olu�turmu�tur.
	// Yani bir class� abstract olarak tan�mlarsan�z child classlar t�m methodlar� override etmek zorunda KALIR.
	
	// Dolays�yla abstract yapt�g�m�z parent classlar sadece kal�p g�revi yapacaklar.
	
	public static void main(String[] args) {

		Ustabasi ust1=new Ustabasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
		
	}

}
