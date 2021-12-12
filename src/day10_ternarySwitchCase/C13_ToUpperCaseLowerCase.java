package day10_ternarySwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
	
		// Verilen Stringin tamamýný büyük veya küçük harfe çevirir.
		
		
				String isim="ali";   // Bunu Ali olarak yazdýralým
				
				System.out.println( " "+isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2));
				
				// bu þekilde hata verir. Charlarý Matematiksel bir iþleme tabi tutar. ASCII deðerleri devreye girer.
				//Bu yüzden baþýna ---hiçlik-- '' koyacaðýz...
				
				
				// Türkçe lokal harfler kullanarak tamamini küçük harfe çevirelim.
				
				
				System.out.println(isim.toLowerCase(Locale.GERMANY));
				System.out.println(isim.toUpperCase(Locale.GERMAN));


	}

}
