package day04_IncrementDecrement;

public class C07_PreDecrementPostDecrement {

	public static void main(String[] args) {
		
		
        int sayi=10;
        
        sayi--;
        
        System.out.println(sayi); // 9
        
        int a=sayi--;   // �nce atama yapt� sonra say�y� azaltt�
        
        
        System.out.println(a); //9
        System.out.println(sayi);//8
        
        
        System.out.println(--a); //  �nce azalt�yor sonra yazd�r�yor... a 9 idi 9'u 8'e d���r�p bize yazd�r�r.


	}

}
