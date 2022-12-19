package ex0211_Lotto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoTest {
	List<Integer> lottoList = new ArrayList<Integer>();
	//int lotto [] = new int [6];//0
    //int cnt=0;//�迭�濡 �ߺ����� ���ڰ� �� ����.
    /**
     * �ζ� ��ȣ �Ѱ� �����Ͽ� ���� �ζǹ�ȣ�� ���Ͽ� ������ �ٽ� ����.
     * */
    public void createLottoNo(){		
		while(lottoList.size() < 6){//1
			 int lottoNo = (int)(Math.random()*45)+1;//5
//			 if(  this.isCompareNo(lottoNo) ){
//				 lotto[cnt] = lottoNo;
//				 cnt++;
//			 }
			 
			 if(this.isCompareNo(lottoNo)) {//true�϶��� �߰�
				 lottoList.add(lottoNo);
				 //cnt++;
			 }
		}

        //System.out.println("�ߺ����� �߰��Ϸ� : " + Arrays.toString(lotto));
        System.out.println("�ߺ����� �߰��Ϸ� : " + lottoList.toString());

    } 
    /**
     * �ζǹ�ȣ ���ϴ� �κ�
	    return : true : �ߺ��ƴ�, false�̸� �ߺ� * */
    public boolean isCompareNo(int lottoNo ){
    	for(int i=0; i < lottoList.size() ; i++){
//    		if(lotto[i] == lottoNo ){
//    		  return false;// �Լ�(�޼ҵ�)�� ����������.
//    		}
    		if(lottoList.get(i)==lottoNo) {
    			return false;
    		}
    	}
    	return true;   	
    }
    
    
    /**
     * �ϼ��� 6�� ��ȣ �����ϱ�
     * */
     public void lottoSort(){
			//�������Ĺ�� : ������ �ִ� �����͸� ���ؼ� ū���� ������ ��ġ
		//int temp=0;//�ӽð�������
		//int len = lotto.length-1;
		//int len = lottoList.size();
		Collections.sort(lottoList);//����Ʈ �������� ����
//		for(int i = len ; i > 0 ; i--){// 
//			for(int j=0; j< i; j++){//
//				if(lotto[j] > lotto[j+1]){ 
//					temp = lotto[j];
//					lotto[j] = lotto[j+1];
//					lotto[j+1] = temp;
//				}
//				}
//			}
//		}
     }
     

     /**
      * ����ϴ� �޼ҵ�
      * */
     public void printLotto(){
     	//���
//		for(int i=0; i< lotto.length ; i++){
//     		System.out.print(lotto[i]+"\t");
//     	}
    	 System.out.println("��� : ");
 		for(int i=0; i< lottoList.size() ; i++){
    	 	//lottoList.sort(null);
     		System.out.print(lottoList.get(i)+"\t");
     	}
     }
	
	public static void main(String[] args) {
		LottoTest lotto = new LottoTest();
		lotto.createLottoNo();
		System.out.println("--�������� ----");

		lotto.lottoSort();
		lotto.printLotto();

	}
	

}
