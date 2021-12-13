package day17_forLoops;

public class C07_NestedForLoop {

	public static void main(String[] args) {
	
		
		
		// 1'den 4'e kadar sayýlarý yanyana aralarýnda bir boþluk býrakarak yazdýrýnýz.

		for (int satir = 1; satir <= 4; satir++) { // OUTER FOR LOOP

			for (int i = 1; i <= 4; i++) { // ÝNNER FOR LOOP
				System.out.print(satir * i + " "); // ÝNNER FOR LOOP
			}

			System.out.println(""); // OUTER FOR LOOP
		}
		// Küçük diþli , büyük diþli gibi düþünebiliriz. Dýþarýdaki for loop bir kez
		// degiþince içerideki for loop baþtan sona degiþiyor.
		// Dýþarýdaki for loop bir daha artýnca içeridki bir daha baþtan sona çalýþýyor.
		// Þart false olana kadar.
		// Dýþardýdaki 4 defa degiþiyor bu soruda. Buna nazaran içerideki 4*4 (Her
		// seferde 4 defa) = 16 defa degiþmiþ oluyor
		// 3 yazsak yukarýya içerideki 9 defa ; 5 yazsak 25 defa çalýþmýþ olacak.
		// Ýkisinin çarpýmý kadar element oluþur. yukarýdaki*içrideki=

	}

}
