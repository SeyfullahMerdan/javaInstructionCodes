package day28_constructorCall_satitcKey;

public class C03 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// Java runtime bir programdýr. Run yuþuna basýlýnca java çalýþmaya baþlar ve iþlemleri yapar.Javanýn iþi bittiginde her þey bitmiþ olur.
		// Baþka bir classda ayný kodu tekrar yazýnca tekrar en baþtan baþlar. Býraktýgýmýz yerden degil.
		
		// ****************Diger class da en son Static Variablei 40 yapmýþtýk ama burda 40'dan baþlamaz. Java Run time bir programdýr.************
		
		    C02 obje1= new C02(); // static variablelar ve methodlar bulunduklarý class ile ilintilidir. (obje ile degil class ile)
		    //baþka bir classda iken C02deki static variable veya methoda ulaþmak istedigimizde C02.staticVariableIsmý ve C02.staticMethodÝsmi()
		    // yazmamýz yeterli olur.   örn:  Rose.adet;
	        System.out.println("obje1 icin x : " + obje1.x + " obje1 icin y : " + C02.y);
	        
	        obje1.x++;
	        C02.y++;  // Class ismi.Variable ismi ile objeye ulaþtým.
	        // static bir variablea class ismi üzerinden ulaþmak yerine instance variablelar gibi obje ile ulaþmaya çalýþýrsanýz
	        // CTE vermez ama solda sarý! ile uyarýr. Static olarak ulaþ diye not verir.
	        
	        
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
