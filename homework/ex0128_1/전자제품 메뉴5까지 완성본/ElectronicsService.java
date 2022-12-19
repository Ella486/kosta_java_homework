/** 
	전자제품에 관련된 기능을 담당할 클래스
*/

class ElectronicsService {
	public static int count; //배열 방에 저장된 제품의 개수를 체크!
	String [][] data = new String [][]{//최초의 초기치 데이터를 준비
		{"100","선풍기","35000","삼성 선풍기"},
		{"200","전자렌지","55000","잘 데워져요.."},
		{"300","에어컨","5500000","무풍 에어컨 너무 시원해"},
		{"400","냉장고","800000","LG 냉장고"},
		{"500","드라이기","9000","LG 드라이기"}
	}; 

	private static ElectronicsService instance = new ElectronicsService();

	Electronics elecArr [] ;

	
	/**
    외부에서 객체 생성안됨.
	*/
	private ElectronicsService(){
		//데이터 초기화(전자제품 초기치 데이터)하자.
		elecArr = new Electronics[10];

		for (int i=0 ; i< data.length ; i++ ){
			elecArr[i] = 
				new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]),data[i][3]);//데이터 초기화

			ElectronicsService.count++;
		}

		/*System.out.println("------------------------");
		for (int i=0 ; i< ElectronicsService.count ; i++){
			System.out.println( elecArr[i] + "|" + elecArr[i].getModelNo() + "|"+ elecArr[i].getModelName());

		}
		System.out.println("------------------------"); */

	}
	/**
		현재 객체를 리턴
	*/
	public static ElectronicsService getInstance(){


		return instance;
	}
	
	/**
		전자제품 등록
		return : true이면 등록성공, false이면 등록실패
	*/
	public boolean insert (Electronics electronics){
		if(elecArr.length == ElectronicsService.count){
		return false;
		}
		elecArr[ElectronicsService.count++] = electronics;

		return true;
	}

	/**
		등록된 전체 전자제품 검색
	*/

	public Electronics [] selectAll(){

		return elecArr;


	}

	/**
		모델번호에 해당하는 전자제품 검색
	*/

	public Electronics searchByModelNo(int modelNo){
		for (int i=0 ;i< ElectronicsService.count ; i++){
				Electronics electronics = elecArr[i];
				if (electronics.getModelNo() == modelNo){ //같으면 찾았다 있다.//이건 대소문자 구분해서 코드를 써줘야함
					return electronics;
				}
				
			}
		return null;
		
	}

	public boolean update(Electronics electronics){
			Electronics dbElec = this.searchByModelNo(electronics.getModelNo());

			if(dbElec != null){//찾았다, 존재한다.
				//전달된 값으로 저장된 값은 변경한다
				
				dbElec.setModelDetail(electronics.getModelDetail());
				return true;
			}

			return false;
	}

	/**
     상품 지우기
     */
    public boolean deleteByModelNo(int modelNo) {
		
       
        for (int i = 0; i < count; i++) {
            Electronics electronics = elecArr[i];
            if (electronics.getModelNo() == modelNo) { //삭제하려는 상품을 찾아서 같으면 
                int j = i;
                for (; j < count - 1; j++) { // 앞으로 한칸씩
                    elecArr[j] = elecArr[j + 1];
                }

                elecArr[j] = null;
                count--; //삭제가 되면 저장된 객체의 수를 감소한다.
                return true;
            }
        }
        return false;
    }

}// 클래스 끝
