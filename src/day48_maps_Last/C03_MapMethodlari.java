package day48_maps_Last;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		
		Map <Integer,String> ornek=MapOlustur.myMap();
		
		// ornek.clear();  t�m elemanlar� siler
		
		System.out.println(ornek.containsKey(110)); // boolean d�ner. i�eriyor mu?
		System.out.println(ornek.containsValue("java")); // false d�ner ��nk� tek ba��na degildir java.  Ali,Kan,java �eklindedir.
		// value degerini bir b�t�n olarak ele alarak , onun i�erip i�ermedigine bakar.
		System.out.println(ornek.containsValue("Ali, Can, java"));//true
		
		Set <Entry<Integer,String>>entrySet=ornek.entrySet(); // herbir eleman entry
		
		int sayac=1;
		
		for (Entry <Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : "+ each);
			sayac++;
		}
		
		System.out.println(ornek.getOrDefault(110, "Girilen key mapde yok"));  // yoksa mesaj� getiriyor
		System.out.println(ornek.getOrDefault(103, "Girilen key mapde yok"));   // varsa getriyor
		
		ornek.putIfAbsent(103, "Ali, Can, java"); // eklemeyecek    // listede vard�, g�sterdi ama eklemedi
		ornek.putIfAbsent(110, "Fikri, Yan, Qa"); // ekler     // listede yoktu sona ekledi
		
		
         sayac=1;
		
		for (Entry <Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : "+ each);
			sayac++;
		}
		
		
		String maptenString=ornek.toString();   // Stringe �evirip Stringe att�m
		System.out.println(maptenString);  // {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#, 110=Fikri, Yan, Qa}
		
		
		
		

	}

}
