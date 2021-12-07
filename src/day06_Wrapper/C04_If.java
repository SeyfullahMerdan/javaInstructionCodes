package day06_Wrapper;

public class C04_If {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if (a>5) {
			System.out.println("a sayýsý besden buyuk"); // true olduðu için ekranda yazdýrýr
		}
		
		if (a>b) {
			System.out.println("a syýsý b den buyuk"); // sonuç false oldugu için ekranda sonucu yazdýrmaz. Ama kod çalýþýr.
		}
		
		if (b>100) {
			System.out.println("b sayýsý 100'den buyuk"); // sonuç ikinci ile ayný. kod çalýþýr ama yazýlmaz.
		}
		
		
		// basit if cümleleri bagýmsýz çalýþýr
		// her bir if cümlesi kendi satýrýna bakar,sart true ise body çalýþýr
		// ...þart false ise body çalýþmaz.
		
 		
	
		

	}

}
