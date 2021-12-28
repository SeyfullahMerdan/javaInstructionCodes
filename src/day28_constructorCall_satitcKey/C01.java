package day28_constructorCall_satitcKey;

public class C01 {

	int x = 3;
	int y = 5;
	

	 // Baz� durumlarda constructor i�inden ba�ka bir constructor �ag�rmam�z gerekebilir.
	 // bunu this ile yapar�z. Yan�nda () vard�r, METHOD DEG�LD�R. Method Call yapt�g�m�zda k�rm�z� olmaz italic olur. Burada k�rm�z�
	       //*******  this() MUTLAKA �LK SATIRDA OLMALIDIR, �K�NC� SATIRDA OLURSA JAVA HATA VER�R*****  CTE verir.  
	               // ********* Bir CONSTRUCTOR ���NDE B�R CONSTRUCTOR �AGRILAB�L�R*********
	 
	 
	 
	    C01() {
	        x += 1;                             // x=4 oldu. Bu obje i�in degeri degi�ti
	        System.out.println("-x" + x);        // -x4
	    }
	    C01(int i) { // int i  3 olarak geldi
	        this();      // Constructor i�inden ba�ka bir constructor �ag�rm��. This() keywordu.
	        this.y = i;     // y=3 oldu
	        x += y;        // x=4d� y=3d�.  x=7 oldu
	        System.out.println("-x" + x);      // -x7
	    }
	    
	    C01(int i, int i2) {     
	        this(3);      // Buraya geldiginde ilk buras� �al��t� ve 20. sat�ra gitti.
	        this.x -= 4;    // x=burada 7 idi. 7-4= x=3 oldu.
	        System.out.println("-x" + x);     // -x3
	    }
	    @SuppressWarnings("unused")
		public static void main(String[]args) {     // Class �al���nca �nce buras� �al��t�. 
	          // 35. sat�r� g�rd� ve �al��t�, parametreli constructoru bulup gitti. 27.sat�ra..
	         C01 c01= new C01(4,3);    // Yapt�g�m�z ataa�g�m�z degi�iklikler kal�c� olur.
	        // Construct�r �al��maya ba�lad�ktan sonra x ve y ile ilgili degi�meler (�nstance oldugu i�in) sadece c01 objesini ilgilendirir.
	        //  i�i bittiginde instance degerler ilk halini al�rlar. ��nk� x ve y instance variablelard�r.
	         
	         
	         // Yeni bir obje olu�turuyorum.
	         
	         C01 obje=new C01(7);     //  -x4  ,  -x11
	         
	         
	         C01 obje2=null;  // Null diyerek obje olu�turdum.
	         
	         C01 obje3=new C01();
	        
	    
	    }

}
