package day44_iterator_collections;

public class C06_CollectionsGiris {

	public static void main(String[] args) {
		
		// Nesnelerden olu�an bir toplulugu bir arada tutan yap�lard�r.
	// Listler interfacedir, bir �st� Collections yine interfacedir, bir �st� Iterable yine interfacedir
	// Iterabledeki interfacei somutla�t�ramad�k, alt� hep interface olunca, ArraListten constructor olu�turunca 
		// somutla�t�. Concret olan ilk classda somutla�t�rd�k
		
	// Interface oldugu i�in Listte Collectionda Iterableda olu�turulan t�m methodlar� ArrayList override etmi�tir
	// Bu �ekilde oradaki methodlar� kullanabiliyoruz
		
	  // List <String> liste=new List<>(); // Java kabul etmiyor,atama yapabileceginiz bir type degil diyor
		// Obje olu�tururken hep ayn� oluyordu iki taraf. Listti listten olu�turamazs�n diyor.
		
	
	/* 	
	    B�LMEM�Z GEREKEN 5 KEL�ME***
		
		1-) SET(KUME): KUME MANTIGIDIR. AYNI ELEMANI YEN�DEN EKLEYEMEY�Z. DUBL�CATE OLAMAZ!K�MED�R DENEB�L�R. 
		               //Yang�n T�p� varsa 1 taneye daha gerek yok.
		2-) QUEUE (SIRA): E�ER B�R YAPIDA BU �ZELL�K VARSA SIRALAMA �NEML�D�R. B�R�NC� B�R�NC�D�R; SONUNCU SONUNCU..
		               // bellir bir s�raya g�re kullanamal�y�z
		3-) L�NKED (BAGLI): ELEMANLAR B�RB�R�NE BAGLI DEMEKT�R. TEK BA�INA COLLECT�ON YOKTUR BU �S�MLE
		                   // halay gibi, birbirine bagl�. ba�ta olabilir sonda olabilir ama neticede birbirine bagl� olacak
		4-) TREE (DOGALSIRALI-NATURALORDER) :  B�R SIRALAMA S�Z KONUSUDUR. TREESET -- HEM SIRALI HEM DUBL�CATE M�MK�N DEG�L DEMEKT�R
		                  // tree varsa dogal bir s�ralama vard�r. ASCII s�ras� gibi, natural order. A D Z varsa B gelirse A ve D aras�na koyar**
		5-) HASH : �ZEL B�R ��FRELEME VE SIRALAMA Y�NTEM�D�R. // Yaz�l�mda �ok kullan�l�r.- T�m elementleri kendi i�inde mant�ga g�re koyar,kodlar.
		    // Size bir isim sorulduysa hash koduna bakarak kolayca bulur. ID No gibi diyebilriz. Loop ile aramk tek tek gezip aradg�m�z eleman
		      olup olmad�g�na bakar ama hashk kodda direk elinle koymu� gibi koda g�re bulursun!!**
		*/
		
		

	}

}
