package day10_ternarySwitchCase;

public class C06_NestedIf {

	public static void main(String[] args) {
		
		
		// Soru2 : verilen karakteri inceleyin,
        // kucuk harf ise consola �Kucuk Harf� , 
        // buyuk harfse consola �Buyuk Harf� 
        // yoksa �girdiginiz karakter harf degil� yazdirin.
        
        char krk='-';
        
         // String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlis ise sonuc);
        
        String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : ( // �art yanl�� ise gelecek sonu�lar...//
                
                        (krk>='A'&& krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"
                            
                            );
        
        System.out.println(sonuc);

	}

}
