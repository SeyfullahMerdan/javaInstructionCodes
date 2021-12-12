package day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		
		// String olarak verilen 10.000 sayisinin binden büyük olup olmadýgýný yazdýrýn.

		String sonuc = "10.000";

		sonuc = sonuc.replace(".", ""); // degiþtirmek istedigimizi bulur ve degiþtirir. ÇEvirip = ile sonuca Assign
										// ettik. Assign etmeden de yazdýrabilirdik

		System.out.println(sonuc);

		if (Integer.valueOf(sonuc) > 1000) {  // valueof methodu ile string bir numaryý matematiksel iþleme soktum!!
			System.out.println("1000'den cok");
		} else {
			System.out.println("1000'den az");

		}
		
		
	}

}
