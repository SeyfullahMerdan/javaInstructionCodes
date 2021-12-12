package day10_ternarySwitchCase;

public class C11_StringMConcat {

	public static void main(String[] args) {
		
		// String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
        // jAVA bunlari yan yana ekler. Buna Concatenation denir.
        
        String isim="Ali";
        String soyisim="Can";
        
        System.out.println(isim +" " + soyisim); // Ali Can
        
        // ayni islemi + sembolu yerine concat() ile de yapabiliriz
        
        System.out.println(isim.concat(soyisim));
        
        System.out.println(isim.concat(" ").concat(soyisim)); // Ali Can
 

		// String Manipulation-Methods
	

	}

}
