package com.rock.exam;

/**
 * @author Rock
 * @version 1.0
 */
public class SelectTest {
    public static void main(String[] args) {
        int temp;
        int[] array={5,9,7,3,2,5,4,9,8,1};

        for (int i=0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }

        }
        for (int num: array) {
            System.out.print(num);
        }
    }
}
