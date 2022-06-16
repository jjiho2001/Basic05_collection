package Basic05_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		start();
	}
	
	void start() {
		// Set : 입력순서를 유지하지 않는다.
		// 객체의 중복을 허용하지 않는다.
		
		int[] data = {25,23,25,27,88,11,22,11,23};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int n : data) {
			hs.add(n);
		}
		
		// HashSet의 객체 얻어오기
		Iterator<Integer> i = hs.iterator();
		
		while(i.hasNext()) {
			int d = i.next();
			System.out.println("d = " + d);
		}
	}

	public static void main(String[] args) {

		new HashSetTest();

	}

}
