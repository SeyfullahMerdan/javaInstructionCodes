package day43_Interface;

public class C03_Concrete implements C02_Interface {

	
	
	
	// Bir interfacede static veya default keyword kullanarak bodysi olan bir method olu�turursak
	// bu interfacee implements eden concrete child classlar bu methodlar� implement etmek ZORUNDA DEG�LD�R.
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		
		C03_Concrete concreteObje=new C03_Concrete();
		
		
		
		C02_Interface.sanzuman();   // birine obje �zerinden birine interface �zerinden ula�t�k..**
		
	}

		
	
	
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
