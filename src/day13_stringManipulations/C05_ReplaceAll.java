package day13_stringManipulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {

		
		//           s==> bosluk /Space
		  //         S==> bosluk disi hersey
		    //       w==> tum harfler ve rakamlar
		      //     W==> harfler ve rakamlar disi hersey 
		        //   d==> Rakamlar
		        //   D==> Rakamlar disi hersey 
		
		
        String cumle= "Java    cok         zevkli";
        
        cumle=cumle.replaceAll("\\s+", " ");
        
        System.out.println(cumle); //Java cok zevkli
        
        
        // B�y�k harf olarak sadece J vard� o y�zden J gitti.
        System.out.println(cumle.replaceAll("[A-Z]", "")); //J
        
        System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ******
        System.out.println(cumle.replaceAll("\\s", "*")); //Java*cok*zevkli
		// Bo�luk harici ,,,,, bo�luklar�.....//
	
	 // replaceAll("[A-Z]", "")) bu �ekilde de kullan�labilir.
	
	
	}

}
