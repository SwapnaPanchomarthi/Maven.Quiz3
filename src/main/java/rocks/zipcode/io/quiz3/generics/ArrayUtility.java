package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {

        this.array = array;
    }

    public SomeType findOddOccurringValue() {


       Integer arr[] = Arrays.copyOf(array, array.length, Integer[].class);

        Integer count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
                count=count+1;
        }
        return (SomeType)count;
    }

    public SomeType findEvenOccurringValue() {
        Integer count =0;
        Integer[] newArr = Arrays.copyOf(array, array.length, Integer[].class);
        for(int i=0;i<array.length;i++)
        {
            if(newArr[i]%2==0)
                count++;
        }
        return (SomeType)count;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count =0;
        Integer[] newArr = Arrays.copyOf(array, array.length, Integer[].class);
        for(int i=0;i<array.length;i++)
        {
            if(newArr[i]==valueToEvaluate)
                count++;
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

   

        return null;
    }
}