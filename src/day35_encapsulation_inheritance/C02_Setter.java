package day35_encapsulation_inheritance;

public class C02_Setter {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		C01 ali=new C01();
		
	//	System.out.println(ali.isGecerMi());
	//	System.out.println(ali.getNot());
		/*
		ali.isGecerMi()=true;    Methodu görebiliyoruz, degiþtiremiyoruz
		ali.getNot()=60;
        */
			
		// öðremen notu girebilsin ama tüm notlarý göremesin
		// sadece geçip geçemedigini görsün

        C01 ogr1=new C01();
        
        System.out.println(  ogr1.isGecerMi()    );  // false

        ogr1.setNot(60);  // bir methoddur ve parametre girmemiz lazým.Öðrencinin notunu yazdýramam,get not lazým onun için
        
      
        System.out.println(ogr1.isGecerMi());  // Setle baþlamadýgý için get tir Boolean da getler is ile baþlar. 
        // Set methodlarý her zaman set ile baþlar

		
	}

}
