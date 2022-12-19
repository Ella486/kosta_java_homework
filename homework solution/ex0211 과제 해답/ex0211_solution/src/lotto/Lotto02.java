package lotto;
/**
 * ¹ÚÈ¿½Â
 * */
import java.util.ArrayList;
import java.util.List;

public class Lotto02 {
static List<Integer> list = new ArrayList<Integer>(6);
	
	static void drawLotto(){
		for(int i=0; i< 6; i++) {
			int j = (int)(Math.random()*45)+1;//5
			
			if(list.indexOf(j) == -1) {
				list.add(j);
			}else {
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		drawLotto();
		list.sort(null);
		System.out.println(list);
	}

}
