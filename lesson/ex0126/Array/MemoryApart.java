class MultiArray{
//������ 2���� �迭 8*9
	int [] [] arr = new int [8][9];

	
//�޼ҵ��̸� :array99

	//for loop �� ����Ͽ� 
	//�迭�� ���� (������)�������
	//�迭�� ����� �������

	public void array99(){

		//arr[��][��] = ������

		for (int i=0; i<arr.length ; i++){//8�� �ݺ�( i=0 ~ 7 )
			for ( int j=0; j< arr[i].length; j++){//�� �ݺ� (j=0 ~8)
				arr[i][j] = (i+2)*(j+1); // �迭�� �� ���� (i �� 0���� �����ϴϱ� +2 ���ش�)
				System.out.print(arr[i][j] + "\t");

			}
		
			System.out.println();

		}


	}//�޼ҵ� ��
		
		
}//Ŭ���� ��
/////////////////////////////
public class MemoryApart{
//main�޼ҵ忡�� 
//MultiArray��ü�� array99�޼ҵ�ȣ��
	public static void main(String[] args) {
		MultiArray ma= new MultiArray();
		new MultiArray().array99();
		//ma.array99();
	}

	

	
}


