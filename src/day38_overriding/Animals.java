package day38_overriding;

public class Animals {

	// Overriding geçersiz kýlma demektir. Birisi digerini ezsin, ikisinden sadece birisi çalýþsýn istiyoruz.
	// Parentteki bir methodu signature dgiþtirmeden child classa da yazarak kullanmaya denir. Child classýn PArentteki methodu
	// Kendine uayarlayarak - implement ederek kullanmasý amacý ile yapýlýr
	// Daima Child classdaki Parent classdakini ezer!
	
	
	
	
	public void hareket() {  /////// *********    Overriden Method      *******************
		System.out.println("Tüm hayvanlar hareket ederler.");
	}
	
	public void beslenme() {
		System.out.println("Tüm hayvanlar beslenir");
	}
	
	public void solunum() {
		System.out.println("Tüm hayvanlar nefes alýr");
	}
	
	
	
}
