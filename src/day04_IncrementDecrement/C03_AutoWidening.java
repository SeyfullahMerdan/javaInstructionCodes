package day04_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1=44;
		short sayi2=sayi1;
		
		// esitligin sol taraf� short,sag taraf� byte
		// java itiraz etmiyor, data turufarkl� oldugu halde
		// atama yap�lan variablenin t�r� atanan degerden b�y�k oldugu i�in sorun olmaz. byte>>shorta...
		
		System.out.println("sayi2 : "+sayi2);
		
		
		int sayi3=55;
		double sayi4=sayi3;
		
		System.out.println("sayi4 : "+sayi4);
		
		// atanan degerin data t�r� , deger atanan variablenin data t�r�nden k���kse 
		// Java castingi otomatik yapar. Buna AUTO W�DEN�NG yazar...
		

	}

}
