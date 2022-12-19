/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 배열실습예제(상품 프로그램)
*/

/**
	상품의 속성( 상품코드, 이름, 가격, 설명)을 관리하는 객체
*/

class Goods{

	private String code;
	private String name;
	private int price;
	private String explain;

	// 속성을 조회, 수정할 수 있는 메소드 제공
	//setXxx()
	public void setCode(String code){
		//기능: 인수로 전달된 정보에 대한 유효성 체크!
		this.code = code;

	}
	public void setName(String name){
		this.name = name;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public void setExplain(String explain){
		this.explain = explain;
	}


	//gerXxx()
	public String getCode(){
		return code;
	}


	public String getName(){
		return name;
	}

	
	public int getPrice(){
		return price;
	}
	
	public String getExplain(){
		return explain;
	}
		
}
