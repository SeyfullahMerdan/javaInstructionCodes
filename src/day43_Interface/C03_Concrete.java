package day43_Interface;

public class C03_Concrete implements C02_Interface {

	
	
	
	// Bir interfacede static veya default keyword kullanarak bodysi olan bir method oluþturursak
	// bu interfacee implements eden concrete child classlar bu methodlarý implement etmek ZORUNDA DEGÝLDÝR.
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		
		C03_Concrete concreteObje=new C03_Concrete();
		
		
		
		C02_Interface.sanzuman();   // birine obje üzerinden birine interface üzerinden ulaþtýk..**
		
	}

		
	
	
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
