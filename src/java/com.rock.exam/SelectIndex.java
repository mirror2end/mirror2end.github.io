package com.rock.exam;

import java.util.Scanner;

/**
 * @author Rock
 * @version 1.0
 */
public class SelectIndex {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length ; i++) {
            array[i]=array.length-i;
        }
        System.out.print("输入数字:");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int i=7;
        do {
            if (nextInt>15||nextInt<0){
                System.out.println("无此数");
                break;
            }
            if (nextInt==array[i]){
                System.out.println("第"+(i+1)+"个");
                break;
            }else if (nextInt>array[i]){
                i=i-i/2;
            }else if (nextInt<array[i]){
                i=i+i/2;
            }
        }while (true);

    }
}
