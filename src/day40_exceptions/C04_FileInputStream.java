package day40_exceptions;

import java.io.FileInputStream;

public class C04_FileInputStream {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Throwable   {
		
		// Javada bir dosyaya ula�mak istedigimizde FileInputStream class�ndan yard�m al�r�z
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\javaFall2021\\src\\day40\\yazi");
		
		int k=fis.available();
		
		System.out.println(k);
		
		// Java bu kodda olas� bir problem �n g�r�yor
		// ve bu probleme kar�� ne yapmas� gerektigini bize soruyor
		// (Yani alt� �izilen her kod cte degildir!)
		
		
		// Bunun i�in iki durum s�z konusu
		//1- try catch kullanarak bu problemi handle edip javan�n yoluna devam etmesini saglayabiliriz.
		//2- Eger dosya okunmuyorsa kod �al��mas�n istiyorsak olay�n fark�nda oldugumuzu ve sorumlulugun bizde oldugunu 
		//   Java'ya s�ylemeliyiz.
		
		
		System.out.println("G�rev Tamamland�...");
		
		
	}

}
