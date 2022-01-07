package day38_overriding;

public class KumesHayvanlari extends Kuslar {
	public static void main(String[] args) {
// Alttaki üsttekini override eder!!***
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();  //  Tüm hayvanlar beslenir
		kms1.hareket();  //   Kümes hayvanlarý yürüyerek hareket ederler.
		kms1.solunum();    //  Kuþlar akcigerleri ile nefes alýr.
      
		
		Kuslar kms2=new Kuslar();
		
		kms2.beslenme(); //  Tüm hayvanlar beslenir
		
		kms2.hareket(); // Bekledigim budur>>>>> "Kuþlar uçarak hareket ederler"
//Ama Overriding oldugu için >>>>> "Kümes hayvanlarý yürüyerek hareket ederler." ****
           //Kendi spesifik özellikleri dýþýnda kuþlara tabi oluyor
           //Ama spesifik bir durumu varsa farkýný ortaya koyuyor.
                        /*Bu overriden ise Constructorda override eden classtan ise
		                  ben burada spesifik özelligi dikkate almalýyým der*/

		
		kms2.solunum(); //  Kuþlar akcigerleri ile nefes alýr.
	
	// BU KISIM YÜZDE 10luk KISIM ***
		
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme(); //  Tüm hayvanlar beslenir
		kms3.hareket(); //  Kuþlar uçarak hareket ederler.
		kms3.solunum(); //  Kuþlar akcigerleri ile nefes alýr.
		
		
		
		Animals kms4=new KumesHayvanlari();  // En spesifik olan hangisi ise onu alýyor!!!***
		kms4.beslenme(); // Tüm hayvanlar beslenir
		kms4.hareket(); //  Kümes hayvanlarý yürüyerek hareket ederler.    // override edilmiþti, en spesifik olaný aldý..***
		kms4.solunum(); //  Kuþlar akcigerleri ile nefes alýr.	  // override edilmiþti ve en spesifik olaný,kuþlardakini aldý..***
	
	
	   
	
	
	}
	

	public void hareket () {	
		super.hareket();
		
	}	
	
	
	
	
	public void beslenme () {
		System.out.println("Kardeþim ben cghildim. burasý daha spesifik , bu özelligi getir");
	}
	
	
	
	
}
