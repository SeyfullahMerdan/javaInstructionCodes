package day38_overriding;

public class S09 {

	public static void main(String[] args) {
		Computer mouse = new Laptop();
		System.out.println(mouse.getValue(100, 200));  // objeyi olu�turmak i�in cons. oldugu classa Laptopa gidecek...
                             // method �ag�r�nca kendi class�ndan almaya �al��acak ama bakacak ki const. child classtan 
		               // ve override edilmi�. Hemen alt classa bakcak ve ordakini getirecek.
	}
}
	class NoteBook{
		int getValue(int a,int b) {
			if(a>b)
				return a;
			else
				return b;
		}
	}
	
	class Computer extends NoteBook{
		int getValue(int a , int b) {
			return a*b;
		}
	}
	
	class Laptop extends Computer{
		int getValue(int a , int b) {
			return b - a;   // buu getirir    200-1000 = 100
		}
	}