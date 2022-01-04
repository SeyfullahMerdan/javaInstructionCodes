package day34_accessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {

		C01 obj = new C01();
		// System.out.println(obj.sayiPrivate); // Private baþka classta ulaþýlamýyor.
		// Kendi classý dýþýndan ulaþýlamaz.
		System.out.println(obj.sayiDefault); // Obje oluþturmama ragmen static olsun veya olmasýn private ulaþamam!!!.
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

	public void staticOlmayan() {

		C01 obj = new C01();
		// System.out.println(obj.sayiPrivate); // Private baþka classta ulaþýlamýyor
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

}