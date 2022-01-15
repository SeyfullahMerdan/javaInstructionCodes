package day48_maps_Last;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		
		Map <Integer,String> ornek=MapOlustur.myMap();
		
		// ornek.clear();  tüm elemanlarý siler
		
		System.out.println(ornek.containsKey(110)); // boolean döner. içeriyor mu?
		System.out.println(ornek.containsValue("java")); // false döner çünkü tek baþýna degildir java.  Ali,Kan,java þeklindedir.
		// value degerini bir bütün olarak ele alarak , onun içerip içermedigine bakar.
		System.out.println(ornek.containsValue("Ali, Can, java"));//true
		
		Set <Entry<Integer,String>>entrySet=ornek.entrySet(); // herbir eleman entry
		
		int sayac=1;
		
		for (Entry <Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : "+ each);
			sayac++;
		}
		
		System.out.println(ornek.getOrDefault(110, "Girilen key mapde yok"));  // yoksa mesajý getiriyor
		System.out.println(ornek.getOrDefault(103, "Girilen key mapde yok"));   // varsa getriyor
		
		ornek.putIfAbsent(103, "Ali, Can, java"); // eklemeyecek    // listede vardý, gçsterdi ama eklemedi
		ornek.putIfAbsent(110, "Fikri, Yan, Qa"); // ekler     // listede yoktu sona ekledi
		
		
         sayac=1;
		
		for (Entry <Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : "+ each);
			sayac++;
		}
		
		
		String maptenString=ornek.toString();   // Stringe çevirip Stringe attým
		System.out.println(maptenString);  // {101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#, 110=Fikri, Yan, Qa}
		
		
		
		

	}

}
