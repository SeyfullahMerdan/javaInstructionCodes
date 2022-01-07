package day38_overriding;

class Person{
	public void talk() { // overriden der ve aþagý in senin burda iþin yok der
		System.out.println("First Program");
	}
}

class Student extends Person{
	public void talk() { // overrding constructor ile ayný classda oldugu için burayý çalýþtýrýr.!!!***
		System.out.println("Second Program");
	}
}

// Constructor ile overriding method ayný classda ise overriding method çalýþýr.

public class S05 { // Runner diyoruz bu tür classlara!

	public static void main(String[] args) {
		
		Person p=new Student();
		p.talk();
	}

}  //PArent ve child classlarda overriding varsa java class çalýþmadan bunlarý iþarterler
// Br obje ile method çagýrýnca java data türünün classýndaki methoda gider
// Gidilen Method geçersiz kýlýnmýþsa java objenin constructorýna bakar