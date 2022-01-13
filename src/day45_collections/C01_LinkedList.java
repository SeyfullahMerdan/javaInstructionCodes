package day45_collections;

import java.util.LinkedList;

public class C01_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList <Integer> ll = new LinkedList <> ();
		
		/*
		 Bir data tutacak kadar obje olu�turur. Head.. E�er add ile ekleme yaparsak HeapM de yeni bir obje olu�turur yar�s�na ekleneni
		 yar�s�na da referans� ekler. Bir tane daha ekleyince yeni ekleneni koyar ve yars�na da bir �ncekinin referans�n� koyar.
		 Sizden �ncekileri veya sonrakiler araya eleman sokuldugunda k�p�rdam�yor, araya halayda oldugu gibi giriyor
		 iki k�s�mdan olu�uyor: content yani i�erik ve adresi yani kodu
		 ilk eleman headdir ve data type yoktur sadece kodu vard�r,referans�. (pointer-adress)
		 soneleman ise nulldur. kuyruktaki eleman�n referans� null oluyor.
		 node-- veri ve adres ikisnin birlikte ismi
		 elemana ula�mada yava�t�rlar.
		 */
		
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);

		System.out.println(ll); // [5, 7]
		// Linked list'in iki tane interface parenti vard�r.
		// Bunlardan birisi list, �teki de Deque ==> Queue uzan�r. 3�ndeki t�m �zellikleri kullan�r.
		
		ll.add(0, 10); // list interfaceden gelen �zellik ile ba�a eleman ekleme
		System.out.println(ll); // [10, 5, 7]
		
		ll.addFirst(3);        // queue interfaceden gelen �zellikle ba�a eleman ekleme 
		System.out.println(ll); // [3, 10, 5, 7] eleman� en ba�a ekledi.
		
		
		LinkedList <Integer> ll2 = new LinkedList <> (); //  []

		ll2.addAll(ll); // Bo� bir ll2 listesine addAll yap�yorum..
		System.out.println(ll2); // [3, 10, 5, 7]  ilk listeyi komple bu listeye ekledi

		
		ll2.addAll(2, ll2); // 2. indexten itibaren bu listeyi ekle dedim...
		System.out.println(ll2); // [3, 10, 3, 10, 5, 7, 5, 7]  2. indexten itibaren kendini ekledi
		
		

	}

}
