package com.rock.exam;

/**
 * @author Rock
 * @version 1.0
 */
public class TriangleTest {
    public static void main(String[] args) {
        int[][] array=new int[10][10];
        for (int i=0;i< array.length;i++){
            for (int j=0;j<=i;j++){
                if (i==j||j==0){
                    array[i][j]=1;
                }else {
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
            }
        }
for (int i=0;i< array.length;i++){
    for (int j=0;j<=i;j++){
        System.out.print(array[i][j]+"\t");
    }
    System.out.println();
}
    }
}
