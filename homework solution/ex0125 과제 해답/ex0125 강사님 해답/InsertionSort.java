
/**
���� ����(insertion sort)�� ���� ���ĵ��� ���� ������ �����͸� 
�̹� ���ĵ� �κ��� ������ ��ġ�� ������ ���� �����ϴ� ����̴�. 
*/
import java.util.Arrays;
public class InsertionSort { 
	public void algorithm( int[] arr ){//{15,11,1,3,8};
		System.out.println("���� �� = " + Arrays.toString(arr)); 

		int num = 0, j = 0;	
		// �迭 ���� ��ŭ �ݺ�
		for (int i=1; i< arr.length; i++){ // {15,11,1,3,8};
			num = arr[i]; //key���� ���� num �� ��Ƶд�.
			System.out.println("Ű��>"+num);//2

			//���ĵ� ����Ʈ ��, Ű������ ��Ұ��� Ŭ ��� ���� �ݺ�
			for (j=i-1; j >= 0 &&  num < arr[j] ; j--){//i=1�϶�, j=0  / i=2�϶�  j=1 0  , i=3�϶�  j=2 1 0 , i=4�϶� j= 3 2 1 0
				arr[j+1] = arr[j]; // ���ĵȸ���Ʈ�� ���� ���� ��ҿ� ���� (���簳��)
				System.out.println("����>"+Arrays.toString(arr));
			}

			arr[j+1] = num; // key���� ���� 
			System.out.println("���> j ="+ j+" | " +Arrays.toString(arr)+"\n");
		}

		System.out.println("\n������ "+Arrays.toString(arr));
	}



	public static void main (String[] args){
		int [] arr = {15,11,1,3,8};

		InsertionSort is  = new InsertionSort();
		is.algorithm(arr);
	} 
}
