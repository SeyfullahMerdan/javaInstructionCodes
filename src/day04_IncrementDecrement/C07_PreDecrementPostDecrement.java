package day04_IncrementDecrement;

public class C07_PreDecrementPostDecrement {

	public static void main(String[] args) {
		
		
        int sayi=10;
        
        sayi--;
        
        System.out.println(sayi); // 9
        
        int a=sayi--;   // önce atama yaptý sonra sayýyý azalttý
        
        
        System.out.println(a); //9
        System.out.println(sayi);//8
        
        
        System.out.println(--a); //  önce azaltýyor sonra yazdýrýyor... a 9 idi 9'u 8'e düþürüp bize yazdýrýr.


	}

}
