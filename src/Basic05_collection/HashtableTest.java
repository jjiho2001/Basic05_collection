package Basic05_collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableTest {

	public HashtableTest() {
		
	}

	void start() {
		// May : key와 value를 이용하여 객체를 사용한다.
		// key는 중복되면 안됨.
		
		Hashtable<String, MemberVO> ht = new Hashtable<String, MemberVO>();
		
		ht.put("1", new MemberVO(1, "홍길동", "품질", "010-1111-1111"));
		ht.put("A", new MemberVO(2, "홍길2", "품질", "010-1111-2222"));
		ht.put("김길동", new MemberVO(3, "홍길3", "품질", "010-1111-3333"));
		ht.put("B", new MemberVO(4, "홍길동4", "품질", "010-1111-4444"));
		ht.put("100", new MemberVO(5, "홍길5", "품질", "010-1111-5555"));
		
		// key를 이용하여 객체 얻어오기
		MemberVO vol1 = ht.get("B");
		System.out.println(vol1.toString());
		System.out.println();
		
		// key 목록 구하기
		Set<String> keyList = ht.keySet();
		Iterator<String> it = keyList.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			MemberVO vo2 = ht.get(key);
			System.out.println(vo2.toString());
		}
		System.out.println();
		
		// value 목록 구하기 : key 없이
		Collection<MemberVO> value = ht.values();
		Iterator<MemberVO> it2 = value.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next().toString());
		}
	}
	
	public static void main(String[] args) {
		
		new HashtableTest().start();

	}

}
