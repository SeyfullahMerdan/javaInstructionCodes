package day47_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class C02_Maps {

	public static void main(String[] args) {
		// i�i�e map ou�turacaksak en i�eridekinden ba�laman�z tavsiye olunur.
		
		
		Map<String,String> ogr1Map=new HashMap<>();  // natural order i�in treeMap yapt�m.ASCII ye g�re order yapt�..
		ogr1Map.put("isim: ", "Ali");
		ogr1Map.put("soyisim: ", "Can");
		ogr1Map.put("brans: ", "J.dev");
		
		Map<String, String> ogr2Map = new HashMap<>();  // S�ralamaya kar��am�yoruz. DAg�n�k verebilir.
		ogr2Map.put("isim: ", "Veli");
		ogr2Map.put("soyisim: ", "Yan");
		ogr2Map.put("brans: ", "QA");		
		
		Map<String, String> ogr3Map = new HashMap<>();
		ogr3Map.put("isim: ", "Ali");
		ogr3Map.put("soyisim: ", "Yan");
		ogr3Map.put("brans: ", "C#");
		
		Map<String, String> ogr4Map = new HashMap<>();
		ogr4Map.put("isim: ", "Ay�e");
		ogr4Map.put("soyisim: ", "Kan");
		ogr4Map.put("brans: ", "QA");
		
		System.out.println("1.��renci " + ogr1Map);
		System.out.println("2.��renci " + ogr2Map);
		System.out.println("3.��renci " + ogr3Map);
		System.out.println("4.��renci " + ogr4Map);
		
		// nested map. 
		Map<Integer, Map<String,String>> sinifMap=new HashMap<>();
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		System.out.println(sinifMap);
    
		 //    {
		 //         101={soyisim: =Can, isim: =Ali, brans: =J.dev}, 
		 //         102={soyisim: =Yan, isim: =Veli, brans: =QA}, 
		 //         103={soyisim: =Yan, isim: =Ali, brans: =C#}, 
		 //         104={soyisim: =Kan, isim: =Ay�e, brans: =QA}
		 //                                                             }

	}

}
