package day10_ternarySwitchCase;

public class C10_SwitchCase {

	public static void main(String[] args) {
		
		// Verilen sayýyý inceleyin. girilen sayý ::
		//  10 ise '' iki basamaklý en kücük sayý ''
		//  100 ise ''üç basamaklý en küçük sayý 
		//  1000 ise dört basamklý en küçük sayý
	    // diðer durumlarda girdigin sayiyi degiþtirin yazdýrýn.
				
		int sayi=15;
				
		switch (sayi) {
				
				
	    case 10: 
		System.out.println("Ýki basamaklý en küçük sayý");
		break;
		case 100:
		System.out.println("Üç basamaklý en küçük sayý");
		break;
		case 1000:
		System.out.println("Dört bsamaklý en küçük sayý");
		break;
		default:
		System.out.println("Sayiyi degiþtiriniz. Geçersiz sayý.");
				}
		
		
	}

}
