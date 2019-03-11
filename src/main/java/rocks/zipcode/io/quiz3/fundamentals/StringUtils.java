package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb=new StringBuilder(str);

        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==indexToCapitalize)
                c[i] =Character.toUpperCase(c[i]);
        }


        return sb.substring(0).toUpperCase();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        boolean flag = false;
        if(baseString.indexOf(indexOfString)==characterToCheckFor)

            flag=true;
        else  flag =false;
        return flag;
    }

    public static String[] getAllSubStrings(String str) {
        String[] strArr = new String[30];
        int k=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
               System.out.println(str.substring(i, j));
                strArr[k]=str.substring(i, j);
                k++;
            }
        }
        return strArr;
    }

    public static Integer getNumberOfSubStrings(String input){



        return null;
    }
}
