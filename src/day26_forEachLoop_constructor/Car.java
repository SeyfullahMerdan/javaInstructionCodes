package day26_forEachLoop_constructor;

public class Car {

	/* Java biz bir class olu�turdugumuzda o classdan obje �retecegimizi bilir ve her classa default bir constructor yerle�tirir
	Javan�n classa koydugu bu default constructor g�r�lmez. Ama obje �retmen �zere kod yazd�g�m�zda otomatik olarak devreye girer.
	*/
	// Bir Constructor olu�turmak �ok kolayd�r. Method'a benzer ama Method'dan farkl�d�r.
	
	// 1-) Constructor ismi Class ismi ile ayn� olmal�d�r. (Bu class i�in Car olmal�d�r.)
	
	// 2-) class isimleri b�y�k harfle ba�lad�g� i�in Constructor ismi de b�y�k harfle ba�lamal�d�r!
	// (Methoddan birinci fark� budur. Methodlar k���k veya b�y�k harfle ba�lar...)	
	
	// 3-) Constructor'lar�n return type'i olmaz.
	// (Methoddan ikinci fark� budur. Methodlar�n mutlaka return type olmal�d�r...)
	
	
	public Car (){ }   // Java'n�n her class da olu�turdu�u Constructor budur.   //  Car (){ }  ----- bu �ekilde de kullan�labilir.

    public int yil=2005;
	String renk;
	String model;
	double km;
	boolean satilikMi;
	
	// Bug�n itibari ile classlarda main method olma mecburiyeti kald�r�lm��t�r.
	
	// Ancak bildigimiz gibi main method olmayan bir class direk �al��t�r�lamaz.
	
	// Main methodu olmayan classlar ba�ka classlardan obje olu�turularak kullan�lmak �zere 
	//         ihtiyac duyulan variable ve methodlar� saklad�g�m�z bir depo gibidir.
	

}
