package day12_indexOfStringManipulation;

public class C05_Contains {

	public static void main(String[] args) {
	
		// Contains cümlede kelimenin veya karakterin olup olmadýgýna bakar.

				String cumle="Çalýþýrsanýz, java öðrenmek çok kolay";
				
				System.out.println(!cumle.contains(" ")); // false
				System.out.println(cumle.contains("ýz, j")); // true
				
				System.out.println(cumle.contains("Hasan")); // false
		
				// Contains bize bir kelime veya kelime grubunun varlýgýný bildirir
				// sonuç boolean olarak döner bize. True veya False

	}

}
