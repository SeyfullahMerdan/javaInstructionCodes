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
		ll.peek(); // silmeden ilk eleman� getiriyor.          ***last olan >> son eleman� getirir.
		ll.peekFirst(); //                   ilk eleman� getiriyor. liste bo� ise null getiriyor
		
		System.out.println(ll.peek());  // queue
		System.out.println(ll.peekFirst()); // deque  first-last..

		
		ll.poll(); // siliyor ve eleman� getiriyor g�steriyor.
		
		
		LinkedList <Integer> ll2=new LinkedList<>();
		
		System.out.println(ll2.peek()); // null
		System.out.println(ll2.peekFirst()); // null
		
	//	ll2.element(); // element yoksa exception verir. nosuchelementexception
		
		System.out.println(ll.poll()); // ilk eleman� sildi , �b�r�n� getirdi
		System.out.println(ll.poll()); // kalan diger eleman ilk oldu, onu sildi, null getirdi.

		System.out.println(ll.hashCode()); // javan�n verdigi hash codu d�ner  // 1
		
		ll2.add(7);
		System.out.println(ll2.hashCode()); // 38
		
		System.out.println(ll2.offer(10)); // true veya false olarak d�n�yor ve en ba�a ekliyor
		
		ll2.push(12); // adFirst ile ayn�
		System.out.println(ll2);
		
		
	}

}
