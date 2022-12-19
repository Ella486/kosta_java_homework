/**
  본인이름: 이명진
  날짜: 22.1.20
  주제 : 성적프로그램Ver5 
*/


class GradeVer5 {

	/**1)국어, 영어, 수학 점수를 인수받아 총점을 구하여
      총점을 리턴하는 메소드 작성
      (접근제한자 private)*/

	private int gradeVer4_01(int kor, int eng, int math){//80, 90, 100
		
		int sum = kor + eng + math;
		
		System.out.println("점수의 총합: " + sum);

		return sum;

	}

	/**2) 총점과 과목수(int) 를 인수로받아 평균을 구하여
      평균을 리턴하는 메소드 작성 
      (접근제한자 private)*/

	private double gradeVer4_02(int sum, int i){//i과 과목수
		// 평균을 구해서 소숫점자리 2자리까지......

		double avg = (int) ((sum / 3.0) * 100) / 100.0;   // double result  = sum / (double)i ;
														  //  result = (int)(result*100)/100.0;

		System.out.println("평균: " + avg);

		return avg;                                       // return result;

	}

	/**3) 평균을 인수로 받아 등급을 구하여 등급을 리턴해주는
       메소드 작성한다(접근제한자 private)*/

	private char gradeVer4_03(double avg){

		char grade;

                if (avg >= 90) grade = 'A';
                else if (avg >= 80) grade = 'B';
                else if (avg >= 70) grade = 'C';
                else if (avg >= 60) grade = 'D';
                else grade = 'F';

		System.out.println("등급: " + grade);

		return grade;


	}
	
	/*4) 이름, 국어, 영어, 수학 점수를 인수로 받아
      총점 , 평균 ,등급 을 구하여 그 결과를 화면에 출력하는
      메소드를 선언하세요.
      (접근제한자 public,
       총점과 평균 , 등급은 이미 만들어진 1) , 2) ,3) 메소드를 호출
       하여 그 결과를 통해 얻어온다)*/

	public static void main(String[] args) {

		GradeVer5 ue = new GradeVer5();
		System.out.println("ue: " + ue);

		int sum = ue.gradeVer4_01(80,90,100);
		System.out.println("총합: " + sum);

		double avg = ue.gradeVer4_02(270,3);
		System.out.println("평균: " + avg);

		char grade = ue.gradeVer4_03(90);
		System.out.println("등급: " + grade);

	}

}




