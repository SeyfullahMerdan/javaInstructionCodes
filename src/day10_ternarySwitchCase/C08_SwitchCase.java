package day10_ternarySwitchCase;

public class C08_SwitchCase {

	public static void main(String[] args) {
	
		
        int gunNo=5 ;
		
		switch(gunNo) {
		
		case 1:
		case 2:   // Ayr� ayr� yazarak enerji harcamak yerine k�sayol yapt�k.
		case 3:   // ayn� durumlar, ayn� stat� s�z konusu ise hepsini bo� b�rak�p en sonuncuya yazabilriz.
		case 4:   // 
		case 5:
			System.out.println("Hafta ici");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun numaras� yaz�n�z.");
		
		}
	
	}

}
