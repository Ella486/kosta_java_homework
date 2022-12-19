/**
  본인이름: 이명진
  날짜: 22.1.18
  주제 : 성적구하기
*/
/*
3. 성적프로그램 ver2 만들기
   : 어제 작성한 성적프로그램에서
      1) 국어, 영어, 수학 점수는 45 ~ 100사이의 난수를 발생해서 저장한다.
       2) 등급은 평균이 90이상이면 'A' , 80 ~ 89 사이이면 'B' , 70 ~ 79사이이면 'C' , 60 ~ 69 사이면 'D' , 이외의 평균은 'F' 로 한다 
             : 등급은 if문 과 switch문 2가지 경우를 다 해본다.
			 */





class GradeIf{
	public static void main(String [] args){
			
		  String name = "명진"; 
         int kor=0;
         int eng=0; 
         int math=0;
         int total=0;
         double avg;
         char grade;

		//난수 발생
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

		 // 평균을 소수점 2자리까지 만들자.

		    avg = (int)(avg*100) / 100.0;

			 System.out.println("이름 : " + name 
        	  + "\t/ 국어점수 : " + kor
               + "\t/ 영어점수 : " + eng
               + "\t/ 수학점수 : " + math
               + "\t/ 총점 : " + total
               + "\t/ 평균 : " + avg // 소수점자리 2자리까지만 출력 ex) 86.66
               );
        System.out.println();
		System.out.println("IF문==========");
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
		System.out.println("switch문==========");
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
