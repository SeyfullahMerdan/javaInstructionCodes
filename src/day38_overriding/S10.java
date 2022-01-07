package day38_overriding;

public class S10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		M m =new M();
		M n = new N();
		M o = new O(); //
		O oo = new O();
		m.product(3);  // 3*3    syso   { 3, 9 }
		n.product(3);  //  3+3    syso [ 3 , 6 ]
		oo.product(3); //   3*2    syso ( 3 , 6 )
		

	}

}

class M{
	int product(int i) {
		int result=i*i;
		System.out.println("{" + i + ", " + result + "}");  // run ettigimizde ekranda ilk görecegimiz sonuç
		return result;   // daha sonra bir yerde kullanýlýrsa döndürecegi sonuç 
	}
}
class N extends M{
	int product(int i) {
		int result=i+i;
		System.out.println("[" + i + ", " + result + "]");
		return result;
	}
}
class O extends M{
	int product(int i) {
		int result=i*2;
		System.out.println("(" + i + ", " + result + ")");
		return result;
	}
}
