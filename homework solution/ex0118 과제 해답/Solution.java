/**
 * 신준석
 * 2022.01.18
 * 성적계산기능 만들기
 */
class Solution {

    public static void main(String[] args) {
        String name ="신준석" ; //지역변수
        int lang, en, math;
        int totalScore;//총점
        double average; //평균
        char score; //등급

        lang = 90;
        en = 90;
        math = 91;

        totalScore = lang + en + math;

        average = totalScore / 3.0;

        score = (average>=90 ) ? 'A' : 'F';

        // output
        System.out.println("[이름] : " + name);
        System.out.println("[국어] : " + lang);
        System.out.println("[영어] : " + en);
        System.out.println("[수학] : " + math);
        System.out.println("[총점] : " + totalScore);
        System.out.println("[평균] : " + average);
        System.out.println("[학점] : " + score);

       // char ch='';
          String s="";
      
    }
}








