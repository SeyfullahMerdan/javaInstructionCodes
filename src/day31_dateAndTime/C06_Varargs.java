package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {

		// Verilen sayýlarý toplayan bir method oluþturalým / I want to create one
		// method which ý can plus the numbers.

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40; // 100
		int e = 50; // 150
		int f = 60; // 210

		toplam(a, b); // Method oluþturdum

		toplam(a, b, c); // Ýlk oluþturdugumuzda kabul etmiyor, diger methodla uyuþmadýgý için. Yeni br
							// tane create et diyor.

		toplam(a, b, c, d); // Þuana kadar gördügümüz degiþken sayýda parametreli tek bir method
							// oluþturamýyoruz. Varargs çalýþacak...

		toplam(a, b, c, d, e); // varargs çalýþýr
		toplam(a, b, c, d, e, f); // // varargs çalýþýr

	}

	private static void toplam(int... a) {

		int toplam = 0;
		for (int i : a) {
			toplam += i;
		}

		System.out.println("varargs çalýþýr : " + toplam);

	}

	private static void toplam(int a, int b, int c) {
		System.out.println("Sayýlarýn toplamý : " + (a + b + c)); // TEk tek parametresine uygun method oluþturuyorum.
	}

	private static void toplam(int a, int b) {
		System.out.println("Sayýlarýn toplamý : " + (a + b));
	}

}
