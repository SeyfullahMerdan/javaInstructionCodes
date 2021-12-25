package day26_forEachLoop_constructor;

public class C01_ForEachLoop {

	public static void main(String[] args) {
		

		// iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each
		// loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

		String arr1[] = { "A", "C", "B" };
		String arr2[] = { "A", "R", "O" };

		int flag = 0; // kaç tane ortak var öðrenmek için oluþturduk. Varsa bayrak kalkmýþ olacak. Sayaçla ayný mantýk ama farklý iþlev.

		for (String each1 : arr1) {

			for (String each2 : arr2) {

				if (each1.equals(each2)) {
					System.out.println(flag+1 + " tane ortak eleman vardýr: " +each1);
					flag++; // Bayrak kalktýysa var kalkmadýysa yoktur. 1 veya 0 gibi, ''var'' veya ''yok'' gibi düþünebiliriz.
					} 
				}
			}

		if (flag==0) {
			System.out.println("Ortak eleman yoktur.");
			}
	

	}

}
