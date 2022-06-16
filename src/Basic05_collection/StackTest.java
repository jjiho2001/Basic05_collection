package Basic05_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack : �� ������ ��ü�� ��ų� ������. (FILO, LIFO)
		// ��ü�� ������ Stack �������� ��������.
		
		Stack<String> s = new Stack<String>();
		s.push("ȫ�浿"); // 3
		s.push("�ֱ浿"); // 2
		s.push("���浿"); // 1
		
		System.out.println("search() -> " + s.search("ȫ�浿"));
		System.out.println("empty() -> " + s.empty());
		System.out.println("size() -> " + s.size());
		
		while(!s.empty()) {
			System.out.println(s.pop());
			System.out.println("���� ��ü �� : " + s.size());
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
