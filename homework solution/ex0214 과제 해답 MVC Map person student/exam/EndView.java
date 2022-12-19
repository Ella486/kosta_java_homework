package ex0214.map.exam;

import java.util.Map;

public class EndView {
	/**
	 * 전체출력
	 * */
	public static void printAll(Map<String, Person> map) {
		System.out.println("**** 정보 ("+map.size()+")명 *************");
		for(String key : map.keySet()) {
			Person v = map.get(key); //Person 또는 Student
			System.out.println(v); //v.toString()
		}
		
	}
	
	
	
	/**
	 * 부분출력
	 * Person인경우 - 이름만 출력,  Student인경우 - 이름, 총점 출력
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
	 * 성공여부 메시지
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
}





