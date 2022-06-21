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
		list.add(new MemberVO(1200,"ȫ�浿", "��ȹ��", "010-1111-1111"));
		list.add(new MemberVO(2000,"�̼���", "�ѹ���", "010-1294-1243"));
		list.add(new MemberVO(5000,"�������", "�λ��", "010-2355-7565"));
		list.add(new MemberVO(3000,"�念��", "������", "010-4839-2623"));
		list.add(new MemberVO(1000,"���·�", "�ܱ���", "010-9897-5689"));
		
		System.out.println("���� ��");
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("��� ��ȣ�� ������������");
		// Comparator�� implement�� Ŭ������ ��ä�� ����� �����Ͽ� list�� ������
		Collections.sort(list, new CompareNumAsc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("��� ��ȣ�� ������������");
		Collections.sort(list, new CompareNumDesc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("��� ���� ������������");
		Collections.sort(list, new CompareUsernameAsc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
		
		System.out.println("��� ���� ������������");
		Collections.sort(list, new CompareUsernameDesc());
		
		for(MemberVO vo : list) {
			System.out.println(vo.toString());
		}
	}
	
	// �����ȣ(����)�� ������������ �����ϴ� ���� Ŭ���� (�������̽� : Comparator)
	
	class CompareNumAsc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			// ������ �̹� ������ �� ����(�� �͵� ����), ����� ���� �ٲ�, 0�̸� �� �͵� ����
			return (v1.getNum() < v2.getNum()) ? -1 : (v1.getNum() > v2.getNum())? 1 : 0;
		}
		
	}
	
	// �����ȣ(����)�� ������������ �����ϴ� ���� Ŭ����
	
	class CompareNumDesc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			
			return (v1.getNum() < v2.getNum()) ? 1 : (v1.getNum() > v2.getNum()) ? -1 : 0;
		}
		
	}
	
	// �����(���ڿ�)�� ������������ ����
	
	class CompareUsernameAsc implements Comparator<MemberVO>{

		@Override
		public int compare(MemberVO v1, MemberVO v2) {
			
			return v1.getUsername().compareTo(v2.getUsername());
		}
		
	}
	
	// �����(���ڿ�)�� ������������ ����
	
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
