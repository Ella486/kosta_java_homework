public class NumberOrderAsc implements Comparator<Integer>{
	//오름차순 정렬
	@Override
	public int compare(Integer a, Integer b){//두 값을 비교
		//compare에서 반환되는 값 기준으로 swap을 알아서 진행
		//양수, 음수,0
		//반환형이 양수 : 두개의 수 교체
		// 반환형이 음수 : 교체안함
		// 반환형이 0 : 교체 안함
		// return a-b;

		if(a>b){
			return +1;
		}else if(a<b){
			return -1;
		}else{
			return 0;
		}


	}




}