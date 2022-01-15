package day48_maps_Last;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		/* Verilen map�te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
		 map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		 Istenen dil  java
		 Sonuc  [Ali, Veli]  */

		
		Map<Integer,String> soruMap = MapOlustur.myMap();
		
		String istenenDil = "Java";
		
		
		dilBilenListesiOlustur(soruMap,istenenDil);
			
		System.out.println(      dilBilenListesiOlustur(soruMap,istenenDil)            );
		
	}

	
	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		// Bu method bana map d�n��t�recek
		
		List<String> dilBilenListesi=new ArrayList<>();
		
		// map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil  java
		
		soruMap.values(); // bana collection d�nd�r�yor
		
		List<String> valueList=new ArrayList<>(soruMap.values());
		// System.out.println(valueList);  [Ali, Can, java, Veli, Yan, java, Ali, Yan, C#]
 // Bu �� eleman� tek tek ele al�p, split ile b�l�p dil degeri verilen inputa e�it olanlar�n isim degerlerini listeme-bilBilenListesine-ekleyecegim
		
		//Split edince koyacag�m bir Arraye ihtiyac�m var, o y�zden Array olu�turacag�m
		String parcaliArr[]=new String [3]; // 3 eleman oldugu i�in. Her bir valuenin 3 elaman�n� arraye atacag�m. Sonra diger valuenin 3 elamn�n� atacam...
		for (String e : valueList) {
			
			parcaliArr=e.split(", "); // [Ali, Can, java,] �eklinde arraye at�lacak. Sonra diger value gelecek.
			
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}
			
			
			
			
		}
		
		// Keylerden kurtulmama laz�m bu y�zden valueleri ald�m. Tek say�l� keyleri getir diyebilirdi orada keyde i�in i�ine girerdi
		// veya sadece keylerle i�im olabilirdi.
		
		
		
		
		
		
		return dilBilenListesi;
	}

}
