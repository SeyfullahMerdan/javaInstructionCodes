package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		
		// String olarak verilen 10.000 sayisinin binden b�y�k olup olmad�g�n� yazd�r�n.

		String sonuc = "10.000";

		sonuc = sonuc.replace(".", ""); // degi�tirmek istedigimizi bulur ve degi�tirir. �Evirip = ile sonuca Assign
										// ettik. Assign etmeden de yazd�rabilirdik

		System.out.println(sonuc);

		if (Integer.valueOf(sonuc) > 1000) {  // valueof methodu ile string bir numary� matematiksel i�leme soktum!!
			System.out.println("1000'den cok");
		} else {
			System.out.println("1000'den az");

		}
		
		
	}

}
