package Basic05_collection;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	public static Vector vv = new Vector();
	public VectorTest() {
		
	}
	//�÷��� : ������ �Ǵ� ������ ������ �� �ִ� ��ü
	//List �������̽��� ��ӹ��� Ŭ������ �����������(index������)
	
	public Vector getData() {
		int num = 20;
		String username ="�̼���";
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		ConsoleCalendarOOP calOOP = new ConsoleCalendarOOP();
		
		Vector vector = new Vector();
		vector.add(num);//0
		vector.add(scan);//2
		vector.add(username);//3
		vector.add(1, now);//1, 1�� 2���̿� ���� ��������
		vector.add(calOOP);//4
		
		//////////////////////////
		vv.add("ȫ�浿");//0
		vv.add("��浿");//1
		vv.add("�ڱ浿");//2
		vv.add("�̱浿");//3
		/////////////////////////
		return vector;
	}
}
