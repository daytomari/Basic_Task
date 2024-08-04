package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kadai02 {
    public static void main(String[] args) {

        int choise, point;
        boolean flg;
        String name;

        Map<String, Integer> studentList = new HashMap<>(Map.of(
                "鈴木", 100, "安積", 80, "坂根", 95,
                "高瀬", 90, "北川", 85, "儀間", 75));

        System.out.println("問題2-----------------------------------------------------");

        flg = true;

        while (flg) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("-----------------");
            System.out.println("1.学生を追加");
            System.out.println("2.学生を削除");
            System.out.println("3.点数を更新");
            System.out.println("4.平均点を計算");
            System.out.println("5.全学生の情報を表示");
            System.out.println("6.終了");
            System.out.println("-----------------");


            System.out.print("選択してください：");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1:
                    System.out.print("学生の名前を入力してください：");
                    name = scanner.nextLine();
                    System.out.println(name + "の点数を入力してください:");
                    point = scanner.nextInt();
                    studentList.put(name, point);

                    System.out.println("学生を追加しました。");
                    break;
                case 2:
                    System.out.print("学生の名前を入力してください：");
                    name = scanner.nextLine();
                    studentList.remove(name);

                    System.out.println("学生を削除しました。");
                    break;
                case 3:
                    System.out.println("学生の名前を入力してください：");
                    name = scanner.nextLine();
                    System.out.println(name + "の点数を入力してください:");
                    point = scanner.nextInt();

                    if (studentList.containsKey(name)) {
                        studentList.put(name, point);
                        System.out.println(name + "の点数を更新しました。");
                    } else {
                        System.out.println(name + "は存在しません。");
                    }
                    break;
                case 4:
                    double avg = studentList.values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .average()
                            .getAsDouble();
                    System.out.println("平均点：" + avg + "点");
                    break;
                case 5:
                    System.out.println("学生一覧：");
                    for (Map.Entry<String, Integer> student : studentList.entrySet()) {
                        System.out.println(student.getKey() + "：" + student.getValue() + "点");
                    }
                    break;
                case 6:
                    System.out.println("プログラムを終了します。");
                    flg = false;
                    break;
                default:
                    System.out.println("選択が正しくありません。もう1度入力してください。");
                    break;
            }
        }


    }
}