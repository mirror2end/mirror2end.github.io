package com.rock.exam;

import java.sql.Array;

/**
 * @author Rock
 * @version 1.0
 */
public class RowColumnConversion {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j]=j;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print((conversion(ints))[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] conversion(int[][] array){
        int[][] arr = new int[array.length][array[0].length];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                arr[i][j]=array[j][i];
            }
        }
        return arr;
    }
}
