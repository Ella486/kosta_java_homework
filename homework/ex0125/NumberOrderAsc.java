public class NumberOrderAsc implements Comparator<Integer>{
	//�������� ����
	@Override
	public int compare(Integer a, Integer b){//�� ���� ��
		//compare���� ��ȯ�Ǵ� �� �������� swap�� �˾Ƽ� ����
		//���, ����,0
		//��ȯ���� ��� : �ΰ��� �� ��ü
		// ��ȯ���� ���� : ��ü����
		// ��ȯ���� 0 : ��ü ����
		// return a-b;

		if(a>b){
			return +1;
		}else if(a<b){
			return -1;
		}else{
			return 0;
		}


	}




}