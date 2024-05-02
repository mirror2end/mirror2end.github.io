package com.rock.exam;

import java.util.Scanner;

/**
 * @author Rock
 * @version 1.0
 */
public class PublicNum {
    public static void main(String[] args) {
        System.out.print("输入数字:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("最大公约数:"+commonDivisor(num1,num2));
        System.out.println("最大公倍数:"+commonMultiples(num1,num2));

    }
    static int commonDivisor(int num1,int num2){
        if (num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        for (int i=num1;i>0;i--){
            if (num1%i==0&&num2%i==0){
                return i;
            }
        }
        return 0;
    }
    static int commonMultiples(int num1,int num2){
        if (num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        for (int i=1;i<=num1;i++){
            if (num2%num1==0){
                return num2;
            } else if ((num2*i)%num1==0) {
                return num2*i;
            }
        }
        return 0;
    }
}
