package day38_overriding;

public class Animals {

	// Overriding ge�ersiz k�lma demektir. Birisi digerini ezsin, ikisinden sadece birisi �al��s�n istiyoruz.
	// Parentteki bir methodu signature dgi�tirmeden child classa da yazarak kullanmaya denir. Child class�n PArentteki methodu
	// Kendine uayarlayarak - implement ederek kullanmas� amac� ile yap�l�r
	// Daima Child classdaki Parent classdakini ezer!
	
	
	
	
	public void hareket() {  /////// *********    Overriden Method      *******************
		System.out.println("T�m hayvanlar hareket ederler.");
	}
	
	public void beslenme() {
		System.out.println("T�m hayvanlar beslenir");
	}
	
	public void solunum() {
		System.out.println("T�m hayvanlar nefes al�r");
	}
	
	
	
}
