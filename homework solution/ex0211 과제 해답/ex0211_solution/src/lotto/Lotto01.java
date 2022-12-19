package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01 {
	List<Integer> lotto = new ArrayList<>(6); //중복가능하다!!
	
	public void makeLottoNum() {
		int num;
		
		while(lotto.size() < 6) {
			num = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		System.out.println("정렬전 : " + lotto );
		
		//lotto.sort(null); //올림차순
		//lotto.sort(Collections.reverseOrder()); //내림차순
	
		//Collections.sort(lotto); //올림차순
		Collections.sort(lotto , Collections.reverseOrder()); 
		
		
		System.out.println("정렬후 : " + lotto );
	}
	
	

	public static void main(String[] args) {
		Lotto01 l = new Lotto01();

		l.makeLottoNum();
		
	}

}
