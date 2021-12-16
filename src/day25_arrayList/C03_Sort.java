package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();

		isimler.add("kutlu");
		isimler.add("emrah");
		isimler.add("ferhat");

		System.out.println(isimler); // [Kutlu, Emrah, Ferhat]

		Collections.sort(isimler);
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu] natural order

		isimler.add("filiz");

		System.out.println(isimler); // [Emrah, Ferhat, Kutlu, filiz]
		Collections.sort(isimler);
		System.out.println(isimler);

	}

}