package Basic05_collection;

import java.util.LinkedList;

public class LinkedListTest {
	
	public LinkedListTest() {
		start();
	}
	
	public void start() {
		// LinkedList : 입력 순서를 유지함(List)
		// Queue : 먼저 입력된 객체 먼저 출력되는 기능이 있다.
		// Deque : 양쪽에 객체를 입력 출력할 수 있다.
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.offer(1234);
		ll.offer(5678);
		ll.offer(8901);
		ll.offer(1256);
		
		while(!ll.isEmpty()) {
			int data = ll.poll(); // 객체를 얻어오고 collection에서는 지운다.
			System.out.println(data + ", 남은 객체 : " + ll.size());
		}
	}
	
	public static void main(String[] args) {
		new LinkedListTest();
	}

}
