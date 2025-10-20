package com.algorithmization.practice4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // задание 1, вариант 3

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую дату (день, месяц, год): ");

        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        System.out.println("Введите вторую дату (день, месяц, год): ");

        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();

        if (year1 < year2) {
            System.out.println("Первая дата РАНЬШЕ второй");
        } else if (year1 > year2) {
            System.out.println("Первая дата ПОЗЖЕ второй");
        } else {
            if (month1 < month2) {
                System.out.println("Первая дата РАНЬШЕ второй");
            } else if (month1 > month2) {
                System.out.println("Первая дата ПОЗЖЕ первой");
            } else {
                if (day1 < day2) {
                    System.out.println("Первая дата РАНЬШЕ второй");
                } else if (day1 > day2) {
                    System.out.println("Первая дата ПОЗЖЕ второй");
                } else {
                    System.out.println("Даты одниковые");
                }
            }
        }

        // задание 2, вариант 3

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();

        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("НСД: " + a);

        // задание 3, вариант 4

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.println("-----------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
        }
        System.out.println();
    }
}