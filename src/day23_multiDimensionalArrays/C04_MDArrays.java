package day23_multiDimensionalArrays;

public class C04_MDArrays {

	public static void main(String[] args) {
	
		// Asagidaki multi dimensional array�in ic array�lerindeki son elemanlarin
		// carpimini ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 2 }, { 6 } };

		int sonuc = 1;

		for (int i = 0; i < arr.length; i++) { // Outer loopu �al��t�rd�m ve her seferinde elementlerini getirdim

			int sonElementIndex = arr[i].length - 1; //Getirdigim elementlerden sadece sonuncusunu al�p ekledim

			sonuc *= arr[i][sonElementIndex]; // burada �arpt�m ve �arp�m konteyn�r�na att�m.
		}

		System.out.println(sonuc);

	}

}