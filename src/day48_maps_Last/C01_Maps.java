package day48_maps_Last;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		
		//Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
		//   Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3
		
		
		String input="Hellooo";
		
		harfSay(input);
		
		Map <String,Integer> mainMap = harfSay(input); // Methodu burada yeni bir mape atadým.
		System.out.println(mainMap);

	}

	
	private static Map<String,Integer> harfSay(String input) {
		
		
		Map <String,Integer> harfSayilariMap= new HashMap<>();
		String inputArr[]=input.split(""); // [H, e, l, l, o, o, o]
		
		
		for (String e : inputArr) {
		    
			if (!harfSayilariMap.containsKey(e)) {
				harfSayilariMap.put(e, 1);
			} else {	
				// harfSayilariMap.get(e)+1;  Bu girilen harfin adedini yani valuesini bulup 1 arttýrýr.
				harfSayilariMap.put(e, harfSayilariMap.get(e)+1 );
			}
		}
		return harfSayilariMap;
	}

	
	
	
	
}
