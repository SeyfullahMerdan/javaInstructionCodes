package day06_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		
		// �artlara ba�l� operat�rler. Mant�k sorular� gibi d���nebiliriz.
		//    && AND    ve    || OR  kullan�larak yap�l�r. 
		
		
		
		//System.out.println(5+3==8 || 6+5==10 || 5+3==4);   // iyimserdir. True olmas� i�in bir tane True yeterlidir.
		//System.out.println(5+3==8 && 6+5==10 && 7-2==3);  // M�kemmelliyet�idir. Hepsi True olmal�. Bir tane False False olmas�na yeter.
		
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c ;
		
		System.out.println(sonuc);
		
		// && ---- &  ikisi de kullan�labilir acak arada ufak bir n�ans vard�r.
		// ikincisinde b�t�n i�lemleri okur,ilkinde yanl��� buldugunda sonucu hemen verir. ikincide biraz uzun �al��m�� olur.
		// && i�areti ilk false'u buldugunda bu i�lemin sonucunun false olacag�n� bilir.Geriye kalan� kontrol etmez.
		// & i�areti ise �nce t�n i�lemleri bitirir. Sonra sonucu false olarak yazd�r�r.
		
		
		

	//	System.out.println(5+3==8 && 6+5==10 && 7-2==3);   // False ve  // False  sonu�lar�n� al�r�z.
	//	System.out.println(5+3==8 & 6+5==10 & 7-2==3);     // Yani sonu� degi�miyor.Java'n�n �al��mas� uzuyor.Her �arta tek tek bak�yor.
		
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		
		System.out.println(" yas<30 && boy>170 && cinsiyet=='M' "); // Yanl�� yazd�m!! Noktal� Virg�l i�inde yazarsam String verir bana.
		// ��leme tabi tutmak i�in t�rnak harici yazmam gerekliydi!!
		
		System.out.println(yas<30 && boy>170 && cinsiyet=='M');  //   AND i�areti tek False g�r�nce False verdi bize.
		
		
		
	}

}
