package test.exam;

public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	public Audio() {
		
	}
	
	public Audio(int volumn) {
		
	}
	
	public Audio(String code, int cost, int volumn) {
		//super();
		this.setCode(code);
		this.setCost(cost);
		this.volumn = volumn;
		
	}
	
	
	@Override
	public void start() {
		System.out.println(this.getCode()+"의 Audio를 "+volumn+"으로 본다");

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
		
		builder.append(volumn);
		
		builder.append(getCode());
		
		builder.append(getCost());
		
		builder.append(super.toString());
		
		builder.append(getClass());
		
		builder.append(hashCode());
		
		return builder.toString();
	}

}
