/**
  �����̸�: �̸���
  ��¥: 22.1.18
  ���� : �������ϱ�
*/
class Test{

     public static void main(String [] args){

         String name = "���� "; 
         int kor;
         int eng; 
         int math;
         int total;
         double avg;
         char grade;

         kor = 90;
         eng = 70;
         math = 100;
         total = kor + eng + math;
         avg = total / 3.0;
         
         grade = (avg>=90) ? 'A':'F';

		 // ����� �Ҽ��� 2�ڸ����� ������.

		    avg = (int)(avg*100) / 100.0;
        
         System.out.println("�̸� : " + name 
        	  + "\t/ �������� : " + kor
               + "\t/ �������� : " + eng
               + "\t/ �������� : " + math
               + "\t/ ���� : " + total
               + "\t/ ��� : " + avg // �Ҽ����ڸ� 2�ڸ������� ��� ex) 86.66
               + "\t/ ���� : " + grade);


		
                  
       }

}