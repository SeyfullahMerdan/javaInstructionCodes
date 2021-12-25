package day26_forEachLoop_constructor;

public class C01_ForEachLoop {

	public static void main(String[] args) {
		

		// iki String array olusturunuz ve bu array�lerdeki ortak elemanlari For-each
		// loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana �Ortak eleman yok� yazdiriniz

		String arr1[] = { "A", "C", "B" };
		String arr2[] = { "A", "R", "O" };

		int flag = 0; // ka� tane ortak var ��renmek i�in olu�turduk. Varsa bayrak kalkm�� olacak. Saya�la ayn� mant�k ama farkl� i�lev.

		for (String each1 : arr1) {

			for (String each2 : arr2) {

				if (each1.equals(each2)) {
					System.out.println(flag+1 + " tane ortak eleman vard�r: " +each1);
					flag++; // Bayrak kalkt�ysa var kalkmad�ysa yoktur. 1 veya 0 gibi, ''var'' veya ''yok'' gibi d���nebiliriz.
					} 
				}
			}

		if (flag==0) {
			System.out.println("Ortak eleman yoktur.");
			}
	

	}

}
