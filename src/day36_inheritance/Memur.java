package day36_inheritance;

import day35_encapsulation_inheritance.Muhasebe;

public class Memur extends Muhasebe {

	public Memur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Memur memur1=new Memur();
		
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.maasHesapla();
		System.out.println(memur1.maas);
		
		
		
	}

}