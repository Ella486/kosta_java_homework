package ex0214.map.exam;

import java.util.Map;
import java.util.Map.Entry;

public class EndView {
	/**
	 * 전체검색 출력
	 * */
	public static void printAll(Map<String,Person> map) {
		System.out.println("****** 정보 (" + map.size() +") 명 *******");
		
		for( Entry<String, Person> me : map.entrySet()) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
		
	}
	
	/**
	 * key=id에 해당하는 정보출력
	 * */
	public static void printSearch(Person person) {

		Student student = new Student();
		if((person instanceof Student)) {
			student = (Student)person;
			System.out.println("학생");
			System.out.println("student: "+student);
		}else {
			System.out.println("사람");
			System.out.println("person: "+person);
		}
		
	}
	
	/**
	 * 성공 또는 실패에 관련된 메세지 출력
	 * */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
