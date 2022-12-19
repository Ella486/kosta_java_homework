import java.util.Arrays;
/**
���� ����(selection sort)�� ���ĵ��� ���� �����͵鿡 ���� ���� ���� �����͸� ã�� ���� ���� �����Ϳ� ��ȯ�س����� ����̴�. 
*/
class SelectionSort{
	public static void main(String[] args){
		int arr[] = {5,7,1,2,4,3,8,9,6,10};
        //int arr[] = {15,11,1,3,8};
         
     System.out.println("���� �� = " + Arrays.toString(arr)+"\n\n");

       int len = arr.length;
		int minIndex = 0; //�ּҰ��� ��ġ 
		int temp = 0; //�ӽú���
      
		for(int i = 0; i < len-1; i++){
			minIndex = i; //0
			for(int j = i+1; j < len; j++){ // j= 1 2 3 4 
				if(arr[minIndex] > arr[j] ){
					minIndex = j; // ���� ���� �������� index�� ã�´�.
				}
			}
            System.out.println("minIndex = " + minIndex  + ", i = " + i );
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println("���� i = "+i+"�϶�  : "+Arrays.toString(arr)+"\n");	
		}

         System.out.println("\n���� �� = "+Arrays.toString(arr));	
	}
}