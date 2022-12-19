

import java.util.Arrays;



public class Lotto645 {

 

 public static void main(String[] args) {

  int random_integer[] = new int[6];

  int rdm;

  

 for(int i = 0; i < random_integer.length; i++) {

  rdm = (int) (Math.random()*45)+1;

  System.out.print(rdm + "\t");



  random_integer[i] = rdm;

  for (int j = 0; j < i; j++) {

   if (random_integer[i] == random_integer[j]) {

    i--;

    break;

   }

  }

 }



  Arrays.sort(random_integer);

  for (int k = 0; k < random_integer.length; k++) {

   System.out.print("( " + random_integer[k]+ " )");

  

  }

  
 }

}
