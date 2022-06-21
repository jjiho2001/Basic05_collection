package Basic05_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	void start() {
		// TreeMap : key와 value을 이용하여 collection을 사용한다.
		// key를 기준으로 정렬을 해준다.
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		tm.put("1", new MemberVO(1, "홍길동", "품질", "010-1111-1111"));
		tm.put("A", new MemberVO(2, "홍길2", "품질", "010-1111-2222"));
		tm.put("김길동", new MemberVO(3, "홍길3", "품질", "010-1111-3333"));
		tm.put("B", new MemberVO(4, "홍길동4", "품질", "010-1111-4444"));
		tm.put("100", new MemberVO(5, "김길5", "품질", "010-1111-5555"));
		
		Set<String> keys = tm.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			MemberVO vo = tm.get(key);
			System.out.println(key + "->" +vo.toString());
		}
		
	}

	public static void main(String[] args) {
		new TreeMapTest().start();

	}

}
