package Basic05_collection;

public class GenericMain {

	public GenericMain() {
		/*
		ProductVO vo1 = new ProductVO();
		vo1.setProductName("��ǻ��");
		
		vo1.setProductName(new MemberVO(1234, "AAA", "��Ȯ��", "010-1234-2111"));
		
		MemberVO vo = (MemberVO)vo1.getProductName();
		System.out.println(vo.toString());
		*/
		
		ProductVO<MemberVO> vo1 = new ProductVO<MemberVO>();
		ProductVO<String> vo2 = new ProductVO<String>();
		
		vo1.setProductName(new MemberVO());
		// vo1.setProductName(new String()); error
		vo2.setProductName("�����");
	}

	void start() {
		
	}
	public static void main(String[] args) {
		
		new GenericMain().start();

	}

}
