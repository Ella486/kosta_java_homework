package ex0214.map.exam;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStudentService {
	private Map<String, Person> map = new HashMap<String, Person>();
	//private Map<String, Person> map = new TreeMap<String, Person>();

	/**
	 * ���� �ʱ�ġ ������ 5���� �����Ѵ�.
	 */
	public MapStudentService() {
		map.put("jang", this.create("jang", "������", 20)); // Person
		map.put("kim", this.create("kim", "����", 24)); // Person

		map.put("queen", this.create("queen", "��ȿ��", 27, 80, 90, 80)); // Student
		map.put("king", this.create("king", "���߱�", 22, 95, 95, 100)); // Student
		map.put("girl", this.create("girl", "������", 23, 75, 90, 80)); // Student
	}

	/**
	 * map�� ������ ��ü�� �����ؼ� �������ִ� �޼ҵ�
	 */
	public Person create(String id, String name, int age, int... params) {
		if (params.length == 0) {
			return new Person(id, name, age);
		} else if (params.length == 3) {
			return new Student(id, name, age, params[0], params[1], params[2]);
		} else {
			throw new RuntimeException("���޵� �μ��� �߸��Ǿ� �����Ҽ� �����.");
		}
	}

	/**
	 * ��ü�˻�
	 */
	public Map<String, Person> selectAll() {
		if(map.size()==0 || map.isEmpty()) {
			throw new RuntimeException("����� ������ �����ϴ�.");
		}
		return map;
	}
	
	

	/**
	 * key�� �ش��ϴ� ���� �˻� : key�ش��ϴ� ������ ����Ҷ� 
	 * [ Person�ΰ��� �̸��� ��� Student�ΰ��� �̸��� ���� ��� ]
	 * -> EndView���� ���°��� "id�� �����ϴ�." ���ܹ߻�
	 */
	public Person searchByKey(String key){
		Person p = map.get(key);
		 if(p==null)
			 throw new RuntimeException(key + "�� �ش��ϴ� ������ �����ϴ�.");
		 
		 return p;
	}

	
	/**
	 * ����ϱ� ��� : key�� Person�� ������ �޾� ����ϴ� �޼ҵ� ����� �����ϸ�(id�ߺ�üũ!!) ���ܹ߻���Ų��.("��ϵ���
	 * �ʾҽ��ϴ�.")
	 */
	public void insert(Person person){ // person���� id�� key�� �ȴ�.
		//������� id �ߺ�üũ
		if( map.containsKey(person.getId()) )
			throw new RuntimeException(person.getId() + "�� �ߺ��̹Ƿ� ����Ҽ� �����ϴ�.");
		
		map.put(person.getId(), person);
		
	}//insertEnd
	
	

	/**
	 * �����ϱ� : id�� �ش��ϴ� value�� �������� ������ ���ܹ߻� (�������� �ʾҽ��ϴ�.)
	 */
	public void delete(String key) { // key�� �� ID
		Person person = map.remove(key); //������ �Ǹ� ������ value���������ش�.,�����ȵǸ� null
		
		if(person==null)
			throw new RuntimeException(key+"�� �ش��ϴ� ������ ������ �� �����ϴ�.");
	}

	
	
	
	/**
	 * �����ϱ� ����, 
	 * Person�ΰ�� - �̸��� ���� 
	 * Student�ΰ�� - �̸�, ���� ,����,���м���(���� ����) ������ 
	 * �ȵȴٸ� ���ܹ߻�
	 * - �μ��� ���޵� ��üŸ�԰� key�� �ش��ϴ� ��ü Ÿ���� ��ġ�Ҷ� �����ؾ��Ѵ�.
	 *  ����, �μ��� Student�ε� key ã�� ��ü��
	 * Person�̶�� �����ϸ� �ȵȴ�.
	 * 
	 *      1) Person�ΰ��� �̸��� ����

	    	 2) Student���� �̸�, ����, ����, ����, ����

	    	3) �μ��� ã���� Ÿ�� �����̸� ����

	    	4) key��� ���ܸ� �߻�
	 */
	public void update(Person person) { // ���̵�, �̸� �߰������� ��, ��, ��
	    	Person searchP = map.get(person.getId());
	    	if(searchP==null) //���޵� id�� �ش��ϴ� ������ ����!!!
	    		throw new RuntimeException(person.getId()+"�� �߸��Ǿ� �����Ҽ� �����ϴ�.");
	    	
	    	
	    	//key�� �ش��ϴ� ������ ������ type�� ��ġ�ϴ��� üũ�غ���.
	    	if(person instanceof Student){
	    		if(searchP instanceof Student){
	    			 //2) ������ �ϰ� �ʹ�.
	    	    	Student searchSt = (Student)searchP;
		    		Student paramSt = (Student)person;
		    		
		    		searchSt.setName(paramSt.getName());
		    		searchSt.setKor(paramSt.getKor());
		    		searchSt.setEng(paramSt.getEng());
		    		searchSt.setMath(paramSt.getMath());
		    		
		    		//��������
		    		int sum = paramSt.getKor() + paramSt.getEng() + paramSt.getMath();
		    		
		    		searchSt.setSum(sum);//��������
		    		
	    	    }else{
	    	       //3) Ÿ�Կ���
	    	    	throw new RuntimeException("Ÿ�� ������ ������ �����߽��ϴ�.");
	    	    }
	    	} else{
	    	    //�̸� ����...
	    		searchP.setName(person.getName());
	    	}
		
	    	
	    	
	    	
	}
}















