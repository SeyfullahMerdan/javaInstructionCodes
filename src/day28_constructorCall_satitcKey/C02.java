package day28_constructorCall_satitcKey;

public class C02 {


	int x=5;
	static int y=10;
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// 3 obje olu�turup, degi�imleri g�relim ve degerlendirelim.


		C02 obje1=new C02();
		System.out.println("Obje1 i�in x : " + obje1.x + " obje1 i�in y: " + obje1.y     ); // Artt�r�lmadan, default degerer ile yazd�rd�m.
		
		obje1.x++;
		obje1.y++;
		System.out.println("i�lemden sonra Obje1 i�in x : " + obje1.x + " obje1 i�in y: " + obje1.y     );  // Her ikiside +1 artt�. y kal�c� oldu
		                                                                                     // x artt� ama sadce �imdilik. kal�c� degil.
		
		C02 obje2=new C02();
		System.out.println("Obje2 i�in x : " + obje2.x + " obje2 i�in y: " + obje2.y     );  
		//Obje2 i�in x : 5 obje2 i�in y: 11 // static olan degi�mi�ti.
		
		// Ayn� class i�inde iken static variablelara ula�mak i�in objeye ihtiya� yoktur. Kullan�rsak JAVA CTE vermez fakat
		// static variablea static yoldan ula� der.
		
		
		
		obje2.x++;
		y++;
		System.out.println("i�lemden sonra Obje2 i�in x : " + obje2.x + " obje2 i�in y: " + obje2.y     );  // Her ikiside +1 artt�. y tekrardan kal�c� oldu
                                                         // x artt� ama sadce �imdilik. kal�c� degil.
             
		System.out.println(obje1.x +" "+ obje1.y +" " + obje2.x+ " " +obje2.y ); // Objelerde atad�g�m�z deger ge�erli. // obje.1de y degi�ti,static
// Geriye y�nelik degi�tirmez ancak yeni bir yazd�rma i�lemimde obje1in eski degerine yenisini atar,��nk� statictir.
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
