/**
	View와 Model 사이에서 중간역할.
	: 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고
	  호출한 결과를 받아서 결과 값에 따라 결과 뷰를 호출해준다.
*/

class ElectronicsController {

	private ElectronicsService service = ElectronicsService.getInstance() ;
	private Electronics [] elecArr = new Electronics [10];

	/**
		전자제품 등록
	*/
	public void insert (Electronics electronics){
		//등록전에 중복여부를 체크하고 중복아니면 등록한다.
		Electronics savedElec = service.searchByModelNo(electronics.getModelNo());
		 if(savedElec == null){ //중복아니다.
		 if(  service.insert(electronics)  ){
             EndView.printMessage("등록되었습니다.");  
		 }else{
             EndView.printMessage("등록되지 않았습니다.");
		 }

	  }else{
         EndView.printMessage(electronics.getModelNo()+"는 중복이므로 등록할수 없습니다.");
	  }

	}

	/**
		전체검색
	*/
	public void selectAll(){

		Electronics[] elecArr = service.selectAll();
		EndView.printAll(elecArr);
		

	}

	/**
		모델번호에 해당하는 전자제품 검색
	*/
	public void searchByModelNo(int modelNo){

		Electronics electronics = service.searchByModelNo(modelNo);//호출
		if(electronics == null){
			EndView.printMessage(modelNo + "는 없는 정보이므로 검색할 수 없습니다.");
		}else{
			EndView.printSearchByModelNo(electronics);
			
		}
	         
	}

	/**
		모델번호에 해당하는 전자제품 수정하기
	*/
	public void update(Electronics electronics){

		Electronics elec = service.searchByModelNo(electronics.getModelNo()); //맴버필드 호출
		elec.setModelDetail(electronics.getModelDetail());

		//생성된 electronics를 가지고 서비스로 이동한다.(호출한다.)
		boolean result = service.update(elec);
		if(result){
			EndView.printMessage(electronics.getModelNo() + " 에 해당하는 상품의 정보가 수정되었습니다.");
		}else{
			EndView.printMessage("수정되지 않았습니다");
		}

	}
	/**
		모델번호에 해당하는 전자제품 삭제하기
	*/
	public void forDelete(int modelNo){
		
		if (service.deleteByModelNo(modelNo)) {
            EndView.printMessage("삭제되었습니다.");
        } else {
            EndView.printMessage("없는 모델번호입니다.");
        }

	}
	
	/**정렬하기*/
	public void forSort(String by) {

		Electronics[] electronics = service.selectAllSortBy(by);
        if (electronics == null) {
            EndView.printMessage("정렬 기준(" + by + ")는 올바르지 않은 입력입니다.");
        } else {
            EndView.printAll(electronics);//정렬해준 값이 들어온거임
        }

	}

}//클래스 끝
