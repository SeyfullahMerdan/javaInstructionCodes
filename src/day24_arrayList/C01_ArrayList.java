package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Array List de uzunluk degi�tirilebilir,esnektir. Liste olu�tural�m :

		List<String> isimList = new ArrayList<>();

		List<String> isimList2 = new ArrayList<String>();
		// Bazen e�itligin sag taraf�ndaki elmas i�ine data type yaz�lmazsa sorun
		// ��kabiliyor. Genelde sorun ��kmaz. Emin olmak i�in yazmakta fayda var.

		// List<String> isimList3 = new List<>(); -- E�itligin sag taraf�nda List<>
		// yazamay�z. ArrayList yazmam�z laz�m.

		List<Integer> sayilar = new ArrayList<>();
		// List data t�r� olarak primitive data t�rlerini kabul etmez.
		// List <boolean> sayilar = new ArrayList<>() ;

	
		
	}

}