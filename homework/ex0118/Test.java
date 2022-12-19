/**
  본인이름: 이명진
  날짜: 22.1.18
  주제 : 성적구하기
*/
class Test{

     public static void main(String [] args){

         String name = "명진 "; 
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

		 // 평균을 소수점 2자리까지 만들자.

		    avg = (int)(avg*100) / 100.0;
        
         System.out.println("이름 : " + name 
        	  + "\t/ 국어점수 : " + kor
               + "\t/ 영어점수 : " + eng
               + "\t/ 수학점수 : " + math
               + "\t/ 총점 : " + total
               + "\t/ 평균 : " + avg // 소수점자리 2자리까지만 출력 ex) 86.66
               + "\t/ 학점 : " + grade);


		
                  
       }

}