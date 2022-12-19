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
	 * 샘플 초기치 데이터 5명을 설정한다.
	 */
	public MapStudentService() {
		map.put("jang", this.create("jang", "장희정", 20)); // Person
		map.put("kim", this.create("kim", "김희선", 24)); // Person

		map.put("queen", this.create("queen", "이효리", 27, 80, 90, 80)); // Student
		map.put("king", this.create("king", "송중기", 22, 95, 95, 100)); // Student
		map.put("girl", this.create("girl", "송혜교", 23, 75, 90, 80)); // Student
	}

	/**
	 * map에 저장할 객체를 생성해서 리턴해주는 메소드
	 */
	public Person create(String id, String name, int age, int... params) {
		if (params.length == 0) {
			return new Person(id, name, age);
		} else if (params.length == 3) {
			return new Student(id, name, age, params[0], params[1], params[2]);
		} else {
			throw new RuntimeException("전달된 인수가 잘못되어 생성할수 없어요.");
		}
	}

	/**
	 * 전체검색
	 */
	public Map<String, Person> selectAll() {
		if(map.size()==0 || map.isEmpty()) {
			throw new RuntimeException("저장된 정보가 없습니다.");
		}
		return map;
	}
	
	

	/**
	 * key에 해당하는 정보 검색 : key해당하는 정보를 출력할때 
	 * [ Person인경우는 이름만 출력 Student인경우는 이름과 총점 출력 ]
	 * -> EndView에서 없는경우는 "id는 없습니다." 예외발생
	 */
	public Person searchByKey(String key){
		Person p = map.get(key);
		 if(p==null)
			 throw new RuntimeException(key + "에 해당하는 정보는 없습니다.");
		 
		 return p;
	}

	
	/**
	 * 등록하기 등록 : key와 Person의 정보를 받아 등록하는 메소드 등록이 실패하면(id중복체크!!) 예외발생시킨다.("등록되지
	 * 않았습니다.")
	 */
	public void insert(Person person){ // person안의 id가 key가 된다.
		//등록전에 id 중복체크
		if( map.containsKey(person.getId()) )
			throw new RuntimeException(person.getId() + "는 중복이므로 등록할수 없습니다.");
		
		map.put(person.getId(), person);
		
	}//insertEnd
	
	

	/**
	 * 삭제하기 : id에 해당하는 value가 삭제되지 않으면 예외발생 (삭제되지 않았습니다.)
	 */
	public void delete(String key) { // key는 곧 ID
		Person person = map.remove(key); //삭제가 되면 삭제된 value를리턴해준다.,삭제안되면 null
		
		if(person==null)
			throw new RuntimeException(key+"에 해당하는 정보를 삭제할 수 없습니다.");
	}

	
	
	
	/**
	 * 수정하기 만약, 
	 * Person인경우 - 이름만 수정 
	 * Student인경우 - 이름, 국어 ,영어,수학수정(총점 변경) 수정이 
	 * 안된다면 예외발생
	 * - 인수로 전달된 객체타입과 key의 해당하는 객체 타입이 일치할때 수정해야한다.
	 *  만약, 인수는 Student인데 key 찾은 객체가
	 * Person이라면 수정하면 안된다.
	 * 
	 *      1) Person인경우는 이름만 수정

	    	 2) Student경우는 이름, 국어, 수학, 영어, 총점

	    	3) 인수와 찾은게 타입 오류이면 예외

	    	4) key없어도 예외를 발생
	 */
	public void update(Person person) { // 아이디, 이름 추가적으로 국, 영, 수
	    	Person searchP = map.get(person.getId());
	    	if(searchP==null) //전달된 id에 해당하는 정보가 없다!!!
	    		throw new RuntimeException(person.getId()+"는 잘못되어 수정할수 없습니다.");
	    	
	    	
	    	//key에 해당하는 정보가 있으니 type이 일치하는지 체크해본다.
	    	if(person instanceof Student){
	    		if(searchP instanceof Student){
	    			 //2) 변경을 하고 싶다.
	    	    	Student searchSt = (Student)searchP;
		    		Student paramSt = (Student)person;
		    		
		    		searchSt.setName(paramSt.getName());
		    		searchSt.setKor(paramSt.getKor());
		    		searchSt.setEng(paramSt.getEng());
		    		searchSt.setMath(paramSt.getMath());
		    		
		    		//총점변경
		    		int sum = paramSt.getKor() + paramSt.getEng() + paramSt.getMath();
		    		
		    		searchSt.setSum(sum);//총점변경
		    		
	    	    }else{
	    	       //3) 타입오류
	    	    	throw new RuntimeException("타입 오류로 수정에 실패했습니다.");
	    	    }
	    	} else{
	    	    //이름 변경...
	    		searchP.setName(person.getName());
	    	}
		
	    	
	    	
	    	
	}
}















