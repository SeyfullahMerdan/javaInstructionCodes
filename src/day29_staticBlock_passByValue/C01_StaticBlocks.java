package day29_staticBlock_passByValue;

public class C01_StaticBlocks {


	static {
		System.out.println("static blok ne zaman �al��acak?");
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Javada �nce main method �al���r");
		}

	
	
	static {
		System.out.println("static blok mainden sonra da yaz�labilir. Ama �nce �al���r");
	}
	// E�er birden fazla static blok varsa Java �sttteki bloklar� �nce �al��t�r�r.
	
	
	
}
