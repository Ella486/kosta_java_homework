/**
  본인이름: 이명진
  날짜: 22.1.25
  주제 : 올림차순
*/
public class SortExam { 
	public static void ascendingSort(int[] arr) { 
		int tmp; 
		for(int i=0;i<arr.length;i++) { 
			for(int j=i+1;j<arr.length;j++) { 
				if(arr[i] > arr[j]) { 
					tmp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = tmp; 
				} 
			} 
		} 
	} //메소드 끝
	public static void main(String[] args) { 
		int[] arr = new int[] {5,7,1,2,4,3,8,9,6,10}; 
   
		SortExam.ascendingSort(arr); 
	// 올림차순으로 정렬된 데이터 한 줄씩 출력 
		System.out.println("-------올림차순으로 정렬된 데이터 출력-----------");
		for (int i = 0; i < arr.length; i++) { 
		System.out.print(arr[i] +"\t"); 
		} 
	} //메인 메소드 끝
} //클래스 끝