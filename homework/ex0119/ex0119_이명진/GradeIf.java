/**
  �����̸�: �̸���
  ��¥: 22.1.18
  ���� : �������ϱ�
*/
/*
3. �������α׷� ver2 �����
   : ���� �ۼ��� �������α׷�����
      1) ����, ����, ���� ������ 45 ~ 100������ ������ �߻��ؼ� �����Ѵ�.
       2) ����� ����� 90�̻��̸� 'A' , 80 ~ 89 �����̸� 'B' , 70 ~ 79�����̸� 'C' , 60 ~ 69 ���̸� 'D' , �̿��� ����� 'F' �� �Ѵ� 
             : ����� if�� �� switch�� 2���� ��츦 �� �غ���.
			 */





class GradeIf{
	public static void main(String [] args){
			
		  String name = "����"; 
         int kor=0;
         int eng=0; 
         int math=0;
         int total=0;
         double avg;
         char grade;

		//���� �߻�
		int score;
		for(int i=0; i<100; i++){
				score = (int)(Math.random()*100);
				if(score>45){
					kor=score;
				}
				score = (int)(Math.random()*100);
				if(score>45){
					eng=score;
				}
				score = (int)(Math.random()*100);
				if(score>45){
					math=score;
				}
		}
         //kor = 100;
        // eng = 70;
         //math = 100;
         total = kor + eng + math;
         avg = total / 3.0;
         
         //grade = (avg>=90) ? 'A':'F';

		 // ����� �Ҽ��� 2�ڸ����� ������.

		    avg = (int)(avg*100) / 100.0;

			 System.out.println("�̸� : " + name 
        	  + "\t/ �������� : " + kor
               + "\t/ �������� : " + eng
               + "\t/ �������� : " + math
               + "\t/ ���� : " + total
               + "\t/ ��� : " + avg // �Ҽ����ڸ� 2�ڸ������� ��� ex) 86.66
               );
        System.out.println();
		System.out.println("IF��==========");
		if(avg>=90){
			System.out.print("A");
		}
		else if(avg>=80){
			System.out.print("B");
		}
		else if(avg>=70){
			System.out.print("C");
		}
		else if(avg>=60){
			System.out.print("D");
		}else{
			System.out.print("F");
		}
		System.out.println();
		System.out.println("switch��==========");
		switch((int)avg/10){ //byte, short, int, string, char
			case 10:
			case 9: System.out.print("A"); break;
			case 8: System.out.print("B"); break;
			case 7: System.out.print("C"); break;
			case 6: System.out.print("D"); break;
			default: System.out.print("F");
		}
		}
	}
