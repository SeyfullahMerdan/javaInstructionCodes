package day47_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 Bir map oluþturmadan önce Mape koyacagýmýz Key ve Value degerlerini incelemeliyiz.
		 Tüm degerleri koyabilmek için key ve value için object object seçebilriz.
		 Ama bu durumda map içerisindeki elemanlara ait bilgilere ulaþmakta zorlanabbiliriz.
		 Data türünü seçerken hem içine koyacagýmýz tüm elemanlarý kapsayacak bir data türü seçmeliyiz.
		 hem de içine koydugumuz tüm elemanlarý iþleyebilecek þekilde basit data türü seçmeliyiz.
		 */
		/*
		 Mapi oluþtururken Mapin türüne de karar vermeliyiz.  HashMap-LinkedHashMap-TreeMap
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

		// nosu 102 olan ögrencinin bilgilerini görelim
		
		System.out.println(sinif.get(102));    // Veli, Yan, QA
		System.out.println(sinif.get(104));   // Ayse, Can, QA
		
		// Mapdeki keyleri görebiliriz.
		System.out.println(sinif.keySet());  // [101, 102, 103, 104] Bir set olarak Key degerlerini döndürür.
				
		
		// valueleri görmek istersek  **mapdeki tüm valueler** **degerler,elementler**

		// Sadece görmek için bunu yazdýrabiliriz sinif.values
		System.out.println(sinif.values()); // [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA] Collection olarak
		// yazdýrma iþlemi dýþýnda bir þey yapamayýz. degiþtirme,eleman ekleme vs..  Atama yaparýz ve SM ile üzerinde oynarýz***
		
		// sýnýftaki ögrencilerin isimlerini bir listeye ekleyip yazdýralým.
		
		//Collection<String>valueList=sinif.values();
		//System.out.println("VALUE LÝST: " + valueList);
		
		List<String>valueList=new ArrayList<>(sinif.values());
		System.out.println(valueList); // [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]   ArrayList olarak
		
		System.out.println(valueList.size()); // 4. her birini tek uzunluk gibi aldý.
		
		
		List<String> isimListesi=new ArrayList<>();
		String bilgiler[] =new String [3]; // 1. elemaný alacam, 3e bölecem, sonrasýnda bu 3'ten 1.ciyi alýp listeye ekeyecem. Ayný iþlem digerlerinde de olacak.
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler=valueList.get(i).split(","); // Bilgiler arrayin içine attým. önce 1.string sonra 2.string
		    isimListesi.add(bilgiler[0]); // her seferinde 0'ýncý elemanlarý alacak ve listeye ekleyecek
			// Soyisimleri isteseydik indexi 1 yapýp soyisimleri alýrdýk.
		}
		System.out.println(isimListesi); // [Ali, Veli, Ali, Ayse]
		// SAdece map ile mapi kontrol edemeyiz. Çok geniþ bir çuval, mutlaka ekstra yöntemler gerekiyor.
	
		
		
	}

}
