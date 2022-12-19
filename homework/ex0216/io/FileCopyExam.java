package step07.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopyExam {

	public FileCopyExam(String readFname, String writeFname) {
		//readFname�� �ִ� ������ �о writerFname�� ���� - ���� ����
			File readfile = new File(readFname);
			File writefile = new File(writeFname);
			//byte������ ���� �б�!
			FileInputStream fis=null;
				
			//byte������ ���� ����!
			FileOutputStream fos =null;
			try {
				//����
				fis = new FileInputStream(readfile);
					
					int byteSize = fis.available();
										
					byte b [] = new byte[byteSize];
					fis.read(b);
					
					//byte�迭�� ---> ���ڿ��� ����!
					String data = new String(b);
					System.out.println(data);
		///////////////////////////////////////////////src/step07/io/test.txt
					//���� ����
					fos = new FileOutputStream(writefile);
					//writefile.createNewFile();
					fos.write(b);
					
					System.out.println(readfile+" �� ������");
					System.out.println(writefile + " �� �����߽��ϴ�");
					
					
				}catch(IOException e) {
					e.printStackTrace();
				}finally {
					//�ݱ�
					try {
						if(fis != null)fis.close();
						if(fos != null)fos.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
		
	}//FileCopyExam ��
	
	
	public static void main(String[] args) {
		String readFname = JOptionPane.showInputDialog("�������ϸ�?"); // src/step07/io/test.txt
		System.out.println("readFname: " + readFname);
		String writeFname = JOptionPane.showInputDialog("���������ϸ�?"); //src/step07/io/test01.txt
		System.out.println("writeFname: " + writeFname);
		
		new FileCopyExam(readFname,writeFname);
	}//���γ�

}//Ŭ���� ��
