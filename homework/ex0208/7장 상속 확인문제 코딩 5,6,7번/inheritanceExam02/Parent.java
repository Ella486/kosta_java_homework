package ex0208.inheritanceExam02;
/**
�����̸�: �̸���
��¥: 22.02.08
���� : 7�� ��� Ȯ�ι��� 6��
 */
public class Parent {
	public String nation;

	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
}
