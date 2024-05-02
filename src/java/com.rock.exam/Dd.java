package com.rock.exam;

import java.util.Scanner;

/**
 * @author Yan
 * @version 1.0
 * @date 2024/4/28
 */
public class Dd {
    public static void main(String[] args) {
        // n 身上的钱 x 饮料价格 y个空瓶子可以兑换
        int n, x, y;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        x=scanner.nextInt();
        y=scanner.nextInt();
        // i 喝下的饮料
        // j 空瓶子
        int i = 0, j = 0;
        while (n > x) {
            n -= x;
            i++;
            j++;
            if (j == (y-1)) {
                i++;
                j = 0;
            }
        }
        System.out.println(i);
    }
}
