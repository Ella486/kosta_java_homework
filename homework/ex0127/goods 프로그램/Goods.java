/**
  �����̸�: �̸���
  ��¥: 22.1.26
  ���� : �迭�ǽ�����(��ǰ ���α׷�)
*/

/**
	��ǰ�� �Ӽ�( ��ǰ�ڵ�, �̸�, ����, ����)�� �����ϴ� ��ü
*/

class Goods{

	private String code;
	private String name;
	private int price;
	private String explain;

	// �Ӽ��� ��ȸ, ������ �� �ִ� �޼ҵ� ����
	//setXxx()
	public void setCode(String code){
		//���: �μ��� ���޵� ������ ���� ��ȿ�� üũ!
		this.code = code;

	}
	public void setName(String name){
		this.name = name;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public void setExplain(String explain){
		this.explain = explain;
	}


	//gerXxx()
	public String getCode(){
		return code;
	}


	public String getName(){
		return name;
	}

	
	public int getPrice(){
		return price;
	}
	
	public String getExplain(){
		return explain;
	}
		
}
