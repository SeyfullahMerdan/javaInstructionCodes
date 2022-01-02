package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		System.out.println(tarihSaat);    // Mevcut tarih ve saati yazdýrýr.
		
		// Saati kendi istedigim biçimde yazdýrmak istiyorum.
		
		// Eðer tarih ve saati kendi istediigim biçimde yazdýrmak istersem: Gün / Ay / Yýl - saat:dakika  þeklinde yazdýrabilirim.
		
		// String yazma þeklimizi bildirecegiz.**
		DateTimeFormatter duzenli=DateTimeFormatter.ofPattern("dd/MMMM/YYYY - EEEE - HH:m");  // 02/12/2021 - 21:53
		
		System.out.println(duzenli.format(tarihSaat));  // 02/Ocak/2022 - Pazar - 20:56
		
		/*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini 
		 
		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami
		 
		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini
		 
		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		 
		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati
		 
		 a yazarsak AM veya PM degerini yazar
		 */	
	}

}
