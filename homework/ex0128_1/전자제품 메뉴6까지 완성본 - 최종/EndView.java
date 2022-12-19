/**
	사용자 요청에 해당하는 결과를 모니터에 출력하는 클래스
*/

class EndView {

	/**
		전달된 배열을 출력(전체 검색 결과)
	*/

	public static void printAll(Electronics[] elecArr){

		System.out.println("********상품 LIST (" + ElectronicsService.count+ ") 개 *****************");

		//출력해주세요
		
		for (int i=0; i<ElectronicsService.count ; i++ ){
				System.out.print(elecArr[i].getModelNo() + " | ");
				System.out.print(elecArr[i].getModelName() + " | ");
				System.out.print(elecArr[i].getModelPrice() + " | ");
				System.out.print(elecArr[i].getModelDetail() + " \n ");
		}


	}
	
	/**
		모델번호에 해당하는 전자제품 출력
	*/

	public static void printSearchByModelNo(Electronics electronics){
		System.out.println("--------"+electronics.getModelNo() +"에 해당하는 정보--------------");
	   //정보 출력해주세요
	   System.out.print( electronics.getModelNo() +" | ");
	   System.out.print( electronics.getModelName() +" | ");
	   System.out.print( electronics.getModelPrice() +" | ");
	   System.out.print( electronics.getModelDetail() +"\n");


	}

	/**
	성공여부에 관련된 메세지 출력
	*/

	public static void printMessage(String message){
		System.out.println(message+"\n");

	}


}
