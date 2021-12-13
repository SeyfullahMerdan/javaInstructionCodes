package day16_forLoops;

public class C04_forLoop {

	public static void main(String[] args) {
		
		// Soru 3) 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul
		// olarak ayni satirda yazdirin

		for (int i = 100; i >= 51; i--) { // >51 veya >50' de olur
			System.out.print(i + ", ");
		}

		System.out.print(50); // 50'den sonraki virgülü kaldýrmak için 50'yi ayrýca syso içinde yazdým

	}

}