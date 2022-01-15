package day48_maps_Last;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		/* Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		 map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		 Istenen dil  java
		 Sonuc  [Ali, Veli]  */

		
		Map<Integer,String> soruMap = MapOlustur.myMap();
		
		String istenenDil = "Java";
		
		
		dilBilenListesiOlustur(soruMap,istenenDil);
			
		System.out.println(      dilBilenListesiOlustur(soruMap,istenenDil)            );
		
	}

	
	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		// Bu method bana map dönüþtürecek
		
		List<String> dilBilenListesi=new ArrayList<>();
		
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil  java
		
		soruMap.values(); // bana collection döndürüyor
		
		List<String> valueList=new ArrayList<>(soruMap.values());
		// System.out.println(valueList);  [Ali, Can, java, Veli, Yan, java, Ali, Yan, C#]
 // Bu üç elemaný tek tek ele alýp, split ile bölüp dil degeri verilen inputa eþit olanlarýn isim degerlerini listeme-bilBilenListesine-ekleyecegim
		
		//Split edince koyacagým bir Arraye ihtiyacým var, o yüzden Array oluþturacagým
		String parcaliArr[]=new String [3]; // 3 eleman oldugu için. Her bir valuenin 3 elamanýný arraye atacagým. Sonra diger valuenin 3 elamnýný atacam...
		for (String e : valueList) {
			
			parcaliArr=e.split(", "); // [Ali, Can, java,] þeklinde arraye atýlacak. Sonra diger value gelecek.
			
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}
			
			
			
			
		}
		
		// Keylerden kurtulmama lazým bu yüzden valueleri aldým. Tek sayýlý keyleri getir diyebilirdi orada keyde iþin içine girerdi
		// veya sadece keylerle iþim olabilirdi.
		
		
		
		
		
		
		return dilBilenListesi;
	}

}
