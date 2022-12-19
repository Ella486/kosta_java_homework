package ex0214.map.exam;

import java.sql.SQLException;
import java.util.Map;

public class MapStudentController {
	private static MapStudentService service = new MapStudentService();

	/**
	 * ��ü�˻�
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
	 * �κа˻�
	 */
	public static void searchById(String key) { //key�� �� id�̴� 
		try {
			Person p = service.searchByKey(key);
			EndView.printSearch(p);
		}catch(RuntimeException e) {
			EndView.printMessage( e.getMessage() );
		}
	}

	
	/**
	 * ���
	 */
	public static void insert(Person person) { //Student �Ǵ� Person
		try {
			service.insert(person);
			EndView.printMessage(person.getId() + "���� ��ϵǾ����ϴ�.");
		} catch (RuntimeException e) {
			EndView.printMessage( e.getMessage() );
		}
	}

	/**
	 * ����
	 */
	public static void delete(String key) { //key�� id
		try {
			service.delete(key);
			EndView.printMessage(key + "�� �ش��ϴ� ������ �����߽��ϴ�.");
				
		}catch (RuntimeException e) {
				EndView.printMessage( e.getMessage() );
		}	
	}

	/**
	 * ����
	 */
	public static void update(Person p) {//Person �Ǵ� Student
		try {
			service.update(p);
			
			
			EndView.printMessage(p.getId() + "���� �����߽��ϴ�.");
			
		} catch (RuntimeException e) {
			EndView.printMessage(e.getMessage());
		}
	}
}









