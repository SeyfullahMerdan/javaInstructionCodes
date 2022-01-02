package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {

		// Verilen say�lar� toplayan bir method olu�tural�m / I want to create one
		// method which � can plus the numbers.

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40; // 100
		int e = 50; // 150
		int f = 60; // 210

		toplam(a, b); // Method olu�turdum

		toplam(a, b, c); // �lk olu�turdugumuzda kabul etmiyor, diger methodla uyu�mad�g� i�in. Yeni br
							// tane create et diyor.

		toplam(a, b, c, d); // �uana kadar g�rd�g�m�z degi�ken say�da parametreli tek bir method
							// olu�turam�yoruz. Varargs �al��acak...

		toplam(a, b, c, d, e); // varargs �al���r
		toplam(a, b, c, d, e, f); // // varargs �al���r

	}

	private static void toplam(int... a) {

		int toplam = 0;
		for (int i : a) {
			toplam += i;
		}

		System.out.println("varargs �al���r : " + toplam);

	}

	private static void toplam(int a, int b, int c) {
		System.out.println("Say�lar�n toplam� : " + (a + b + c)); // TEk tek parametresine uygun method olu�turuyorum.
	}

	private static void toplam(int a, int b) {
		System.out.println("Say�lar�n toplam� : " + (a + b));
	}

}
