package org.example;

import java.util.Scanner;

public class Kadai03 {
    public static void main(String[] args) {
        String phone;

        System.out.println("問題3-----------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("携帯電話番号を入力してください：");
        phone = scanner.nextLine();

        if (phone.matches("^(080|090|070)-\\d{4}-\\d{4}")) {
            System.out.println(phone + "は有効な携帯電話番号です。");
        } else {
            System.out.println(phone + "は無効な形態電話番号です。");
        }


    }
}