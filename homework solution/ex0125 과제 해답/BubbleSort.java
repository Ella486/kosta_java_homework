
import java.util.Arrays;
//��������

class BubbleSort {

	public static void main(String[] args) {

		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		
		System.out.println("���� �� = " + Arrays.toString(arr));

		//�������Ĺ�� : ������ �ִ� �����͸� ���ؼ� ū ���� ������ ��ġ
		int temp=0;// �ӽð��� ����

		for (int i = arr.length-1 ; i>0 ; i--){
			for(int j= 0; j<i ;j++) { 
				if(arr[j] > arr[j+1]) { 
					temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
			} 

		}
		
		System.out.println("���� �� = " + Arrays.toString(arr));
	}
}
