package com.yechao.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        // 猜数字游戏
        // 1.随机生成一个幸运号码
        Random r = new Random();
        int luckNumber = r.nextInt(100)+1;// 生成一个1-100的随机幸运数
        // 2.使用一个死循环让用户不断去猜测
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 让用户输入数据进行猜测
            System.out.println("请输入一个猜测的数据（1-100）：");
            int guessNumber = sc.nextInt();
            // 3.定义一个if判断猜测数据与幸运数字的大小关系
            if(guessNumber > luckNumber){
                System.out.println("你猜测的数据过大，请下一个人猜测：");
            }else if(guessNumber < luckNumber) {
                System.out.println("你猜测的数据过小，请下一个人猜测：");
            }else {
                System.out.println("恭喜你！猜中了！可以去买单了~~");
                break;// 猜中数据，跳出循环
            }
        }
    }
}
