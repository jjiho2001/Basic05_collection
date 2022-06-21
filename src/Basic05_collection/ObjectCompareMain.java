package Basic05_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain {

	List<MemberVO> list = new ArrayList<MemberVO>();
	
	public ObjectCompareMain() {
		// TODO Auto-generated constructor stub
	}

	void start() {
		list.add(new MemberVO(1200,"홍길동", "기획부", "010-1111-1111"));
		list.add(new MemberVO(2000,"이순신", "총무부", "010-1294-1243"));
		list.add(new MemberVO(5000,"세종대왕", "인사부", "010-2355-7565"));
		list.add(new MemberVO(3000,"장영실", "교무부", "010-4839-2623"));
		list.add(new MemberVO(1000,"류승룡", "외교부", "010-9897-5689"));
		
		System.out.println("정렬 전");
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("사원 번호를 오름차순으로");
		// Comparator가 implement된 클래스를 객채로 만들어 전달하여 list를 정렬함
		Collections.sort(list, new CompareNumAsc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("사원 번호를 내림차순으로");
		Collections.sort(list, new CompareNumDesc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("사원 명을 오름차순으로");
		Collections.sort(list, new CompareUsernameAsc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("사원 명을 내림차순으로");
		Collections.sort(list, new CompareUsernameDesc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
	}
	
	// 사원번호(숫자)를 오름차순으로 정렬하는 내부 클래스 (인터페이스 : Comparator)
	
	class CompareNumAsc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			// 음수면 이미 정렬이 된 상태(암 것도 안함), 양수면 둘이 바꿈, 0이면 암 것도 안함
			return (v1.getNum() < v2.getNum()) ? -1 : (v1.getNum() > v2.getNum())? 1 : 0;
		}
		
	}
	
	// 사원번호(숫자)를 내림차순으로 정렬하는 내부 클래스
	
	class CompareNumDesc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			
			return (v1.getNum() < v2.getNum()) ? 1 : (v1.getNum() > v2.getNum()) ? -1 : 0;
		}
		
	}
	
	// 사원명(문자열)을 오름차순으로 정렬
	
	class CompareUsernameAsc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			
			return v1.getUsername().compareTo(v2.getUsername());
		}
		
	}
	
	// 사원명(문자열)을 내림차순으로 정렬
	
	class CompareUsernameDesc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			
			return v2.getUsername().compareTo(v1.getUsername());
		}
		
	}
	
	public static void main(String[] args) {
		new ObjectCompareMain().start();

	}

}
