package org.example;

import java.util.Scanner;

public class Kadai01 {
    public static void main(String[] args) {
        int num1, num2, answer;
        char opd;

        System.out.println("問題1-----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("1番目の数字を入力してください：");
        num1 = scanner.nextInt();

        System.out.print("演算子を入力してください:");
        opd = scanner.next().charAt(0);

        System.out.print("2番目の数字を入力してください：");
        num2 = scanner.nextInt();

        answer = 0;
        switch (opd) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                if (num2 == 0)
                    System.out.println("0で割り算はできません");
                else
                    answer = num1 / num2;
                break;
            default:
                System.out.println("演算子に誤りがあります。");
                break;

        }
        System.out.println("---------------------------------------------------------");
        System.out.println("演算結果：" + num1 + " " + opd + " " + num2 + " = " + answer);

    }
}