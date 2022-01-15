package day48_maps_Last;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

	// S�rekli bir maple i�lem yap�yorsam, s�rekli bu mapi olu�turmak yerine ayr� bir classtan map methodu olu�turarak
	// ekle ��kar yapmak yerine ihtiyac�m oldugunda class ismi yazarak o methodu �ag�rabilirim, kullanabilrim.
	
	public static Map<Integer,String> myMap() {
		
		Map<Integer,String> ornekMap=new HashMap<>();
		
		// 		 map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}

		ornekMap.put(101, "Ali, Can, java");
		ornekMap.put(102, "Veli, Yan, java");
		ornekMap.put(103, "Ali, Yan, C#");
		
	
		return ornekMap;
	}
	

	/*
    1) HashMap ve TreeMap synchronized ve thread-safe degildir.
 Map'ler arasindan synchronized ve thread-safe olan bir map'e ihtiyac vardir.
 Bu yuzden Hashtable olusturulmustur.
    2) Hashtable TRICK'i :Hashtable ne key icin ne de value icin "null" kullanamaaaaaaaz.!!!!
    3) Hashtable elemanlari rastgele siralar.
*/
	
	

}
