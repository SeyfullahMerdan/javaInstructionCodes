package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci {

	  Ustabasi(){   // ***********Constructor obje oluþturmak için kullanýlýrdý. Þuan bir tane p.siz constructor oluþturdum.*******
		System.out.println("Ustabasi parametresiz constructor çalýþtý"); // >>>>>>>>>Çalýþtýgýný görmek için içine SYSO ile yazdýrýyorum.	
	}   //*****Bir obje oluþturmak için constructora ihtiyacým var ve mutlaka consturctor çalýþmalý aksi halde obje çalýþmaz,olmaz!!**********
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi(); // obje için constructor oluþturdum
		
		// Javada her class oluþturuldugunda otomatik olarak default constructor oluþturuldugu gibi
		// Child class da oluþturulan her bir constructorýn ilk satýrýnda gizli super () constructorý oluþturur. 
		
		// extends varsa super vardýr. Her bir constructorýn ilk satýrýnda Super yazar(gizli de olsa).
		
		
		//*********Ya this. olur ya super() olur ********* ikisi de ilk satýrda olmak istiyor ikis birdn olamaz*****
		
	}

}