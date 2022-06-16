package Basic05_collection;

public class ArrayListMain {

	public ArrayListMain() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		ArrayListTest emp = new ArrayListTest();
		
		/* Generic 적용안했을 때 for 문
		for(Object obj : emp.list) {
			MemberVO vo = (MemberVO)obj;
			int num = vo.getNum();
			String username = vo.getUsername();
			String depart = vo.getDepartment();
			String tel = vo.getTel();
			//System.out.printf("%d, %s, %s, %s\n", num, username, depart, tel);
			System.out.println(vo.toString());
		}
		*/
		
		// Generic : MemberVO 적용되었을 때
		for(MemberVO vo : emp.list) {
			System.out.println(vo.toString());
		}
	}
	
	public static void main(String[] args) {
		
		new ArrayListMain().start();

	}

}
