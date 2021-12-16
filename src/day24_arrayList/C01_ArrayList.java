package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Array List de uzunluk degiþtirilebilir,esnektir. Liste oluþturalým :

		List<String> isimList = new ArrayList<>();

		List<String> isimList2 = new ArrayList<String>();
		// Bazen eþitligin sag tarafýndaki elmas içine data type yazýlmazsa sorun
		// çýkabiliyor. Genelde sorun çýkmaz. Emin olmak için yazmakta fayda var.

		// List<String> isimList3 = new List<>(); -- Eþitligin sag tarafýnda List<>
		// yazamayýz. ArrayList yazmamýz lazým.

		List<Integer> sayilar = new ArrayList<>();
		// List data türü olarak primitive data türlerini kabul etmez.
		// List <boolean> sayilar = new ArrayList<>() ;

	
		
	}

}