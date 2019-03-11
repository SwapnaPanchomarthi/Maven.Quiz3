package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
       boolean flag = false;
       Integer[] newArr = new Integer[input.length];
       int j=0;
       for (int i=0;i<input.length;i++) {
           newArr[j]=input[i]*input[i];
           System.out.println(newArr[j]);
           j++;
       }
        Arrays.sort(newArr);
       for(int k=0; k<input.length;k++) {
           if (newArr[k] == squaredValues[k])

               flag = true;
           else flag = false;
       }
           return flag;
    }
}
