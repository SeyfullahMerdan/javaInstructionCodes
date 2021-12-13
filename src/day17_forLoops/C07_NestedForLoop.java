package day17_forLoops;

public class C07_NestedForLoop {

	public static void main(String[] args) {
	
		
		
		// 1'den 4'e kadar say�lar� yanyana aralar�nda bir bo�luk b�rakarak yazd�r�n�z.

		for (int satir = 1; satir <= 4; satir++) { // OUTER FOR LOOP

			for (int i = 1; i <= 4; i++) { // �NNER FOR LOOP
				System.out.print(satir * i + " "); // �NNER FOR LOOP
			}

			System.out.println(""); // OUTER FOR LOOP
		}
		// K���k di�li , b�y�k di�li gibi d���nebiliriz. D��ar�daki for loop bir kez
		// degi�ince i�erideki for loop ba�tan sona degi�iyor.
		// D��ar�daki for loop bir daha art�nca i�eridki bir daha ba�tan sona �al���yor.
		// �art false olana kadar.
		// D��ard�daki 4 defa degi�iyor bu soruda. Buna nazaran i�erideki 4*4 (Her
		// seferde 4 defa) = 16 defa degi�mi� oluyor
		// 3 yazsak yukar�ya i�erideki 9 defa ; 5 yazsak 25 defa �al��m�� olacak.
		// �kisinin �arp�m� kadar element olu�ur. yukar�daki*i�rideki=

	}

}
