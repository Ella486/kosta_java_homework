/**
  �����̸�: �̸���
  ��¥: 22.1.25
  ���� : �ø�����
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
	} //�޼ҵ� ��
	public static void main(String[] args) { 
		int[] arr = new int[] {5,7,1,2,4,3,8,9,6,10}; 
   
		SortExam.ascendingSort(arr); 
	// �ø��������� ���ĵ� ������ �� �پ� ��� 
		System.out.println("-------�ø��������� ���ĵ� ������ ���-----------");
		for (int i = 0; i < arr.length; i++) { 
		System.out.print(arr[i] +"\t"); 
		} 
	} //���� �޼ҵ� ��
} //Ŭ���� ��