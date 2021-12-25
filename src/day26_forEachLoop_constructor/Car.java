package day26_forEachLoop_constructor;

public class Car {

	/* Java biz bir class oluþturdugumuzda o classdan obje üretecegimizi bilir ve her classa default bir constructor yerleþtirir
	Javanýn classa koydugu bu default constructor görülmez. Ama obje üretmen üzere kod yazdýgýmýzda otomatik olarak devreye girer.
	*/
	// Bir Constructor oluþturmak çok kolaydýr. Method'a benzer ama Method'dan farklýdýr.
	
	// 1-) Constructor ismi Class ismi ile ayný olmalýdýr. (Bu class için Car olmalýdýr.)
	
	// 2-) class isimleri büyük harfle baþladýgý için Constructor ismi de büyük harfle baþlamalýdýr!
	// (Methoddan birinci farký budur. Methodlar küçük veya büyük harfle baþlar...)	
	
	// 3-) Constructor'larýn return type'i olmaz.
	// (Methoddan ikinci farký budur. Methodlarýn mutlaka return type olmalýdýr...)
	
	
	public Car (){ }   // Java'nýn her class da oluþturduðu Constructor budur.   //  Car (){ }  ----- bu þekilde de kullanýlabilir.

    public int yil=2005;
	String renk;
	String model;
	double km;
	boolean satilikMi;
	
	// Bugün itibari ile classlarda main method olma mecburiyeti kaldýrýlmýþtýr.
	
	// Ancak bildigimiz gibi main method olmayan bir class direk çalýþtýrýlamaz.
	
	// Main methodu olmayan classlar baþka classlardan obje oluþturularak kullanýlmak üzere 
	//         ihtiyac duyulan variable ve methodlarý sakladýgýmýz bir depo gibidir.
	

}
