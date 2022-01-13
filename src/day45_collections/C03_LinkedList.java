package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList {


	public static void main(String[] args) {


		LinkedList <Integer> ll=new LinkedList<>();
		
		System.out.println(ll);
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);   // [5, 7]
		
		ll.element();
		ll.peek(); // silmeden ilk elemaný getiriyor.          ***last olan >> son elemaný getirir.
		ll.peekFirst(); //                   ilk elemaný getiriyor. liste boþ ise null getiriyor
		
		System.out.println(ll.peek());  // queue
		System.out.println(ll.peekFirst()); // deque  first-last..

		
		ll.poll(); // siliyor ve elemaný getiriyor gösteriyor.
		
		
		LinkedList <Integer> ll2=new LinkedList<>();
		
		System.out.println(ll2.peek()); // null
		System.out.println(ll2.peekFirst()); // null
		
	//	ll2.element(); // element yoksa exception verir. nosuchelementexception
		
		System.out.println(ll.poll()); // ilk elemaný sildi , öbürünü getirdi
		System.out.println(ll.poll()); // kalan diger eleman ilk oldu, onu sildi, null getirdi.

		System.out.println(ll.hashCode()); // javanýn verdigi hash codu döner  // 1
		
		ll2.add(7);
		System.out.println(ll2.hashCode()); // 38
		
		System.out.println(ll2.offer(10)); // true veya false olarak dönüyor ve en baþa ekliyor
		
		ll2.push(12); // adFirst ile ayný
		System.out.println(ll2);
		
		
	}

}
