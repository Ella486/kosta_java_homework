package ex0217.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Weight02 {
	
	
	public Weight02(){ //생성자
	
		BufferedReader br = null;
		
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("이름 > ");
			
			String name = br.readLine();
			String data = getDirectory()+ getFile();	
					
			System.out.println("fileName: " + name + ".txt");
			
			
			System.out.println("****" + name + ".txt 파일의 정보 확인********");
			
										
				
				
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
			new Weight02();
		

	}

}
