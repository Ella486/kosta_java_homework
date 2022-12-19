/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 배열실습예제(상품 프로그램)
*/



/**
	요청된 결과를 화면 출력 담당하는 클래스
*/



class EndView {

	/**
		성공여부 메세지를 출력하는 메소드

	*/
	public static void printMessage(String message){
		System.out.println(message +"\t");

	}

	/**
		전체검색의 결과를 출력하는 메소드
	*/
	public static void printSelectAll(Goods [] goodsArr){//
		System.out.println("********상품 LIST (" + GoodsService.count+ ") 개 *****************");

		//출력해주세요
		
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.print(goodsArr[i].getCode() + " | ");
				System.out.print(goodsArr[i].getName() + " | ");
				System.out.print(goodsArr[i].getPrice() + " | ");
				System.out.print(goodsArr[i].getExplain() + " \n ");
		}
		
	}
	/**
		상품코드에 해당하는 정보 출력하는 메소드
	*/
	public static void printSelectByCode(Goods goods){
		System.out.println("------------------" + goods.getCode() + "에 해당하는 정보----------------");
		//정보출력
			System.out.print(goods.getCode() + " | ");
			System.out.print(goods.getName() + " | ");
			System.out.print(goods.getPrice() + " | ");
			System.out.print(goods.getExplain() + " \n ");
	}

	public static void printSelectByName(Goods goods){
		System.out.println("------------------" + goods.getName() + "에 해당하는 정보----------------");
		//정보출력
			System.out.print(goods.getCode() + " | ");
			System.out.print(goods.getName() + " | ");
			System.out.print(goods.getPrice() + " | ");
			System.out.print(goods.getExplain() + " \n ");
	}
		
}
