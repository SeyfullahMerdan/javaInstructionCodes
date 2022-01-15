package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 Bir map olu�turmadan �nce Mape koyacag�m�z Key ve Value degerlerini incelemeliyiz.
		 T�m degerleri koyabilmek i�in key ve value i�in object object se�ebilriz.
		 Ama bu durumda map i�erisindeki elemanlara ait bilgilere ula�makta zorlanabbiliriz.
		 Data t�r�n� se�erken hem i�ine koyacag�m�z t�m elemanlar� kapsayacak bir data t�r� se�meliyiz.
		 hem de i�ine koydugumuz t�m elemanlar� i�leyebilecek �ekilde basit data t�r� se�meliyiz.
		 */
		/*
		 Mapi olu�tururken Mapin t�r�ne de karar vermeliyiz.  HashMap-LinkedHashMap-TreeMap
		 */
		
		
		Map <Integer, String> sinif= new HashMap<>();
		
		sinif.put(101, "Ali, Can, J.Dev"  );
		sinif.put(102, "Veli, Yan, QA"  );
		sinif.put(103, "Ali, Yan, C#");
		
		
		int no=104;
		String isim= "Ayse";
		String soyisim= "Can";
		String brans= "QA";
		
		sinif.put(no,isim+", "+soyisim+", "+brans);
		System.out.println(sinif);
	    sinif.put(no, isim.concat(" "+soyisim.concat(" "+brans)));// SM ile de yapabildim..***
		System.out.println(sinif);

		// nosu 102 olan �grencinin bilgilerini g�relim
		
		System.out.println(sinif.get(102));    // Veli, Yan, QA
		System.out.println(sinif.get(104));   // Ayse, Can, QA
		
		// Mapdeki keyleri g�rebiliriz.
		System.out.println(sinif.keySet());  // [101, 102, 103, 104] Bir set olarak Key degerlerini d�nd�r�r.
				
		
		// valueleri g�rmek istersek  **mapdeki t�m valueler** **degerler,elementler**

		// Sadece g�rmek i�in bunu yazd�rabiliriz sinif.values
		System.out.println(sinif.values()); // [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA] Collection olarak
		// yazd�rma i�lemi d���nda bir �ey yapamay�z. degi�tirme,eleman ekleme vs..  Atama yapar�z ve SM ile �zerinde oynar�z***
		
		// s�n�ftaki �grencilerin isimlerini bir listeye ekleyip yazd�ral�m.
		
		//Collection<String>valueList=sinif.values();
		//System.out.println("VALUE L�ST: " + valueList);
		
		List<String>valueList=new ArrayList<>(sinif.values());
		System.out.println(valueList); // [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]   ArrayList olarak
		
		System.out.println(valueList.size()); // 4. her birini tek uzunluk gibi ald�.
		
		
		List<String> isimListesi=new ArrayList<>();
		String bilgiler[] =new String [3]; // 1. eleman� alacam, 3e b�lecem, sonras�nda bu 3'ten 1.ciyi al�p listeye ekeyecem. Ayn� i�lem digerlerinde de olacak.
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler=valueList.get(i).split(","); // Bilgiler arrayin i�ine att�m. �nce 1.string sonra 2.string
		    isimListesi.add(bilgiler[0]); // her seferinde 0'�nc� elemanlar� alacak ve listeye ekleyecek
			// Soyisimleri isteseydik indexi 1 yap�p soyisimleri al�rd�k.
		}
		System.out.println(isimListesi); // [Ali, Veli, Ali, Ayse]
		// SAdece map ile mapi kontrol edemeyiz. �ok geni� bir �uval, mutlaka ekstra y�ntemler gerekiyor.
	
		
		
	}

}
