//TwoDmArrayExam.java

/**
  본인이름: 이명진
  날짜: 22.1.26
  주제 : 동호레이아웃
*/



class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	private String [][] twoDmArray = new String[10][];
	//메소드 make2DmArray
		void make2DmArray(){

			//twoDmArray 배열에  값을 할당
			int len = twoDmArray.length;//행의 길이
			for(int i=0; i<len;i++){
				//for(int j=0; j<=i;j++){
					twoDmArray[i] = new String [i+1];//각 행의 열을 개수를 생성
					int colsLen = twoDmArray[i].length; // 열의 개수

					for (int j =0 ;j< colsLen ;j++ ){
						this.twoDmArray[i][j] = (i+1) + "동" + (j+1) +"호";
						//System.out.print(twoDmArray[i][j] + "\t");

					}
					//System.out.println();
				
			}
			
		}
		
	public void print2DmArray(){
		//기존 배열의 열(j)을 행 방향으로 잡고 행(i)을 열 방향으로 잡아서
		int len = twoDmArray.length; // 행의 길이
			for(int j=0; j<len ;j++){//10행 j = 0 1 2 3 4 
				
				for(int i=0; i<j ;i++){
					System.out.print("\t\t");
				}

				for(int i=j; i<len ;i++){//i의 시작이 0,1,2,3

					System.out.print(twoDmArray[i][j] + "\t");
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
