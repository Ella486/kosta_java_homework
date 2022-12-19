
import java.util.Arrays;
//버블정렬

class BubbleSort {

	public static void main(String[] args) {

		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		
		System.out.println("정렬 전 = " + Arrays.toString(arr));

		//버블정렬방식 : 인접해 있는 데이터를 비교해서 큰 값을 오른쪽 배치
		int temp=0;// 임시공간 변수

		for (int i = arr.length-1 ; i>0 ; i--){
			for(int j= 0; j<i ;j++) { 
				if(arr[j] > arr[j+1]) { 
					temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
			} 

		}
		
		System.out.println("정렬 전 = " + Arrays.toString(arr));
	}
}
