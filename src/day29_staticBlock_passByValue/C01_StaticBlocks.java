package day29_staticBlock_passByValue;

public class C01_StaticBlocks {


	static {
		System.out.println("static blok ne zaman çalýþacak?");
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Javada önce main method çalýþýr");
		}

	
	
	static {
		System.out.println("static blok mainden sonra da yazýlabilir. Ama önce çalýþýr");
	}
	// Eðer birden fazla static blok varsa Java üsttteki bloklarý önce çalýþtýrýr.
	
	
	
}
