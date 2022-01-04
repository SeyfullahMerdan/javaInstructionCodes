package day34_accessModifier_encapsulation;

public class C05 {

	private int asgariMaas = 4000;

	public static void main(String[] args) {

		// Bir classdaki herhangi bir class üyesine ulaþýlabilsin ama degiþtirilemesin
		// diyorsak,istiyorsak
		// 1- Class üyesini private yapýn
		// 2- private class üyelerine hiç bir þekilde ulaþým olmayacagý için sadece
		// görebilme yetkisi verilir.
		// 3- getter() methodu ile görebilme yetkisi veririz. oluþturacagýz.
		// 4- setter() methodu ile degiþtirebilme yetkisi veririz.
		//

	}

	public int getAsgariMaas() {
		return asgariMaas;
	}

}
