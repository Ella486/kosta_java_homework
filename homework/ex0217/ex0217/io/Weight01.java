package ex0217.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Weight01 {
	
	
	public Weight01(){ //생성자
	
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
				System.out.println("이름 > ");
				String name = br.readLine();
				
				System.out.println("몸무게 : 비밀번호 > ");
				String wp = br.readLine();
						
				System.out.println("이름 > " + name );
				System.out.println("몸무게 : 비밀번호 > " + wp);
				
					
			FileWriter fw = new FileWriter( name +".txt");
			bw = new BufferedWriter(fw);
			
			bw.write(wp);
			bw.newLine();
			bw.flush();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
			new Weight01();
		

	}

}
