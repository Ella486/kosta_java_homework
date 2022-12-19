package ex0214.map.exam;

import java.util.Map;

public class EndView {
	/**
	 * ��ü���
	 * */
	public static void printAll(Map<String, Person> map) {
		System.out.println("**** ���� ("+map.size()+")�� *************");
		for(String key : map.keySet()) {
			Person v = map.get(key); //Person �Ǵ� Student
			System.out.println(v); //v.toString()
		}
		
	}
	
	
	
	/**
	 * �κ����
	 * Person�ΰ�� - �̸��� ���,  Student�ΰ�� - �̸�, ���� ���
	 * */
	public static void printSearch(Person person) {
		System.out.print(person.getName());
	
		if(person instanceof Student) {
			Student student = (Student)person;
			System.out.print( " | " + student.getSum());
		}
		
		System.out.println();
	}
	
	/**
	 * �������� �޽���
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
}





