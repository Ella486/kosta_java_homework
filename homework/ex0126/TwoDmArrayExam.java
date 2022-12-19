//TwoDmArrayExam.java

/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 동호레이아웃
*/



class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	private String [][] twoDmArray = new String[10][10];
	//메소드 make2DmArray
		void make2DmArray(){
			for(int i=0; i<10;i++){
				for(int j=0; j<=i;j++){
					twoDmArray[i][j] = (i+1)+"동"+(j+1)+"호";
					//System.out.println(twoDmArray[i][j]);
				}
				
			}
			
		}
		//twoDmArray 배열에  값을 할당
	void print2DmArray(){
			for(int j=0; j<10;j++){
				
				for(int i=0; i<10;i++){
					if(twoDmArray[i][j] != null){
						System.out.print(twoDmArray[i][j]);
					}else{
						System.out.print("      ");
					}
					
					
				}
				System.out.println();
			}
	}
		
	//메소드 print2DmArray - 별찍기 참고
	//	twoDmArray 배열의 값을 주어진형식으로 출력
		
}

public class TwoDmArrayExam{
	//main메소드에서
	public static void main (String [] args){
		TwoDmArray array = new TwoDmArray();
		array.make2DmArray();
		array.print2DmArray();


	}
		//TwoDmArray객체생성
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		
		//TwoDmArray객체의 print2DmArray메소드 호출
		
	
}
