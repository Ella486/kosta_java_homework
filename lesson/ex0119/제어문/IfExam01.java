class IfExam01{
	// ������ ���� �ݵ�� �ʿ��� ���θ޼ҵ� �ۼ�
	public static void main(String [] args){
		//������ ������ �����ϰ� ������ ������ �ʱ�ȭ�Ѵ�.
		int no = 3431;

		//����� ������ ���� ¦���̸� "¦���Դϴ�." Ȧ���̸� "Ȧ���Դϴ�" ���
 
		if(no%2==0){
			System.out.println( no + "�� ¦���Դϴ�.");  
		}else{
			System.out.println( no + "�� Ȧ���Դϴ�.");  
		}
            System.out.println( "*************************");

		if(no%7==0){
			System.out.println( no + "�� 7�� ����Դϴ�.");  
		}else{
			System.out.println( no + "�� 7�� ��� �ƴϴ�.");  
		}
		System.out.println( "*************************");

     //�����߻�
		double nansu = Math.random() ; //Math.random() �� �޼ҵ�� 0.0�� 1.0 ���̿� ���ϴ� double Ÿ���� ���� �ϳ��� ������
		System.out.println( "nansu=" + nansu); // 0.0 <= Math.random() <1.0

		no = (int)(nansu*5)+1; //1~5    
		System.out.println("no =" + no);
		//start���� �����ϴ� n���� ���� �߿��� ������ ���� �ϳ��� ��� ���� �����
		// int num = (int)(Math.random() * n) + start;  n = ����� ��, start�� �ּҰ�


}


   }