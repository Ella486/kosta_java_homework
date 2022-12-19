import java.util.Arrays;
/**
 버블 정렬(bubble sort)은 서로 이웃한 데이터들을 비교하며 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식이다.
*/
class BubbleSort{
	public static void main(String[] args){
		 int arr [] = {5,7,1,2,4,3,8,9,6,10};
		//int arr[] = {15,11,1,3,8};
		
		/*for(int i : arr){
           System.out.print(i+" , ");
		}*/

        System.out.println("정렬 전 = "+ Arrays.toString(arr));

        //버블정렬방식 : 인접해 있는 데이터를 비교해서 큰값을 오른쪽 배치
		int temp=0;//임시공간변수

		for(int i = arr.length-1 ; i > 0 ; i--){// ... i =  4 3 2 1
			for(int j=0; j< i ; j++){// j < 4 3 2 1  
				if(arr[j] > arr[j+1]){ //0 1 , 1 2 , 2 3  --올림차순
				//if(arr[j] < arr[j+1]){ //내림차순
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후 = "+Arrays.toString(arr));//배열방의 모든 값을 콤마를기준으로 출력
     

	}
}