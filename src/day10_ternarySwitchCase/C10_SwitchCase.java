package day10_ternarySwitchCase;

public class C10_SwitchCase {

	public static void main(String[] args) {
		
		// Verilen say�y� inceleyin. girilen say� ::
		//  10 ise '' iki basamakl� en k�c�k say� ''
		//  100 ise ''�� basamakl� en k���k say� 
		//  1000 ise d�rt basamkl� en k���k say�
	    // di�er durumlarda girdigin sayiyi degi�tirin yazd�r�n.
				
		int sayi=15;
				
		switch (sayi) {
				
				
	    case 10: 
		System.out.println("�ki basamakl� en k���k say�");
		break;
		case 100:
		System.out.println("�� basamakl� en k���k say�");
		break;
		case 1000:
		System.out.println("D�rt bsamakl� en k���k say�");
		break;
		default:
		System.out.println("Sayiyi degi�tiriniz. Ge�ersiz say�.");
				}
		
		
	}

}
