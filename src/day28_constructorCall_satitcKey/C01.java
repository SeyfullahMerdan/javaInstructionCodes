package day28_constructorCall_satitcKey;

public class C01 {

	int x = 3;
	int y = 5;
	

	 // Bazý durumlarda constructor içinden baþka bir constructor çagýrmamýz gerekebilir.
	 // bunu this ile yaparýz. Yanýnda () vardýr, METHOD DEGÝLDÝR. Method Call yaptýgýmýzda kýrmýzý olmaz italic olur. Burada kýrmýzý
	       //*******  this() MUTLAKA ÝLK SATIRDA OLMALIDIR, ÝKÝNCÝ SATIRDA OLURSA JAVA HATA VERÝR*****  CTE verir.  
	               // ********* Bir CONSTRUCTOR ÝÇÝNDE BÝR CONSTRUCTOR ÇAGRILABÝLÝR*********
	 
	 
	 
	    C01() {
	        x += 1;                             // x=4 oldu. Bu obje için degeri degiþti
	        System.out.println("-x" + x);        // -x4
	    }
	    C01(int i) { // int i  3 olarak geldi
	        this();      // Constructor içinden baþka bir constructor çagýrmýþ. This() keywordu.
	        this.y = i;     // y=3 oldu
	        x += y;        // x=4dü y=3dü.  x=7 oldu
	        System.out.println("-x" + x);      // -x7
	    }
	    
	    C01(int i, int i2) {     
	        this(3);      // Buraya geldiginde ilk burasý çalýþtý ve 20. satýra gitti.
	        this.x -= 4;    // x=burada 7 idi. 7-4= x=3 oldu.
	        System.out.println("-x" + x);     // -x3
	    }
	    @SuppressWarnings("unused")
		public static void main(String[]args) {     // Class çalýþýnca önce burasý çalýþtý. 
	          // 35. satýrý gördü ve çalýþtý, parametreli constructoru bulup gitti. 27.satýra..
	         C01 c01= new C01(4,3);    // Yaptýgýmýz ataaýgýmýz degiþiklikler kalýcý olur.
	        // Constructýr çalýþmaya baþladýktan sonra x ve y ile ilgili degiþmeler (Ýnstance oldugu için) sadece c01 objesini ilgilendirir.
	        //  iþi bittiginde instance degerler ilk halini alýrlar. Çünkü x ve y instance variablelardýr.
	         
	         
	         // Yeni bir obje oluþturuyorum.
	         
	         C01 obje=new C01(7);     //  -x4  ,  -x11
	         
	         
	         C01 obje2=null;  // Null diyerek obje oluþturdum.
	         
	         C01 obje3=new C01();
	        
	    
	    }

}
