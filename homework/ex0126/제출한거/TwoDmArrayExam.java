//TwoDmArrayExam.java

/**
  �����̸�: �̸���
  ��¥: 22.1.26
  ���� : ��ȣ���̾ƿ�
*/



class TwoDmArray{
	//String�� �����ϴ� twoDmArray �迭����
	private String [][] twoDmArray = new String[10][10];
	//�޼ҵ� make2DmArray
		void make2DmArray(){
			for(int i=0; i<10;i++){
				for(int j=0; j<=i;j++){
					twoDmArray[i][j] = (i+1)+"��"+(j+1)+"ȣ";
					//System.out.println(twoDmArray[i][j]);
				}
				
			}
			
		}
		//twoDmArray �迭��  ���� �Ҵ�
	void print2DmArray(){
			for(int j=0; j<10;j++){
				
				for(int i=0; i<10;i++){
					if(twoDmArray[i][j] != null){
						System.out.print(twoDmArray[i][j]);
					}else{
						System.out.print("      ");
					}
					
					
				}
				System.out.println();
			}
	}
		
	//�޼ҵ� print2DmArray - ����� ����
	//	twoDmArray �迭�� ���� �־����������� ���
		
}

public class TwoDmArrayExam{
	//main�޼ҵ忡��
	public static void main (String [] args){
		TwoDmArray array = new TwoDmArray();
		array.make2DmArray();
		array.print2DmArray();


	}
		//TwoDmArray��ü����
		
		//TwoDmArray��ü�� make2DmArray�޼ҵ� ȣ��
		
		//TwoDmArray��ü�� print2DmArray�޼ҵ� ȣ��
		
	
}
