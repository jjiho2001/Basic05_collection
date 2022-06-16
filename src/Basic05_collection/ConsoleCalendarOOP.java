package Basic05_collection;
import java.util.Calendar;
import java.util.Scanner;
//import java.lang.System;
public class ConsoleCalendarOOP {
	//�ֿܼ��� �⵵�� ���� �Է�
	Scanner scan = new Scanner(System.in);
	Calendar date = Calendar.getInstance();
	//�Ű������� ���� ������ �޼ҵ�� ������� ������ �����Ϸ��� �ڵ����� �־��ش�.
	ConsoleCalendarOOP(){
		//startCalendar();		
	}	
	//�޷��� ��� ���
	void titlePrint(int year, int month) {
		System.out.printf("\t\t%d�� %d��\n", year,month);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
	}
	//1�Ͽ� ���� ����
	int getWeek(int year, int month) {		
		date.set(year, month-1, 1);
		return date.get(Calendar.DAY_OF_WEEK);
	}
	void spacePrint(int week) {
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
	}
	//�⵵�� ���Է�
	int inData(String msg) {
		System.out.print(msg+"->");
		return scan.nextInt();
	}
	//��¥ ���
	void dayPrint(int week, int lastDay) {
		for(int d=1; d<=lastDay; d++) {
			System.out.print(d+"\t");
			if((d+week-1)%7==0) System.out.println(); 
		}
	}
	//
	void startCalendar() {
		//�⵵�Է�
		int year = inData("�⵵");
		
		int month = inData("��");
		//�������
		titlePrint(year, month);
		
		//���ϱ��ϱ�
		int week = getWeek(year, month);
		//����ó��
		spacePrint(week);
		
		//�����������ϱ�
		int lastDay= date.getActualMaximum(Calendar.DATE);
		
		//��¥ ���
		dayPrint(week, lastDay);
	}	
}
