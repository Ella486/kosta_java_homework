/**
  ������ǰ�� �Ӽ��� �����ϴ� ��ü
*/
class Electronics{
    private int modelNo;
	private String modelName;
	private int modelPrice;
	private String modelDetail;

	//������ 3��
	Electronics(){}

	//�����Ҷ� ����� ������
	Electronics(int modelNo, String modelDetail){
        this.modelNo = modelNo;
		this.modelDetail = modelDetail;
	}

	Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
       this(modelNo, modelDetail);// �����ڱ����� ù��° �ٿ��� �ٸ� ������ ȣ��

	   this.modelName=modelName;
	   this.modelPrice = modelPrice;
	}

	//set , get �ۼ�
	//setXxx() : public ����void , �μ��ʼ�
  public void setModelNo(int modelNo){
        this.modelNo=modelNo;
  }
  public void setModelName(String modelName){
      this.modelName=modelName;
  }
  public void setModelPrice(int modelPrice){
        this.modelPrice=modelPrice;
  }
  public void setModelDetail(String modelDetail){
      this.modelDetail=modelDetail;
  }


  //getXxx() : public �����ʼ�, �μ�����
  public int getModelNo(){
        return modelNo;
  }
  public String getModelName(){
      return modelName;
  }
  public int getModelPrice(){
        return modelPrice;
  }
  public String getModelDetail(){
      return modelDetail;
  }


}