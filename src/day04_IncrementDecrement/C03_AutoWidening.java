package day04_IncrementDecrement;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		byte sayi1=44;
		short sayi2=sayi1;
		
		// esitligin sol tarafý short,sag tarafý byte
		// java itiraz etmiyor, data turufarklý oldugu halde
		// atama yapýlan variablenin türü atanan degerden büyük oldugu için sorun olmaz. byte>>shorta...
		
		System.out.println("sayi2 : "+sayi2);
		
		
		int sayi3=55;
		double sayi4=sayi3;
		
		System.out.println("sayi4 : "+sayi4);
		
		// atanan degerin data türü , deger atanan variablenin data türünden küçükse 
		// Java castingi otomatik yapar. Buna AUTO WÝDENÝNG yazar...
		

	}

}
