package Basic05_collection;

import java.util.Calendar;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {
		VectorTest vt = new VectorTest();
		Vector v = vt.getData();
		
		//�÷����� ��ü ������
		int d1 = (int)v.get(0);
		Calendar d2 = (Calendar)v.elementAt(1);
		System.out.println("num="+ d1);
		System.out.println("calendar->"+ d2);
		
		ConsoleCalendarOOP d3 = (ConsoleCalendarOOP)v.lastElement();//������ ��ü
		d3.startCalendar();
		
		String name = (String)VectorTest.vv.get(2);
		System.out.println("name->"+ name);
	}

	public static void main(String[] args) {
		new VectorMain();
	}
}
