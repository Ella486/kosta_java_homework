package ex0208.inheritanceExam02;
/**
�����̸�: �̸���
��¥: 22.02.08
���� : 7�� ��� Ȯ�ι��� 6��
 */
public class Child extends Parent{
	private String name;

	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}

	public Child(String name) {
		super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
