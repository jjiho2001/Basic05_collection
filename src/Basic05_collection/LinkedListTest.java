package Basic05_collection;

import java.util.LinkedList;

public class LinkedListTest {
	
	public LinkedListTest() {
		start();
	}
	
	public void start() {
		// LinkedList : �Է� ������ ������(List)
		// Queue : ���� �Էµ� ��ü ���� ��µǴ� ����� �ִ�.
		// Deque : ���ʿ� ��ü�� �Է� ����� �� �ִ�.
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.offer(1234);
		ll.offer(5678);
		ll.offer(8901);
		ll.offer(1256);
		
		while(!ll.isEmpty()) {
			int data = ll.poll(); // ��ü�� ������ collection������ �����.
			System.out.println(data + ", ���� ��ü : " + ll.size());
		}
	}
	
	public static void main(String[] args) {
		new LinkedListTest();
	}

}
