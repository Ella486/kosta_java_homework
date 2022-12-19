/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 배열실습예제(상품 프로그램)
*/


/**
	상품에 대한 CRUD 작업: B/L
	   : 전체검색, 등록, 수정, 삭제......

  */

class GoodsService {

	private Goods [] goodsArr = new Goods [10];
	static int count; // 배열에 Goods가 저장된 개수를 체크!!!

	/**
		초기치 데이터를 세팅하는 메소드 작성
		String [] [] data = new String [][]{
			{"A1", "새우깡", "2500", "짜고 맛나다"}, //-----> Goods의 객체에 담기
			{"A2", "콘칩", "1500", "고소하다"},
			{"A3", "허니버터칩", "3500", "달고 짜고 맛나다"},
			{"A4", "감자깡", "1800", "감자의 맛"},
			{"A5", "고구마깡", "3000", "고구마의 맛"},

		};


	*/
	public void init(String [][] data){

		//goodsArr[0] = new Goods();
		//goodsArr[0].setcode();
		for (int i=0; i<data.length ; i++){ //data.length는 행의 길이
			goodsArr[i] = this.create(data[i]);
			GoodsService.count ++;
		}

	}

	/**
		Goods를 생성해서 리턴해주는 메소드 작성
	*/
	private Goods create(String [] row){//{"A1", "새우깡", "2500", "짜고 맛나다"}
		Goods goods = new Goods();
		goods.setCode(row[0]);
		goods.setName(row[1]);
		goods.setPrice(Integer.parseInt(row[2]));
		goods.setExplain(row[3]);

		return goods;

	}

	/**
	   등록하기
		:등록전에 상품코드가 중복인지를 체크해서 중복이 아닐 때 등록한다.

		@return : int형 (0이면 상품코드중복, 
						1이면 등록 성공, 
						-1이면 배열의 길이를 벗어나서 등록이 안됨)
	*/
	public int insert( Goods goods){// String code, String name, int price, String explain ()안에 들어갈 인수들 but, Goods 타입 인수
		if (goodsArr.length == GoodsService.count){
				return -1;
			
		}
		//중복체크
		if (this.selectByCode(goods.getCode()) != null){
				return 0;

		}
		
		//중복 아니면 등록
		goodsArr[GoodsService.count] = goods;
		GoodsService.count ++;

		return 1;

	}

	/**
	   전체검색
	   @return : Goods 타입의 배열(배열이름 하나에 여러개의 상품을 담아서 리턴)

	*/
	public Goods[] selectAll(){

			return goodsArr;

	}


	/**
	   상품코드에 해당하는 상품검색
	   return : 만약 인수로 전달된 code에 해당하는 정보가 있으면 Goods를 리턴하고
				없으면 null을 리턴한다.
	*/
	public Goods selectByCode(String code){
		//System.out.print("입력한코드는 - " + code);
		//System.out.print("--goods 0 -- " + goodsArr[].getCode() );
		for(int i=0; i<count; i++){
			//System.out.println("-i-:"+ i + goodsArr[i].getCode());
			if(goodsArr[i].getCode().equals(code)){
				return goodsArr[i];
			}
		}
		return null;

	}

	/**
	   상품코드에 해당하는 상품가격, 설명 수정하기
		return : boolean형은 수정이 완료되면 true, 아니면 false
	*/
	public boolean update(Goods goods){// 상품코드, 가격, 설명
			if(goods != null){
				return true;
			}else{
				return false;
			}
		

	}


}//클래스 끝
