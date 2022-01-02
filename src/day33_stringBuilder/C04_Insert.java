package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java �grendim");

		sb.insert(4, "y� �ok iyi"); // �nsert bir StringBuildere istenen indexden itibaren ekleme yapmam�za imkan
									// tan�r
									// StringBuilder olarak yaz�lm�� bir ifade,c�mle,i�erik degi�tirelebilir,
									// eklenip ��kar�labilir.

		System.out.println(sb);   //Javay� �ok iyi �grendim

		sb.insert(7, "�ok iyiyim", 0, 4); // Mevcut StringBuildere �u indexden itibaren �u stringdeki 0-5 indexlerin
											// aras�n� kopyala yap��t�r.
		System.out.println(sb);

	}

}
