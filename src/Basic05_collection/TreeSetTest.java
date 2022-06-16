package Basic05_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
		// TODO Auto-generated constructor stub
	}
	
	void start() {
		// TreeSet : 입력 순서를 유지하지 않는다.
		// 중복데이터도 허용하지 않음.
		// 객체를 오름차순으로 정렬한다.
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		int[] data = {25,23,25,27,88,11,22,11,23};
		
		for(int d : data) {
			ts.add(d);
		}
		
		Iterator<Integer> ii = ts.iterator();
		
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
	}

	public static void main(String[] args) {

		new TreeSetTest().start();

	}

}
