package day34_accessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {

		C01 obj = new C01();
		// System.out.println(obj.sayiPrivate); // Private ba�ka classta ula��lam�yor.
		// Kendi class� d���ndan ula��lamaz.
		System.out.println(obj.sayiDefault); // Obje olu�turmama ragmen static olsun veya olmas�n private ula�amam!!!.
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

	public void staticOlmayan() {

		C01 obj = new C01();
		// System.out.println(obj.sayiPrivate); // Private ba�ka classta ula��lam�yor
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

}