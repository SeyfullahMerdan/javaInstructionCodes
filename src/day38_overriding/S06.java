package day38_overriding;

public class S06 {
	public static void main(String[] args) {
		new C().create();   // obje türü ile ilgili bir þey yok. Farklý data türü yok.
		new D().update();   // oveririden olmadýgý için yüzde 90lýk kýsým kendi clasýndan alcak varsa
		new R().read();    // classda varsa çalýþtýr yoksa babaya git******
		new D().delete();           // yüzde10luk kýsým overriden ve benzeri kýsýmdýr.
	}}      // c U R D            // Data türü e constructor ayný olunca ayný classa bakýyor varsa alýyor 
                                 // yoksa üste gidiyor

class C {
	public void create() {
		System.out.println("c");
	} }
class U {
	@SuppressWarnings("unused")
	private void update() {
		System.out.println("u");
	} }
class R extends C {
	public void create() {
		System.out.println("C");
	} 
	protected void read() {
		System.out.println("R");
	}}
class D extends U{
	void update() {
		System.out.println("U");
	}
	void delete() {
		System.out.println("D");
	}
}