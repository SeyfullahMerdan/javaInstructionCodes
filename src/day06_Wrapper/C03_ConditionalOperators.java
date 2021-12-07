package day06_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		
		// Þartlara baðlý operatörler. Mantýk sorularý gibi düþünebiliriz.
		//    && AND    ve    || OR  kullanýlarak yapýlýr. 
		
		
		
		//System.out.println(5+3==8 || 6+5==10 || 5+3==4);   // iyimserdir. True olmasý için bir tane True yeterlidir.
		//System.out.println(5+3==8 && 6+5==10 && 7-2==3);  // Mükemmelliyetçidir. Hepsi True olmalý. Bir tane False False olmasýna yeter.
		
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ;
		
		System.out.println(sonuc);
		
		// && ---- &  ikisi de kullanýlabilir acak arada ufak bir nüans vardýr.
		// ikincisinde bütün iþlemleri okur,ilkinde yanlýþý buldugunda sonucu hemen verir. ikincide biraz uzun çalýþmýþ olur.
		// && iþareti ilk false'u buldugunda bu iþlemin sonucunun false olacagýný bilir.Geriye kalaný kontrol etmez.
		// & iþareti ise önce tün iþlemleri bitirir. Sonra sonucu false olarak yazdýrýr.
		
		
		

	//	System.out.println(5+3==8 && 6+5==10 && 7-2==3);   // False ve  // False  sonuçlarýný alýrýz.
	//	System.out.println(5+3==8 & 6+5==10 & 7-2==3);     // Yani sonuç degiþmiyor.Java'nýn çalýþmasý uzuyor.Her þarta tek tek bakýyor.
		
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		
		System.out.println(" yas<30 && boy>170 && cinsiyet=='M' "); // Yanlýþ yazdým!! Noktalý Virgül içinde yazarsam String verir bana.
		// Ýþleme tabi tutmak için týrnak harici yazmam gerekliydi!!
		
		System.out.println(yas<30 && boy>170 && cinsiyet=='M');  //   AND iþareti tek False görünce False verdi bize.
		
		
		
	}

}
