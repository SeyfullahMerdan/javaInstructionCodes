package day05_MatematikselÝslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {

		/*
		 kullanicidan 3 basamakli bir sayi alip rakamlar toplamini yazdiran bir
		 program yaziniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 3 basamaklý bir sayý giriniz.");
		
		int sayi=scan.nextInt();
		
		// sayi 573 olsun  --- bu örnek üzerinden gidelim.
		
		int rakamlarToplami=0;         // tek tek rakamlarý ayýrýp, bu rakamlarToplamýna aktaracagýz. Doðal olarak rakamlarýn toplamý olacak
		
		int rakam=sayi%10;             // 10 bölümünden kalan bana 1'ler basamagýný -3- verir.
		System.out.println(rakam);
		rakamlarToplami+=rakam;        //Increment yaptýk. Rakamlar toplamý 3 oldu.   
		                               // Sayým degiþmedi. Atama yapmadým hala 573. Fakat rakamlarToplami degiþti,þuanda 3 -atama yaptým çünkü.
		
		
		
		// 3'ten kurtulmak istiyorum çünkü 3 ile iþim bitti.
		// sayýyý 57 haline getirecem.
		
		
		sayi/=10;                              //   Ýncrement yaptýk ve  ayný zamanda sayýya yeni deger atadýk
		System.out.println(sayi);               // 573 ü 10 a böldü ve 53,7 buldu ancak INT oldugu için virgülü almadý ve 57 kaldý.
		
		rakam=sayi%10;
		
		
		rakamlarToplami+=rakam; 
		
		// sayi hala 57. 7 yi aldýk burada ve rakamlarToplamý konteynýrýna attýk.
		//þimdi 7'den kurtuacagýz.
		
		sayi/=10;
		 // sayý artýk 5. çünkü virgülü almaz ve tam olarak 5 yazar. Türü Int oldugu için.
		
		// ***** System.out.println(sayi); ****
		
		
		rakamlarToplami+=sayi;
		
		
		System.out.println("Girdiginiz sayinin rakamlar toplamý : " + rakamlarToplami);
		
		scan.close();
		
	}

}
