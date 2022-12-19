class MultiArray{
//정수형 2차원 배열 8*9
	int [] [] arr = new int [8][9];

	
//메소드이름 :array99

	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력

	public void array99(){

		//arr[행][열] = 구구단

		for (int i=0; i<arr.length ; i++){//8행 반복( i=0 ~ 7 )
			for ( int j=0; j< arr[i].length; j++){//열 반복 (j=0 ~8)
				arr[i][j] = (i+2)*(j+1); // 배열에 값 저장 (i 가 0부터 시작하니까 +2 해준다)
				System.out.print(arr[i][j] + "\t");

			}
		
			System.out.println();

		}


	}//메소드 끝
		
		
}//클래스 끝
/////////////////////////////
public class MemoryApart{
//main메소드에서 
//MultiArray객체의 array99메소드호출
	public static void main(String[] args) {
		MultiArray ma= new MultiArray();
		new MultiArray().array99();
		//ma.array99();
	}

	

	
}


