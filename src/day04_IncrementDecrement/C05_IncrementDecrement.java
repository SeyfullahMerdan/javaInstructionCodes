package day04_IncrementDecrement;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		
		System.out.println(sayi1+=5);   // bu islem sayi1'in degerini 5 artirip sayi1'e assign ediyor
                                        // dolayisiyla sayi1'in degeri kalici olarak degisiyor
		System.out.println(sayi1-6);
		System.out.println(sayi1*=5);
		System.out.println(sayi1/=10);
		System.out.println(sayi1++);
        System.out.println(sayi1--);    // her ne kadar = isareti gorunmese de sayi1++ veya -- isleminde assign vardir
                                        // dolayisyla deger kalici olarak degisir
	
	    System.out.println(sayi1+12); // burada say� degi�miyor atama i�lemi olmuyor
	    System.out.println(sayi1);     // bu yzden burada say� eski de�erini hat�rlay�p onu bize veriyor.
	
	}

}
