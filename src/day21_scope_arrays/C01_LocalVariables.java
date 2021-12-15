package day21_scope_arrays;

public class C01_LocalVariables {

	public static void main(String[] args) {
	
		// Java Local Variablelara default deger atmas� yapmaz. Kodlar�m�zda sorun
		// ya�amamak i�in olu�turdugumuz local variablelara uygun
		// bir deger atamam�zda fayda var.

		int sayi = 0; // o y�zden buraya mutlaka deger atar�z. 0 gibi...
		System.out.println(sayi); // deger atamas� yap�lmam��t�r der java ve cte verir.

		// int sayi; // Bir localede ayn� isimde birden fazla variable olu�turulamaz.
		// String sayi; // dublicate local variable diyor java. Data t�r� farkl� olsa da
		// isim vermez.
		@SuppressWarnings("unused")
		String isim = "Ali";
	}

	public static void staticMethod() {

		// sayi; // Farkl� bir localde olu�turulan variable (methodlar�n static olup
		// olmamas�na bagl� olmaks�z�n)
		// farkl� localde kullan�lamaz
		@SuppressWarnings("unused")
		String isim = "Veli"; // Localler farkl� oldugu i�in ayn� isimde olu�turmaya izin verdi.

	}

}
