class  SortTest00{

	public static void main(String[] args) {
		int[] arr = new int[] {5,7,1,2,4,3,8,9,6,10}; 
  
	SortExam.ascendingSort(arr); 
 
	System.out.println("-------올림차순으로 정렬된 데이터 출력-----------");
	for (int i = 0; i < arr.length; i++) { 
	System.out.print(arr[i] +"\t"); 
	}
		System.out.println();
	}
}
