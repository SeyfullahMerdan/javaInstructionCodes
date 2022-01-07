package day38_overriding;

public class KumesHayvanlari extends Kuslar {
	public static void main(String[] args) {
// Alttaki �sttekini override eder!!***
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();  //  T�m hayvanlar beslenir
		kms1.hareket();  //   K�mes hayvanlar� y�r�yerek hareket ederler.
		kms1.solunum();    //  Ku�lar akcigerleri ile nefes al�r.
      
		
		Kuslar kms2=new Kuslar();
		
		kms2.beslenme(); //  T�m hayvanlar beslenir
		
		kms2.hareket(); // Bekledigim budur>>>>> "Ku�lar u�arak hareket ederler"
//Ama Overriding oldugu i�in >>>>> "K�mes hayvanlar� y�r�yerek hareket ederler." ****
           //Kendi spesifik �zellikleri d���nda ku�lara tabi oluyor
           //Ama spesifik bir durumu varsa fark�n� ortaya koyuyor.
                        /*Bu overriden ise Constructorda override eden classtan ise
		                  ben burada spesifik �zelligi dikkate almal�y�m der*/

		
		kms2.solunum(); //  Ku�lar akcigerleri ile nefes al�r.
	
	// BU KISIM Y�ZDE 10luk KISIM ***
		
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme(); //  T�m hayvanlar beslenir
		kms3.hareket(); //  Ku�lar u�arak hareket ederler.
		kms3.solunum(); //  Ku�lar akcigerleri ile nefes al�r.
		
		
		
		Animals kms4=new KumesHayvanlari();  // En spesifik olan hangisi ise onu al�yor!!!***
		kms4.beslenme(); // T�m hayvanlar beslenir
		kms4.hareket(); //  K�mes hayvanlar� y�r�yerek hareket ederler.    // override edilmi�ti, en spesifik olan� ald�..***
		kms4.solunum(); //  Ku�lar akcigerleri ile nefes al�r.	  // override edilmi�ti ve en spesifik olan�,ku�lardakini ald�..***
	
	
	   
	
	
	}
	

	public void hareket () {	
		super.hareket();
		
	}	
	
	
	
	
	public void beslenme () {
		System.out.println("Karde�im ben cghildim. buras� daha spesifik , bu �zelligi getir");
	}
	
	
	
	
}
