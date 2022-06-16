package Basic05_collection;

import java.util.Stack;

public class StackTest {

	public StackTest() {
		// Stack : 한 쪽으로 객체를 담거나 꺼낸다. (FILO, LIFO)
		// 객체를 꺼내면 Stack 영역에서 지워진다.
		
		Stack<String> s = new Stack<String>();
		s.push("홍길동"); // 3
		s.push("최길동"); // 2
		s.push("강길동"); // 1
		
		System.out.println("search() -> " + s.search("홍길동"));
		System.out.println("empty() -> " + s.empty());
		System.out.println("size() -> " + s.size());
		
		while(!s.empty()) {
			System.out.println(s.pop());
			System.out.println("남은 객체 수 : " + s.size());
		}
	}

	public static void main(String[] args) {
		new StackTest();

	}

}
