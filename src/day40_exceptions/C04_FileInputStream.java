package day40_exceptions;

import java.io.FileInputStream;

public class C04_FileInputStream {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws Throwable   {
		
		// Javada bir dosyaya ulaþmak istedigimizde FileInputStream classýndan yardým alýrýz
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\javaFall2021\\src\\day40\\yazi");
		
		int k=fis.available();
		
		System.out.println(k);
		
		// Java bu kodda olasý bir problem ön görüyor
		// ve bu probleme karþý ne yapmasý gerektigini bize soruyor
		// (Yani altý çizilen her kod cte degildir!)
		
		
		// Bunun için iki durum söz konusu
		//1- try catch kullanarak bu problemi handle edip javanýn yoluna devam etmesini saglayabiliriz.
		//2- Eger dosya okunmuyorsa kod çalýþmasýn istiyorsak olayýn farkýnda oldugumuzu ve sorumlulugun bizde oldugunu 
		//   Java'ya söylemeliyiz.
		
		
		System.out.println("Görev Tamamlandý...");
		
		
	}

}
