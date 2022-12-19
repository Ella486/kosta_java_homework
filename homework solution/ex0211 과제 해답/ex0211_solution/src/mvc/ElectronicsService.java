package mvc;

import java.util.ArrayList;
import java.util.List;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

class ElectronicsService {
    String [][] data = new String [][]{
		{"100","선풍기","35000","삼성 선풍기"},
		{"200","전자렌지","55000","잘 데워져요.."},
		{"300","에어컨","5500000","무풍 에어컨 너무 시원해"},
		{"400","냉장고","800000","LG 냉장고"},
		{"500","드라이기","9000","LG 드라이기"}
	}; // 최초의 초기치 데이터를 준비!! electronics에 저장 

    private static ElectronicsService instance = new ElectronicsService(); 
    private static final int MAX_SIZE=10;
   
    List<Electronics> list = new ArrayList<Electronics>();

    /** 
     * 외부에서 객체 생성안됨. 
     */
    private ElectronicsService() {
        // 데이터 초기화(전자제품 초기치 데이터) 하자.
        for(int i=0; i< data.length; i++) {
            list.add( new Electronics(Integer.parseInt(data[i][0]), data[i][1], Integer.parseInt(data[i][2]), data[i][3]) ); // 데이터 초기화 
        }
      
    }

    /**
     * 현재 객체를 리턴해준다.
     * @return
     */
    public static ElectronicsService getInstance() {

        return instance;
    }

    /**
     * 전자제품 등록
     *
     * @param electronics
     * @return
     */
    public void insert(Electronics electronics) throws ElectronicsArrayBoundsException{
        // 배열의 길이가 벗어났는지만 체크하고 
        if(list.size() == ElectronicsService.MAX_SIZE) {//최대 10개까지만 저장하자!!!라는 시나리오가 있다는 가정하에...
            throw new ElectronicsArrayBoundsException("배열의 길이를 벗어나 더이상 등록 할수 없습니다.");
        }
        
        list.add(electronics);
        
    }

    /**
     * 등록된 전체 전자제품 검색 
     * @return
     */
    public List<Electronics> selectAll() {
        return list;
    }

    /**
     * 모델번호에 해당하는 전자제품 검색 
     * @param modelNo
     * @return
     */
    public Electronics searchByModelNo(int modelNo)throws SearchNotFoundException {
       /* for(int i=0; i < list.size() ; i++) {
        	  Electronics elec = list.get(i);
            if(elec.getModelNo() == modelNo ){
                return elec;
            }
        }*/
    	
    	//개선된 for로변경
    	for(Electronics elec : list) {
    		if(elec.getModelNo() == modelNo ){
                return elec;
            }
    	}
    	
        
        //찾는 정보가 없다!!!
        throw new SearchNotFoundException(modelNo+"는 없는 모델번호로 검색할수 없습니다.");
        
    }


    /**
     * 모델번호에 해당하는 전자제품 수정하기 
     * (설명만 수정한다)
     * @param electronics
     * @return
     */
    public void update(Electronics electronics) throws SearchNotFoundException{
		//인수로 전달된 모델번호에 해당하는 전자제품이 있는지 검색한다.
        Electronics dbElectronics = this.searchByModelNo(electronics.getModelNo());
     
         dbElectronics.setModelDetail( electronics.getModelDetail()  );
         
    }


    
} // 클래스 끝 














