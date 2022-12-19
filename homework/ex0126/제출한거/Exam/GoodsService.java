/**
  �����̸�: �̸���
  ��¥: 22.1.26
  ���� : �迭�ǽ�����(��ǰ ���α׷�)
*/


/**
	��ǰ�� ���� CRUD �۾�: B/L
	   : ��ü�˻�, ���, ����, ����......

  */

class GoodsService {

	private Goods [] goodsArr = new Goods [10];
	static int count; // �迭�� Goods�� ����� ������ üũ!!!

	/**
		�ʱ�ġ �����͸� �����ϴ� �޼ҵ� �ۼ�
		String [] [] data = new String [][]{
			{"A1", "�����", "2500", "¥�� ������"}, //-----> Goods�� ��ü�� ���
			{"A2", "��Ĩ", "1500", "����ϴ�"},
			{"A3", "��Ϲ���Ĩ", "3500", "�ް� ¥�� ������"},
			{"A4", "���ڱ�", "1800", "������ ��"},
			{"A5", "������", "3000", "������ ��"},

		};


	*/
	public void init(String [][] data){

		//goodsArr[0] = new Goods();
		//goodsArr[0].setcode();
		for (int i=0; i<data.length ; i++){ //data.length�� ���� ����
			goodsArr[i] = this.create(data[i]);
			GoodsService.count ++;
		}

	}

	/**
		Goods�� �����ؼ� �������ִ� �޼ҵ� �ۼ�
	*/
	private Goods create(String [] row){//{"A1", "�����", "2500", "¥�� ������"}
		Goods goods = new Goods();
		goods.setCode(row[0]);
		goods.setName(row[1]);
		goods.setPrice(Integer.parseInt(row[2]));
		goods.setExplain(row[3]);

		return goods;

	}

	/**
	   ����ϱ�
		:������� ��ǰ�ڵ尡 �ߺ������� üũ�ؼ� �ߺ��� �ƴ� �� ����Ѵ�.

		@return : int�� (0�̸� ��ǰ�ڵ��ߺ�, 
						1�̸� ��� ����, 
						-1�̸� �迭�� ���̸� ����� ����� �ȵ�)
	*/
	public int insert( Goods goods){// String code, String name, int price, String explain ()�ȿ� �� �μ��� but, Goods Ÿ�� �μ�
		if (goodsArr.length == GoodsService.count){
				return -1;
			
		}
		//�ߺ�üũ
		if (this.selectByCode(goods.getCode()) != null){
				return 0;

		}
		
		//�ߺ� �ƴϸ� ���
		goodsArr[GoodsService.count] = goods;
		GoodsService.count ++;

		return 1;

	}

	/**
	   ��ü�˻�
	   @return : Goods Ÿ���� �迭(�迭�̸� �ϳ��� �������� ��ǰ�� ��Ƽ� ����)

	*/
	public Goods[] selectAll(){

			return goodsArr;

	}


	/**
	   ��ǰ�ڵ忡 �ش��ϴ� ��ǰ�˻�
	   return : ���� �μ��� ���޵� code�� �ش��ϴ� ������ ������ Goods�� �����ϰ�
				������ null�� �����Ѵ�.
	*/
	public Goods selectByCode(String code){
		//System.out.print("�Է����ڵ�� - " + code);
		//System.out.print("--goods 0 -- " + goodsArr[].getCode() );
		for(int i=0; i<count; i++){
			//System.out.println("-i-:"+ i + goodsArr[i].getCode());
			if(goodsArr[i].getCode().equals(code)){
				return goodsArr[i];
			}
		}
		return null;

	}

	/**
	   ��ǰ�ڵ忡 �ش��ϴ� ��ǰ����, ���� �����ϱ�
		return : boolean���� ������ �Ϸ�Ǹ� true, �ƴϸ� false
	*/
	public boolean update(Goods goods){// ��ǰ�ڵ�, ����, ����
			if(goods != null){
				return true;
			}else{
				return false;
			}
		

	}


}//Ŭ���� ��
