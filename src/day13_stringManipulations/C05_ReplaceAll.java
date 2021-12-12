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
        
        
        // Büyük harf olarak sadece J vardý o yüzden J gitti.
        System.out.println(cumle.replaceAll("[A-Z]", "")); //J
        
        System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ******
        System.out.println(cumle.replaceAll("\\s", "*")); //Java*cok*zevkli
		// Boþluk harici ,,,,, boþluklarý.....//
	
	 // replaceAll("[A-Z]", "")) bu þekilde de kullanýlabilir.
	
	
	}

}
