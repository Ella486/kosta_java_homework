package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01 {
	List<Integer> lotto = new ArrayList<>(6); //�ߺ������ϴ�!!
	
	public void makeLottoNum() {
		int num;
		
		while(lotto.size() < 6) {
			num = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		System.out.println("������ : " + lotto );
		
		//lotto.sort(null); //�ø�����
		//lotto.sort(Collections.reverseOrder()); //��������
	
		//Collections.sort(lotto); //�ø�����
		Collections.sort(lotto , Collections.reverseOrder()); 
		
		
		System.out.println("������ : " + lotto );
	}
	
	

	public static void main(String[] args) {
		Lotto01 l = new Lotto01();

		l.makeLottoNum();
		
	}

}
