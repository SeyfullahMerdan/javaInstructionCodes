package day28_constructorCall_satitcKey;

public class C02 {


	int x=5;
	static int y=10;
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// 3 obje oluþturup, degiþimleri görelim ve degerlendirelim.


		C02 obje1=new C02();
		System.out.println("Obje1 için x : " + obje1.x + " obje1 için y: " + obje1.y     ); // Arttýrýlmadan, default degerer ile yazdýrdým.
		
		obje1.x++;
		obje1.y++;
		System.out.println("iþlemden sonra Obje1 için x : " + obje1.x + " obje1 için y: " + obje1.y     );  // Her ikiside +1 arttý. y kalýcý oldu
		                                                                                     // x arttý ama sadce þimdilik. kalýcý degil.
		
		C02 obje2=new C02();
		System.out.println("Obje2 için x : " + obje2.x + " obje2 için y: " + obje2.y     );  
		//Obje2 için x : 5 obje2 için y: 11 // static olan degiþmiþti.
		
		// Ayný class içinde iken static variablelara ulaþmak için objeye ihtiyaç yoktur. Kullanýrsak JAVA CTE vermez fakat
		// static variablea static yoldan ulaþ der.
		
		
		
		obje2.x++;
		y++;
		System.out.println("iþlemden sonra Obje2 için x : " + obje2.x + " obje2 için y: " + obje2.y     );  // Her ikiside +1 arttý. y tekrardan kalýcý oldu
                                                         // x arttý ama sadce þimdilik. kalýcý degil.
             
		System.out.println(obje1.x +" "+ obje1.y +" " + obje2.x+ " " +obje2.y ); // Objelerde atadýgýmýz deger geçerli. // obje.1de y degiþti,static
// Geriye yönelik degiþtirmez ancak yeni bir yazdýrma iþlemimde obje1in eski degerine yenisini atar,çünkü statictir.
        C02 obje3 = new C02();
        
        obje3.x=20;
        obje3.y=40;
        
        
        System.out.println("obje3'den sonra obje1'in x :" + obje1.x);//6
        System.out.println("obje3'den sonra obje2'in x :" + obje2.x);//6
        System.out.println("obje3'den sonra obje3'in x :" + obje3.x);//20
        
        
        System.out.println("obje3'den sonra obje1'in y :" + obje1.y);//40
        System.out.println("obje3'den sonra obje2'in y :" + obje2.y);//40
        System.out.println("obje3'den sonra obje3'in y :" + obje3.y);//40      
        
        y=50;


		
	}


}
