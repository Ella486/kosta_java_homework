//TwoDmArrayExam.java

/**
  �����̸�: �̸���
  ��¥: 22.1.26
  ���� : ��ȣ���̾ƿ�
*/



class TwoDmArray{
	//String�� �����ϴ� twoDmArray �迭����
	private String [][] twoDmArray = new String[10][];
	//�޼ҵ� make2DmArray
		void make2DmArray(){

			//twoDmArray �迭��  ���� �Ҵ�
			int len = twoDmArray.length;//���� ����
			for(int i=0; i<len;i++){
				//for(int j=0; j<=i;j++){
					twoDmArray[i] = new String [i+1];//�� ���� ���� ������ ����
					int colsLen = twoDmArray[i].length; // ���� ����

					for (int j =0 ;j< colsLen ;j++ ){
						this.twoDmArray[i][j] = (i+1) + "��" + (j+1) +"ȣ";
						//System.out.print(twoDmArray[i][j] + "\t");

					}
					//System.out.println();
				
			}
			
		}
		
	public void print2DmArray(){
		//���� �迭�� ��(j)�� �� �������� ��� ��(i)�� �� �������� ��Ƽ�
		int len = twoDmArray.length; // ���� ����
			for(int j=0; j<len ;j++){//10�� j = 0 1 2 3 4 
				
				for(int i=0; i<j ;i++){
					System.out.print("\t\t");
				}

				for(int i=j; i<len ;i++){//i�� ������ 0,1,2,3

					System.out.print(twoDmArray[i][j] + "\t");
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
