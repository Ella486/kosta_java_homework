package ex0214.map.exam;

import java.util.Map;

public class MapStudentController {
	private static MapStudentService service = new  MapStudentService();
	
	/**
	 * ��ü�˻�
	 * */
	public static void selectAll() {
		try{//���񽺸� ȣ���ϰ� �� ����� �޾Ƽ� ������ �̵�
		
		Map<String,Person> map = service.selectAll();
		EndView.printAll(map);
		}catch(RuntimeException e) {
			EndView.printMessage(e.getMessage());
		}
	}
	/**
	 *key(id)�� �ش��ϴ� ���� �˻�
	 * */
	public static void searchById(String id) {
		try{
		Person person = service.searchByKey(id);
		EndView.printSearch(person);
		}catch(RuntimeException e) {
			EndView.printMessage(e.getMessage());
		}
	}
	
	/**
	 * ����ϱ�
	 * */
	public static void inset(Person person) {
		try {
			service.inset(person);
		}catch(RuntimeException e){
			EndView.printMessage(e.getMessage());
		}
		//service.inset(person);
		
		//service.inset(person);
		
	}
	
	/**
	 * �����ϱ�
	 * */
	public static void delete(String id) {
		try {
			service.delete(id);
			System.out.println("--���� ����");
		}catch(RuntimeException e){
			EndView.printMessage(e.getMessage());
		}
	}
	
	/**
	 * �����ϱ�
	 * */
	public static void update(Person person) {
		try {
			service.update(person);
			//System.out.println("---���� ����");
		}catch(RuntimeException e){
			EndView.printMessage(e.getMessage());
		}
		
	}
	
}
