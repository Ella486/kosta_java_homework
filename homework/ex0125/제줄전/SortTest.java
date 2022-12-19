/*



*/
public class SortTest { 
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
} 
public static void main(String[] args) { 
	int[] target1 = new int[] { 10, 55, 34, 56, 76, 56, 878, 777, 77, 2,23, 0, 5, 45, 351, 4101 }; 
  // 입력된 데이터 한 줄씩 출력
	/*System.out.println("-------입력된 데이터 출력-----------");
	for (int i = 0; i < target1.length; i++) { 
	
    System.out.print( target1[i] +"\t"); 
 } 
	System.out.println(); */
 // 올림차순으로 정렬 
	SortTest.ascendingSort(target1); 
 // 올림차순으로 정렬된 데이터 한 줄씩 출력 
	System.out.println("-------올림차순으로 정렬된 데이터 출력-----------");
	for (int i = 0; i < target1.length; i++) { 
	System.out.print(target1[i] +" "); 
} 
} 
} 