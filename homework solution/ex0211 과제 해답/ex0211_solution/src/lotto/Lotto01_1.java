package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01_1  extends ArrayList<Integer>{
	public Lotto01_1() {
		super(6);
	}
	
	public void makeLottoNum() {
		int num;
		
		while(size() < 6) {
			num = (int)(Math.random() * 45) + 1;
			if(!this.contains(num)) {
				super.add(num);
			}
		}
		
		System.out.println("정렬전 : " + this );
		
		//this.sort(null); //올림차순
		//this.sort(Collections.reverseOrder()); //내림차순
	
		//Collections.sort(this); //올림차순
		Collections.sort(this , Collections.reverseOrder()); 
		
		
		System.out.println("정렬후 : " + this );
	}
	
	

	public static void main(String[] args) {
		Lotto01_1 l = new Lotto01_1();

		l.makeLottoNum();
		
	}

}
