
class ArrayValue{
	//������ 10�� �����ϴ� �迭����(����� ���ÿ� ���ǰ� ����)
	//������ Ÿ�� �迭�̸� [ ] = new ������Ÿ�� [ ]{��, ��, ��,......};
	//int [] arr = new int [10]; //0�� ���ϴ� ������ �ʱ�ȭ
	int [] arr = new int []{1,2,3,4,5,6,7,8,9,10};


   /*printArrayvalue �޼ҵ��ۼ�
       => �޼ҵ� �ȿ��� ���� ����� �迭���� ���� ����Ѵ�.
   
	*/	
	public void printArrayvalue(){

		System.out.println("arr=" + arr);// �ּҰ� 
		System.out.println("arr.length =" + arr.length);//�迭 ���� ũ��
		System.out.println("arr[2]=" + arr[2]);// 2���� ���� ���� ���

		System.out.println("*************�迭�� �� ��� **********************");
		/**int len = arr.length;
		for(int i=0; i < len ; i++){ */
		for(int i=0; i < arr.length ; i++){
			System.out.println("arr["+i+"] =" + arr[i]);
		}

		System.out.println("-----������ for�� version 1.5�̻� �߰� ---------");
		/*
			for( Ÿ�� ���� : �ݺ���� ){ // �ݺ������ 0�������� �������������� �ݺ��ϸ� �����͸� �����ش�.
				System.out.println(����);  // �� �迭���� ���� ���´�.  
			}
		*/
		for ( int arrValue : arr){

			System.out.println(arrValue);
		}
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue�� �ִ� printArrayvalue�޼ҵ� ȣ��
		 ArrayValue av = new ArrayValue();
		 av.printArrayvalue();

		 //new ArrayValue().printArrayvalue(); // �޼ҵ尡 �ϳ��� �ְ� �ѹ� ���� ������ ���
	}
}