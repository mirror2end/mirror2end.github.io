package com.rock.exam;

import java.util.Scanner;

/**
 * @author Rock
 * @version 1.0
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("输入数字:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(determinePrime(num));
    }
    static boolean determinePrime(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
