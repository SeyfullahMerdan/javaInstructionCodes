package day38_overriding;

class Person{
	public void talk() { // overriden der ve a�ag� in senin burda i�in yok der
		System.out.println("First Program");
	}
}

class Student extends Person{
	public void talk() { // overrding constructor ile ayn� classda oldugu i�in buray� �al��t�r�r.!!!***
		System.out.println("Second Program");
	}
}

// Constructor ile overriding method ayn� classda ise overriding method �al���r.

public class S05 { // Runner diyoruz bu t�r classlara!

	public static void main(String[] args) {
		
		Person p=new Student();
		p.talk();
	}

}  //PArent ve child classlarda overriding varsa java class �al��madan bunlar� i�arterler
// Br obje ile method �ag�r�nca java data t�r�n�n class�ndaki methoda gider
// Gidilen Method ge�ersiz k�l�nm��sa java objenin constructor�na bakar