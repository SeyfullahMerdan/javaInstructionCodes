package day35_encapsulation_inheritance;

public class C02_Setter {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		C01 ali=new C01();
		
	//	System.out.println(ali.isGecerMi());
	//	System.out.println(ali.getNot());
		/*
		ali.isGecerMi()=true;    Methodu g�rebiliyoruz, degi�tiremiyoruz
		ali.getNot()=60;
        */
			
		// ��remen notu girebilsin ama t�m notlar� g�remesin
		// sadece ge�ip ge�emedigini g�rs�n

        C01 ogr1=new C01();
        
        System.out.println(  ogr1.isGecerMi()    );  // false

        ogr1.setNot(60);  // bir methoddur ve parametre girmemiz laz�m.��rencinin notunu yazd�ramam,get not laz�m onun i�in
        
      
        System.out.println(ogr1.isGecerMi());  // Setle ba�lamad�g� i�in get tir Boolean da getler is ile ba�lar. 
        // Set methodlar� her zaman set ile ba�lar

		
	}

}
