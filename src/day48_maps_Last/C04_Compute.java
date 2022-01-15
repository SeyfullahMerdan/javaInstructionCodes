package day48_maps_Last;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		
		// Funktional Programminge girmektedir. Her bir elemaný getirip arttýr demek istersek bu yolla yapabilriz
		// örnek:  x'i getir; x+2 yap gibi...
		
		Map <String, Integer> ornek=new HashMap<>();
		ornek.put("A", 2);
		ornek.put("B", 5);
		ornek.put("C", 1);
		ornek.put("Z", 3);
		ornek.put("K", 10);
		System.out.println(ornek);  // {A=2, B=5, C=1, Z=3, K=10}
		
		ornek.compute("A", (key,value) -> 10       );
		System.out.println(ornek);      // {A=10, B=5, C=1, Z=3, K=10}
		
		ornek.compute("A", (key,value) -> 2*value+5     );  //{A=25, B=5, C=1, Z=3, K=10}   2 ile çarpýp 5 ekledi ve value degiþti.!!**
		System.out.println(ornek);
		
		ornek.computeIfAbsent("D", v->20);
		System.out.println(ornek);    // {A=25, B=5, C=1, D=20, Z=3, K=10}   D'yi ekledi.
		
		ornek.computeIfAbsent("C", v->11);
		System.out.println(ornek);        // C var oldugu için degiþtirmedi. Ayný kaldý. Etkisiz bir kod oldu. 
		
		ornek.computeIfAbsent("L", k->12);    // {A=25, B=5, C=1, D=20, Z=3, K=10, L=12}
		System.out.println(ornek);           // k yazsam da onu value olarka algýladý ve deger olarka atadý. Ekleme yaptý.
		
		
		ornek.computeIfPresent("L",(key,value) -> 2*value+5  );
		System.out.println(ornek);           // {A=25, B=5, C=1, D=20, Z=3, K=10, L=29}   L keyini degiþtirdi. 
	}

}
