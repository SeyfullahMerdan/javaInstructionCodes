package day42_AbstractClasses;

public class Ustabasi extends Isci {

	public void statu() {
		System.out.println("Bu classdaki tüm personel ustabasidir. Ýmza: Ustabaþý");
	}
	
	
	public void maas() {
		System.out.println("Aylýk 10.000 Tldir. imza: Ustabaþý");
	}
	
	
	public void mesai() {
		System.out.println("Arýza çözülene kadar çalýþýr. imza: Ustabaþý");
	}
	
	// OBje oluþturdgumuz en alttaki class parent classlardaki methodlarý 
	// override edince, classtan oluþturdugumuz objeler en dogru ve en spesifik özel bilgilere kavuþtu.
	
	// Ama klasik parent-child iliþkisinde tüm methodlarý override etme mecburiyeti YOKTUR.
	
	// Java parent classlardaki tüm methodlarý override etmek MECBURÝYETÝ kazandýrmak için abstract class yapýsýný oluþturmuþtur.
	// Yani bir classý abstract olarak tanýmlarsanýz child classlar tüm methodlarý override etmek zorunda KALIR.
	
	// Dolaysýyla abstract yaptýgýmýz parent classlar sadece kalýp görevi yapacaklar.
	
	public static void main(String[] args) {

		Ustabasi ust1=new Ustabasi();
		
		ust1.statu();
		ust1.maas();
		ust1.mesai();
		
		
	}

}
