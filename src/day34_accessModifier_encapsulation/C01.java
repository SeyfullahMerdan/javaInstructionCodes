package day34_accessModifier_encapsulation;

public class C01 {

	private int sayiPrivate = 10; // En dar olaný
	// private class üyelerine sadece içinde bulundugu classtan ulaþýlabilir

	int sayiDefault = 20; // Default
	// default class üyelerine sadece içinde bulundugu package classlardan
	// ulaþýlabilir.
	// bir diger adý da package access modifierdýr

	protected int sayiProtected = 30; // Genelin bir altý
	// Baþka packagede olup da child olmayanlar ulaþamaz.
	// Ýçinde bulundugu packagedeki tüm classlar ve baþka pacagedeki cüm classlar
	// ulaþabilir.

	public int sayiPublic = 40; // en geneli
	// public class üyelerine tüm packagelerdeki tüm classlar ulaþabilir.

	public static void main(String[] args) {

		C01 obj = new C01(); /// static olmadýklarý için obje oluþturdum ve bu þekilde ulaþacagým,
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}

	public void staticOlmayan() {

		C01 obj = new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

}
