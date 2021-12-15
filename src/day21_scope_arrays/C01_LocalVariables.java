package day21_scope_arrays;

public class C01_LocalVariables {

	public static void main(String[] args) {
	
		// Java Local Variablelara default deger atmasý yapmaz. Kodlarýmýzda sorun
		// yaþamamak için oluþturdugumuz local variablelara uygun
		// bir deger atamamýzda fayda var.

		int sayi = 0; // o yüzden buraya mutlaka deger atarýz. 0 gibi...
		System.out.println(sayi); // deger atamasý yapýlmamýþtýr der java ve cte verir.

		// int sayi; // Bir localede ayný isimde birden fazla variable oluþturulamaz.
		// String sayi; // dublicate local variable diyor java. Data türü farklý olsa da
		// isim vermez.
		@SuppressWarnings("unused")
		String isim = "Ali";
	}

	public static void staticMethod() {

		// sayi; // Farklý bir localde oluþturulan variable (methodlarýn static olup
		// olmamasýna baglý olmaksýzýn)
		// farklý localde kullanýlamaz
		@SuppressWarnings("unused")
		String isim = "Veli"; // Localler farklý oldugu için ayný isimde oluþturmaya izin verdi.

	}

}
