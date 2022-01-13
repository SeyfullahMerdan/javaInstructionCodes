package day45_collections;

import java.util.LinkedList;

public class C01_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList <Integer> ll = new LinkedList <> ();
		
		/*
		 Bir data tutacak kadar obje oluþturur. Head.. Eðer add ile ekleme yaparsak HeapM de yeni bir obje oluþturur yarýsýna ekleneni
		 yarýsýna da referansý ekler. Bir tane daha ekleyince yeni ekleneni koyar ve yarsýna da bir öncekinin referansýný koyar.
		 Sizden öncekileri veya sonrakiler araya eleman sokuldugunda kýpýrdamýyor, araya halayda oldugu gibi giriyor
		 iki kýsýmdan oluþuyor: content yani içerik ve adresi yani kodu
		 ilk eleman headdir ve data type yoktur sadece kodu vardýr,referansý. (pointer-adress)
		 soneleman ise nulldur. kuyruktaki elemanýn referansý null oluyor.
		 node-- veri ve adres ikisnin birlikte ismi
		 elemana ulaþmada yavaþtýrlar.
		 */
		
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);

		System.out.println(ll); // [5, 7]
		// Linked list'in iki tane interface parenti vardýr.
		// Bunlardan birisi list, öteki de Deque ==> Queue uzanýr. 3ündeki tüm özellikleri kullanýr.
		
		ll.add(0, 10); // list interfaceden gelen özellik ile baþa eleman ekleme
		System.out.println(ll); // [10, 5, 7]
		
		ll.addFirst(3);        // queue interfaceden gelen özellikle baþa eleman ekleme 
		System.out.println(ll); // [3, 10, 5, 7] elemaný en baþa ekledi.
		
		
		LinkedList <Integer> ll2 = new LinkedList <> (); //  []

		ll2.addAll(ll); // Boþ bir ll2 listesine addAll yapýyorum..
		System.out.println(ll2); // [3, 10, 5, 7]  ilk listeyi komple bu listeye ekledi

		
		ll2.addAll(2, ll2); // 2. indexten itibaren bu listeyi ekle dedim...
		System.out.println(ll2); // [3, 10, 3, 10, 5, 7, 5, 7]  2. indexten itibaren kendini ekledi
		
		

	}

}
