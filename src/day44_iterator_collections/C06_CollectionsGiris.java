package day44_iterator_collections;

public class C06_CollectionsGiris {

	public static void main(String[] args) {
		
		// Nesnelerden oluþan bir toplulugu bir arada tutan yapýlardýr.
	// Listler interfacedir, bir üstü Collections yine interfacedir, bir üstü Iterable yine interfacedir
	// Iterabledeki interfacei somutlaþtýramadýk, altý hep interface olunca, ArraListten constructor oluþturunca 
		// somutlaþtý. Concret olan ilk classda somutlaþtýrdýk
		
	// Interface oldugu için Listte Collectionda Iterableda oluþturulan tüm methodlarý ArrayList override etmiþtir
	// Bu þekilde oradaki methodlarý kullanabiliyoruz
		
	  // List <String> liste=new List<>(); // Java kabul etmiyor,atama yapabileceginiz bir type degil diyor
		// Obje oluþtururken hep ayný oluyordu iki taraf. Listti listten oluþturamazsýn diyor.
		
	
	/* 	
	    BÝLMEMÝZ GEREKEN 5 KELÝME***
		
		1-) SET(KUME): KUME MANTIGIDIR. AYNI ELEMANI YENÝDEN EKLEYEMEYÝZ. DUBLÝCATE OLAMAZ!KÜMEDÝR DENEBÝLÝR. 
		               //Yangýn Tüpü varsa 1 taneye daha gerek yok.
		2-) QUEUE (SIRA): EÐER BÝR YAPIDA BU ÖZELLÝK VARSA SIRALAMA ÖNEMLÝDÝR. BÝRÝNCÝ BÝRÝNCÝDÝR; SONUNCU SONUNCU..
		               // bellir bir sýraya göre kullanamalýyýz
		3-) LÝNKED (BAGLI): ELEMANLAR BÝRBÝRÝNE BAGLI DEMEKTÝR. TEK BAÞINA COLLECTÝON YOKTUR BU ÝSÝMLE
		                   // halay gibi, birbirine baglý. baþta olabilir sonda olabilir ama neticede birbirine baglý olacak
		4-) TREE (DOGALSIRALI-NATURALORDER) :  BÝR SIRALAMA SÖZ KONUSUDUR. TREESET -- HEM SIRALI HEM DUBLÝCATE MÜMKÜN DEGÝL DEMEKTÝR
		                  // tree varsa dogal bir sýralama vardýr. ASCII sýrasý gibi, natural order. A D Z varsa B gelirse A ve D arasýna koyar**
		5-) HASH : ÖZEL BÝR ÞÝFRELEME VE SIRALAMA YÖNTEMÝDÝR. // Yazýlýmda çok kullanýlýr.- Tüm elementleri kendi içinde mantýga göre koyar,kodlar.
		    // Size bir isim sorulduysa hash koduna bakarak kolayca bulur. ID No gibi diyebilriz. Loop ile aramk tek tek gezip aradgýmýz eleman
		      olup olmadýgýna bakar ama hashk kodda direk elinle koymuþ gibi koda göre bulursun!!**
		*/
		
		

	}

}
