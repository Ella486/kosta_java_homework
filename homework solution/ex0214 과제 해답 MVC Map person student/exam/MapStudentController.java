package ex0214.map.exam;

import java.sql.SQLException;
import java.util.Map;

public class MapStudentController {
	private static MapStudentService service = new MapStudentService();

	/**
	 * 전체검색
	 */
	public static void selectAll() {
		try {
		  Map<String, Person> map = service.selectAll();
		  EndView.printAll(map);
		  
		}catch (RuntimeException e) {
			EndView.printMessage( e.getMessage() );
		}
	}

	/**
	 * 부분검색
	 */
	public static void searchById(String key) { //key는 곧 id이다 
		try {
			Person p = service.searchByKey(key);
			EndView.printSearch(p);
		}catch(RuntimeException e) {
			EndView.printMessage( e.getMessage() );
		}
	}

	
	/**
	 * 등록
	 */
	public static void insert(Person person) { //Student 또는 Person
		try {
			service.insert(person);
			EndView.printMessage(person.getId() + "님이 등록되었습니다.");
		} catch (RuntimeException e) {
			EndView.printMessage( e.getMessage() );
		}
	}

	/**
	 * 삭제
	 */
	public static void delete(String key) { //key는 id
		try {
			service.delete(key);
			EndView.printMessage(key + "에 해당하는 정보를 삭제했습니다.");
				
		}catch (RuntimeException e) {
				EndView.printMessage( e.getMessage() );
		}	
	}

	/**
	 * 수정
	 */
	public static void update(Person p) {//Person 또는 Student
		try {
			service.update(p);
			
			
			EndView.printMessage(p.getId() + "님을 수정했습니다.");
			
		} catch (RuntimeException e) {
			EndView.printMessage(e.getMessage());
		}
	}
}









