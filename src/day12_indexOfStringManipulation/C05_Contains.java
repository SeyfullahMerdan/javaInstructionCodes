package day12_indexOfStringManipulation;

public class C05_Contains {

	public static void main(String[] args) {
	
		// Contains c�mlede kelimenin veya karakterin olup olmad�g�na bakar.

				String cumle="�al���rsan�z, java ��renmek �ok kolay";
				
				System.out.println(!cumle.contains(" ")); // false
				System.out.println(cumle.contains("�z, j")); // true
				
				System.out.println(cumle.contains("Hasan")); // false
		
				// Contains bize bir kelime veya kelime grubunun varl�g�n� bildirir
				// sonu� boolean olarak d�ner bize. True veya False

	}

}
