package day38_overriding;

public class S06 {
	public static void main(String[] args) {
		new C().create();   // obje t�r� ile ilgili bir �ey yok. Farkl� data t�r� yok.
		new D().update();   // oveririden olmad�g� i�in y�zde 90l�k k�s�m kendi clas�ndan alcak varsa
		new R().read();    // classda varsa �al��t�r yoksa babaya git******
		new D().delete();           // y�zde10luk k�s�m overriden ve benzeri k�s�md�r.
	}}      // c U R D            // Data t�r� e constructor ayn� olunca ayn� classa bak�yor varsa al�yor 
                                 // yoksa �ste gidiyor

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