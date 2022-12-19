
/**
	요청된 결과를 화면 출력 담당하는 클래스
*/



class EndView {

	/**
		성공여부 메세지를 출력하는 메소드

	*/
	public static void printMessage(String message){
		System.out.println(message);

	}

	/**
		전체검색의 결과를 출력하는 메소드
	*/
	public static void printSelectAll(Goods [] goodsArr){
		System.out.println("********상품 LIST (" + GoodsService.count+ ") 개 *****************");

		//출력해주세요
		System.out.println("<상품코드>");

		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getCode() );
		}
		System.out.println("<상품이름>");
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getName() );
		}
		System.out.println("<상품가격>");
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getPrice() );
		}
		System.out.println("<상품설명>");
		for (int i=0; i<GoodsService.count ; i++ ){
				System.out.println(goodsArr[i].getExplain() );
		}

	}
	/**
		상품코드에 해당하는 정보 출력하는 메소드
	*/
	public static void printSelectByCode(Goods goods){
		System.out.println("------------------" + goods.getCode() + "에 해당하는 정보----------------");
		//정보출력
			System.out.println("<상품코드>");

				System.out.println(goods.getCode() );
		System.out.println("<상품이름>");
				System.out.println(goods.getName() );
		System.out.println("<상품가격>");
				System.out.println(goods.getPrice() );
		System.out.println("<상품설명>");
				System.out.println(goods.getExplain() );
		
	}
		
}
