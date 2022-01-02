package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ögrendim");

		sb.insert(4, "yý çok iyi"); // Ýnsert bir StringBuildere istenen indexden itibaren ekleme yapmamýza imkan
									// tanýr
									// StringBuilder olarak yazýlmýþ bir ifade,cümle,içerik degiþtirelebilir,
									// eklenip çýkarýlabilir.

		System.out.println(sb);   //Javayý çok iyi ögrendim

		sb.insert(7, "çok iyiyim", 0, 4); // Mevcut StringBuildere þu indexden itibaren þu stringdeki 0-5 indexlerin
											// arasýný kopyala yapýþtýr.
		System.out.println(sb);

	}

}
