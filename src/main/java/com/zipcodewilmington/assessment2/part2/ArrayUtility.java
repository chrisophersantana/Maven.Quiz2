package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {


        int[] array1and2 = new int[array1.length + array2.length];
        StringBuilder sb = new StringBuilder();
        sb.append(array1and2);



        return null;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        return null;
    }

    public Integer mostCommon(Integer[] array) {
        int count = 1, tempCount;
        Integer popular = array[0];
        Integer temp = 0;
        for (int i = 0; i < (array.length - 1); i++)
        {
            temp =array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;



    }
}
