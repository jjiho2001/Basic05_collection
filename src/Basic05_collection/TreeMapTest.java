package Basic05_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		// TODO Auto-generated constructor stub
	}
	
	void start() {
		// TreeMap : key�� value�� �̿��Ͽ� collection�� ����Ѵ�.
		// key�� �������� ������ ���ش�.
		TreeMap<String, MemberVO> tm = new TreeMap<String, MemberVO>();
		
		tm.put("1", new MemberVO(1, "ȫ�浿", "ǰ��", "010-1111-1111"));
		tm.put("A", new MemberVO(2, "ȫ��2", "ǰ��", "010-1111-2222"));
		tm.put("��浿", new MemberVO(3, "ȫ��3", "ǰ��", "010-1111-3333"));
		tm.put("B", new MemberVO(4, "ȫ�浿4", "ǰ��", "010-1111-4444"));
		tm.put("100", new MemberVO(5, "���5", "ǰ��", "010-1111-5555"));
		
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
