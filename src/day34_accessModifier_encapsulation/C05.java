package day34_accessModifier_encapsulation;

public class C05 {

	private int asgariMaas = 4000;

	public static void main(String[] args) {

		// Bir classdaki herhangi bir class �yesine ula��labilsin ama degi�tirilemesin
		// diyorsak,istiyorsak
		// 1- Class �yesini private yap�n
		// 2- private class �yelerine hi� bir �ekilde ula��m olmayacag� i�in sadece
		// g�rebilme yetkisi verilir.
		// 3- getter() methodu ile g�rebilme yetkisi veririz. olu�turacag�z.
		// 4- setter() methodu ile degi�tirebilme yetkisi veririz.
		//

	}

	public int getAsgariMaas() {
		return asgariMaas;
	}

}
