class MultiArrayExam {
	//String [] [] arr = new String [3][5]; // 3�� 5�� (���� ����)(���� ���� ����)
	//String [] [] arr;
	//String [] [] arr = new String [3][];

	String [] [] arr = new String [][]{ //����� �ʱ�ȭ
		{"A", "B","C" },
		{"��","ȭ","��","��", "��"},
		{"�������", "������?", "���ִ°�", "�԰�ʹ�."}

	};


	public void test() {

	System.out.println("arr= " + arr);
	//System.out.println("arr[0]= " + arr[0]);
	//System.out.println("arr[1]= " + arr[1]);
	//System.out.println("arr[2]= " + arr[2]);

	//System.out.println("arr[3]= " + arr[3]); //ArrayIndexOutofBoundsException �߻�

	System.out.println("arr.length = " + arr.length);

		for (int i=0; i<arr.length ; i++){//��
			for ( int j=0; j<arr.length ; j++){//��
				System.out.print(arr[i][j] + "\t");

			}

			System.out.println();
		}

	}// test �޼ҵ� ��

	public void test2() {
		int [] [] intArr = new int [4][];
		//System.out.println("intArr= " + intArr); // �ּҰ�
		//System.out.println("intArr[0]= " + intArr[0]); //null
		//System.out.println("intArr[0][0]= " + intArr[0][0]);// Nullpointer

		//�� ���� ���� ����
		intArr[0] = new int [5];
		intArr[1] = new int [2];
		intArr[2] = new int [1];
		intArr[3] = new int [4];

		//System.out.println("intArr[0]= " + intArr[0]); //�ּҰ�
		//System.out.println("intArr[0][0]= " + intArr[0][0]); //��
		for (int i=0; i<intArr.length ; i++){//��
			for ( int j=0; j<intArr[i].length ; j++){//��
				System.out.print(intArr[i][j] + "\t");

			}

			System.out.println();
		}
		System.out.println("������ for ----------------");
		////////////////////////////////////
		//�� 2�� �ݺ��� ������ for ����

		for (int[] row : intArr ){//��
			for (int v : row){//��
				System.out.print(v + "\t");
			}

			System.out.println();
		}
		
	}




	public static void main(String[] args) {
		//test() ȣ�� // ���� Ŭ���� �ȿ� ������ ���θ޼ҵ尡 static �̹Ƿ� ���� �������.

		MultiArrayExam ma = new MultiArrayExam();
		//ma.test();
		ma.test2();

	}//���� ��
}//Ŭ���� ��
