package day42_AbstractClasses;

public abstract class AbsPersonel { // Abstract yapmak istedigim class�n ba��na abstract �eklinde yazmam gerekiyor.

	
	// class ve methodu abstract olarak tan�mlad�g�mda child classlar mecburen bu methodu override edecekler 
	
	
	// Zaten �al��ma ihtimali yok. Body olursa CTE verir,body koyulmaz
	public abstract void statu () ;
	
	// Mimari yap� �nce olu�turuur ve kimleri child kimleri abstract yapacag�m�z� biliriz.
	
	
   // E�ER B�R CLASSDAN OBJE OLU�TURULMASINI �STEM�YORSAK VE BU CLASSI SADECE child class'lar�n yapmalar� gereken g�revleri BEL�RLEMEK 
  //  ���N KULLANIYORSAK ABSTRACT�ON YAPARIZ !!
	
	
	public void concreteMethod() {  // Bunu implement etmek zorunda degilim. 
		System.out.println("personal class�ndaki concrete method �al��t�");
	}
	
	public abstract void kategori() ; // deneme olsun diye olu�turudum. Bunu olu�turursam child class�mda mutlaka bir tane
	// override edilmelidir, java hata verir. Bu methodu eklemede zorunluluk vard�r **keyword***abstract
	
	
	
	
}
