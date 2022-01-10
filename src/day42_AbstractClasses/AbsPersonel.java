package day42_AbstractClasses;

public abstract class AbsPersonel { // Abstract yapmak istedigim classýn baþýna abstract þeklinde yazmam gerekiyor.

	
	// class ve methodu abstract olarak tanýmladýgýmda child classlar mecburen bu methodu override edecekler 
	
	
	// Zaten çalýþma ihtimali yok. Body olursa CTE verir,body koyulmaz
	public abstract void statu () ;
	
	// Mimari yapý önce oluþturuur ve kimleri child kimleri abstract yapacagýmýzý biliriz.
	
	
   // EÐER BÝR CLASSDAN OBJE OLUÞTURULMASINI ÝSTEMÝYORSAK VE BU CLASSI SADECE child class'larýn yapmalarý gereken görevleri BELÝRLEMEK 
  //  ÝÇÝN KULLANIYORSAK ABSTRACTÝON YAPARIZ !!
	
	
	public void concreteMethod() {  // Bunu implement etmek zorunda degilim. 
		System.out.println("personal classýndaki concrete method çalýþtý");
	}
	
	public abstract void kategori() ; // deneme olsun diye oluþturudum. Bunu oluþturursam child classýmda mutlaka bir tane
	// override edilmelidir, java hata verir. Bu methodu eklemede zorunluluk vardýr **keyword***abstract
	
	
	
	
}
