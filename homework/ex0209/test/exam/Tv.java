package test.exam;

public class Tv extends Elec implements ElecFunction {
	
	private int chnnel;
	
	public Tv() {
		
	}

	
	public Tv(int chnnel) {
		
		
	}


	public Tv(String code, int cost, int chnnel) {
		//super();
		this.setCode(code);
		this.setCost(cost);
		this.chnnel = chnnel;
	}

	@Override
	public void start() {
		System.out.println(this.getCode()+"제품 TV를 "+chnnel+"을 본다");

	}

	@Override
	public void stop() {
		

	}

	@Override
	public void display() {
		

	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(chnnel);
		
		builder.append(getCode());
		
		builder.append(getCost());
		
		builder.append(super.toString());
		
		builder.append(getClass());
		
		builder.append(hashCode());
		
		return builder.toString();
	}

}
