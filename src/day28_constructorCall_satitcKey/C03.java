package day28_constructorCall_satitcKey;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// Java runtime bir programd�r. Run yu�una bas�l�nca java �al��maya ba�lar ve i�lemleri yapar.Javan�n i�i bittiginde her �ey bitmi� olur.
		// Ba�ka bir classda ayn� kodu tekrar yaz�nca tekrar en ba�tan ba�lar. B�rakt�g�m�z yerden degil.
		
		// ****************Diger class da en son Static Variablei 40 yapm��t�k ama burda 40'dan ba�lamaz. Java Run time bir programd�r.************
		
		    C02 obje1= new C02(); // static variablelar ve methodlar bulunduklar� class ile ilintilidir. (obje ile degil class ile)
		    //ba�ka bir classda iken C02deki static variable veya methoda ula�mak istedigimizde C02.staticVariableIsm� ve C02.staticMethod�smi()
		    // yazmam�z yeterli olur.   �rn:  Rose.adet;
	        System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
	        
	        obje1.x++;
	        C02.y++;  // Class ismi.Variable ismi ile objeye ula�t�m.
	        // static bir variablea class ismi �zerinden ula�mak yerine instance variablelar gibi obje ile ula�maya �al���rsan�z
	        // CTE vermez ama solda sar�! ile uyar�r. Static olarak ula� diye not verir.
	        
	        
	        System.out.println("islemden sonra obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
	        
	        
	        C02 obje2= new C02();
	        System.out.println("obje2 icin x : " + obje2.x + " obje2 icin y : " + C02.y);
	        
	        obje2.x++;
	        obje2.y++;
	        
	        System.out.println("islemden sonra obje2 icin x : " + obje2.x + " obje2 icin y : " + obje2.y);
	        
	        System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in "
	                           + " x : " + obje1.x + " y : " + obje1.y);
	        
	        C02 obje3 = new C02();
	        
	        obje3.x=20;
	        obje3.y=40;
	        
	        
	        System.out.println("obje3'den sonra obje1'in x :" + obje1.x);//6
	        System.out.println("obje3'den sonra obje2'in x :" + obje2.x);//6
	        System.out.println("obje3'den sonra obje3'in x :" + obje3.x);//20
	        
	        
	        System.out.println("obje3'den sonra obje1'in y :" + obje1.y);//40
	        System.out.println("obje3'den sonra obje2'in y :" + obje2.y);//40
	        System.out.println("obje3'den sonra obje3'in y :" + obje3.y);//40
	

	}

}
