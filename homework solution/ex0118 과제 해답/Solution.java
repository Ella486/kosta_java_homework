/**
 * ���ؼ�
 * 2022.01.18
 * ��������� �����
 */
class Solution {

    public static void main(String[] args) {
        String name ="���ؼ�" ; //��������
        int lang, en, math;
        int totalScore;//����
        double average; //���
        char score; //���

        lang = 90;
        en = 90;
        math = 91;

        totalScore = lang + en + math;

        average = totalScore / 3.0;

        score = (average>=90 ) ? 'A' : 'F';

        // output
        System.out.println("[�̸�] : " + name);
        System.out.println("[����] : " + lang);
        System.out.println("[����] : " + en);
        System.out.println("[����] : " + math);
        System.out.println("[����] : " + totalScore);
        System.out.println("[���] : " + average);
        System.out.println("[����] : " + score);

       // char ch='';
          String s="";
      
    }
}








