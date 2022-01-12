package day44_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {


	public static void main(String[] args) {

    // Java iterator, collection elemanlar�m�z�n aras�nda gezinmemize ve elemanlar� degi�tirmemize yarar.
// �uana kadar Array Ve Arraylisti g�rd�k, element toplayabilen data typeleri olarak, bundan sonra set ve map gibi olanlar var
  // Bir liste d���nelim indexi olmayan,,bu durumda elemanlar aras�nda gezinmek problem olu�turur.
		
		List <Integer> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		
		// index kullanmadan t�m elemanlar� 3 artt�r�yorum.
		
		for (Integer e : liste) {
			System.out.print(e+3 + ", "); // 8, 6, 10, 4, 12, 11, 5, 
		   // for ile her eleman� 3 artt�rd�m
		}
		
		System.out.println();
		
		System.out.print(liste); // tekrar yazd�rd�g�mda listemin eski hali geliyor
		// [5, 3, 7, 1, 9, 8, 2]
		// foreach i�erisinde yap�lan deg�iklikler localdir. Scope farkl�d�r ve o scope i�in ge�erlidir
		System.out.println();
		
      for (Integer e : liste) {
			e+=3;          // atama yap�yorum
			System.out.print(e + ", "); // 8, 6, 10, 4, 12, 11, 5, degerlerini ald�.
		}
		
		System.out.println(liste); // [5, 3, 7, 1, 9, 8, 2] Yukar�da atama yapt�g�m halde listem eski haline geri d�nd�
		// for each loop ile elementlere yapt�g�m etkiler kal�c� olmad�.
		
		//Yani foreach loop ile index kullanmadan t�m elementlere ula�abiliyoruz ama kal�c� degi�iklik yapam�yoruz.
		
		
	}

}
