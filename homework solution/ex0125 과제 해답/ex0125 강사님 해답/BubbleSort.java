import java.util.Arrays;
/**
 ���� ����(bubble sort)�� ���� �̿��� �����͵��� ���ϸ� ���� ū �����͸� ���� �ڷ� ������ �����ϴ� ����̴�.
*/
class BubbleSort{
	public static void main(String[] args){
		 int arr [] = {5,7,1,2,4,3,8,9,6,10};
		//int arr[] = {15,11,1,3,8};
		
		/*for(int i : arr){
           System.out.print(i+" , ");
		}*/

        System.out.println("���� �� = "+ Arrays.toString(arr));

        //�������Ĺ�� : ������ �ִ� �����͸� ���ؼ� ū���� ������ ��ġ
		int temp=0;//�ӽð�������

		for(int i = arr.length-1 ; i > 0 ; i--){// ... i =  4 3 2 1
			for(int j=0; j< i ; j++){// j < 4 3 2 1  
				if(arr[j] > arr[j+1]){ //0 1 , 1 2 , 2 3  --�ø�����
				//if(arr[j] < arr[j+1]){ //��������
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("���� �� = "+Arrays.toString(arr));//�迭���� ��� ���� �޸����������� ���
     

	}
}