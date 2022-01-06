package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class Ustabasi extends Isci {

	  Ustabasi(){   // ***********Constructor obje olu�turmak i�in kullan�l�rd�. �uan bir tane p.siz constructor olu�turdum.*******
		System.out.println("Ustabasi parametresiz constructor �al��t�"); // >>>>>>>>>�al��t�g�n� g�rmek i�in i�ine SYSO ile yazd�r�yorum.	
	}   //*****Bir obje olu�turmak i�in constructora ihtiyac�m var ve mutlaka consturctor �al��mal� aksi halde obje �al��maz,olmaz!!**********
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi(); // obje i�in constructor olu�turdum
		
		// Javada her class olu�turuldugunda otomatik olarak default constructor olu�turuldugu gibi
		// Child class da olu�turulan her bir constructor�n ilk sat�r�nda gizli super () constructor� olu�turur. 
		
		// extends varsa super vard�r. Her bir constructor�n ilk sat�r�nda Super yazar(gizli de olsa).
		
		
		//*********Ya this. olur ya super() olur ********* ikisi de ilk sat�rda olmak istiyor ikis birdn olamaz*****
		
	}

}