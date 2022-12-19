package ex0214.map.exam;

import java.util.Map;
import java.util.Map.Entry;

public class EndView {
	/**
	 * ��ü�˻� ���
	 * */
	public static void printAll(Map<String,Person> map) {
		System.out.println("****** ���� (" + map.size() +") �� *******");
		
		for( Entry<String, Person> me : map.entrySet()) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
	}
	
	/**
	 * key=id�� �ش��ϴ� �������
	 * */
	public static void printSearch(Person person) {

		Student student = new Student();
		if((person instanceof Student)) {
			student = (Student)person;
			System.out.println("�л�");
			System.out.println("student: "+student);
		}else {
			System.out.println("���");
			System.out.println("person: "+person);
		}
		
	}
	
	/**
	 * ���� �Ǵ� ���п� ���õ� �޼��� ���
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
