package ex0214.map.exam;

public class StartView {

	public static void main(String[] args) {
		// MVC�������� : startView -> controller -> service

		// 1. ��ü�˻�
		/*System.out.println("1.��ü�˻� ******************");
	    MapStudentController.selectAll();
		System.out.println();*/

		/*System.out.println("2.�˻��ϱ�(Person�ΰ��) ******************");
		MapStudentController.searchById("jang"); // ��� : �̸�
		System.out.println();

		System.out.println("2.�˻��ϱ�(Student�ΰ��) ******************");
		MapStudentController.searchById("king"); // ��� : �̸�, ����
		System.out.println();

		System.out.println("2.�˻��ϱ�(���°��) ******************");
		MapStudentController.searchById("test"); // ��� : ���ܸ޽���
		System.out.println();*/
		
		

		/*System.out.println("3.����ϱ�(Person) ******************");
		MapStudentController.insert(new Person("bbb", "�ý�Ÿ", 20));
		System.out.println();

		System.out.println("3.����ϱ�(Student) ******************");
		MapStudentController.insert(new Student("ccc", "���", 25, 80, 80, 80));
		System.out.println();

		System.out.println("3.����ϱ�(id �ߺ� = key �ߺ�) ******************");
		MapStudentController.insert(new Person("jang", "�̻���", 30));
		System.out.println();

		System.out.println("1.��ü�˻� ******************");
		MapStudentController.selectAll();
		System.out.println();*/
		
		

		/*System.out.println("4.�����ϱ�(����) ******************");
		MapStudentController.delete("girl");
		System.out.println();

		System.out.println("4.�����ϱ�(����) ******************");
		MapStudentController.delete("qqq");
		System.out.println();

		System.out.println("1.��ü�˻� ******************");
		MapStudentController.selectAll();
		System.out.println();*/
		
		
	///////////////////////////////////////////////////////////////////
		/*System.out.println("4.�����ϱ�(Person) ******************");
		MapStudentController.update(new Person("jang", "�̻���"));// id�� name�� ����- �������߰� --���������� ����
		System.out.println();

		System.out.println("1.��ü�˻� ******************");
		MapStudentController.selectAll();
		System.out.println();*/

		// -> ���� map�� ����� jang�� PersonŸ�� ,�ٵ�
				// �����Ϸ��� Student ������ �ȵȴ�.
				
		/*System.out.println("4.�����ϱ�(Student) ******************");
		MapStudentController.update(new Student("jang", "��¯", 40, 50, 50)); // -������ �߰� - ���� Ÿ�Ϻ���ġ
		System.out.println();

		System.out.println("1.��ü�˻� ******************");
		MapStudentController.selectAll();
		System.out.println();*/
		
		
		MapStudentController.update(new Student("king","����" , 40,50,50)); //-������ �߰�  -����
		MapStudentController.selectAll();

		

	}
}







