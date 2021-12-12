package day13_stringManipulations;

import java.util.Scanner;

public class C03_Replace {

	public static void main(String[] args) {
		
	String str= "Java ogrenmek cok zevkli" ;
		
		System.out.println(str.replace(" ", ""));  // atama yapmýyor!!!!!!!!!*******
		
		System.out.println(str.replace("ogrenmek", "kod yazmak"));
		
		System.out.println(str.replace("java", "kod"));
		
		System.out.println(str.replace("e", "i"));
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen þifrenizi büyük harf küçük harf iþaret ve rakam olacak þekilde giriniz");
		
		String sifre=scan.next();
		
		System.out.println(sifre.replaceAll(sifre, "******"));
		
		scan.close();

	}

}
