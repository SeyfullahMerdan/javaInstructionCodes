package day10_ternarySwitchCase;

public class C07_SwitchCase {

	public static void main(String[] args) {
		

		int gunNo=5 ;  // test datas� diyebilriiz. Caselerin durumunu belirleyecek
		
		switch(gunNo) {         // Swtich baslangic numarsini yer�n� soyler
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;  // E�er break koymazsak sistem geri kalanlar� da yazd�rmaya devam eder.
		case 3: 
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Lutfen gecerli bir gun numaras� yaz�n�z.");
		
		}	
		

	}

}
