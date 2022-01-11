package day43_Interface;

public interface C02_Interface {

	// to do listtir (yap�lacaklar listesi)
	// Concrete classlar� interfaceki t�m methodlar� implement etmek zorunda b�rak�r.
	// multiple interface m�mk�nd�r. birden fazla interface implement edilebilir.
	/*
	ABSTRACT vs INTERFACE
    1) Abstract :
     1.1 - Class`dir.
     1.2 - Abstract ve concrete method`lar konabilir.
     1.3 - Kismi olarak abstraction saglar.
     1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
     1.5 - Hiz acisindan avantajlidir
     1.6 - Icindeki tum nesnelerin â€œpublicâ€� olmasi zorunlu degildir.
     1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
     1.8 - Abstract class constructor`a sahiptir 
    
    2) Interface : 
    2.1 - Class degildir.
    2.2 - Sadece abstract method`lar konabilir.
    2.3 - Tam abstraction (soyutluk) saglar
    2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
    2.5 - Hiz acisindan abstract class`a gore yavastir.
    2.6 - Icindeki tum nesnelerin â€œpublicâ€� olmasi gerekir.
    2.7 - Method'lar static olamaz
    2.8 - Abstract class constructor`a sahiptir    */
    
	
   void motor();// Access modifier yazmazsak interfacede isek public olarak kabul eder.
	// normalde defaulttu ancak burada durum farklı.
	// Variablelar>>> public,static, final olmalıdır!***
	
	//private int sayi=10; >>>> kabul etmiyor.
	
	
   int sayi=10;  // final ve static kabul etti. 
             //Normalde başka bir classda yazınca final ve static diyince koyu mavi italik oluyordu
   
   
   // interfacede bodysi olan bir method yazmak isterseniz Java size iki alternatif sunar.
  //  1-) Methodun başına default keyword yazabilirsiniz.Ancak burada yazılan default access modifier degil,Javanın 
   // interface için özel kabul ettigi bir keyworddur
   // 2-) 
   
   
   // Javanın interface özel tanıdıgı bir keyworddur!
   public default void kaporta() {
	   System.out.println("Default keyword sayesinde body oluşturabildim.");   
   }
   
   
   public static void sanzuman() {
	   System.out.println("static ve public ile kullanabildim bodyyi");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	
	
	
	
	
	
}
