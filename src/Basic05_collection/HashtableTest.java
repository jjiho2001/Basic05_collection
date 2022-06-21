package Basic05_collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableTest {

	public HashtableTest() {
		
	}

	void start() {
		// May : key�� value�� �̿��Ͽ� ��ü�� ����Ѵ�.
		// key�� �ߺ��Ǹ� �ȵ�.
		
		Hashtable<String, MemberVO> ht = new Hashtable<String, MemberVO>();
		
		ht.put("1", new MemberVO(1, "ȫ�浿", "ǰ��", "010-1111-1111"));
		ht.put("A", new MemberVO(2, "ȫ��2", "ǰ��", "010-1111-2222"));
		ht.put("��浿", new MemberVO(3, "ȫ��3", "ǰ��", "010-1111-3333"));
		ht.put("B", new MemberVO(4, "ȫ�浿4", "ǰ��", "010-1111-4444"));
		ht.put("100", new MemberVO(5, "ȫ��5", "ǰ��", "010-1111-5555"));
		
		// key�� �̿��Ͽ� ��ü ������
		MemberVO vol1 = ht.get("B");
		System.out.println(vol1.toString());
		System.out.println();
		
		// key ��� ���ϱ�
		Set<String> keyList = ht.keySet();
		Iterator<String> it = keyList.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			MemberVO vo2 = ht.get(key);
			System.out.println(vo2.toString());
		}
		System.out.println();
		
		// value ��� ���ϱ� : key ����
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
