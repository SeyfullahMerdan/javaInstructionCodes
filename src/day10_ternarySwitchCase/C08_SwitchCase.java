package day10_ternarySwitchCase;

public class C08_SwitchCase {

	public static void main(String[] args) {
	
		
        int gunNo=5 ;
		
		switch(gunNo) {
		
		case 1:
		case 2:   // Ayrý ayrý yazarak enerji harcamak yerine kýsayol yaptýk.
		case 3:   // ayný durumlar, ayný statü söz konusu ise hepsini boþ býrakýp en sonuncuya yazabilriz.
		case 4:   // 
		case 5:
			System.out.println("Hafta ici");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun numarasý yazýnýz.");
		
		}
	
	}

}
