package ex0208.inheritanceExam01;
/**
�����̸�: �̸���
��¥: 22.02.08
���� : 7�� ��� Ȯ�ι��� 5��
 */
public class Child extends Parent{
	private int studentNo;

	public Child(String name, int studentNo) {
		super(name);
		//this.name = name; //������ ����
		/**Parent Ŭ������ �⺻�����ڰ� ���� name�� �Ű������� �޾� ��ü�� ������Ű�� �����ڸ� �����Ƿ�
	     Child ������ ù�ٿ� super(name); ���� Parent Ŭ������ �����ڸ� ȣ���ؾ���.*/
		this.studentNo = studentNo;
	}

}
