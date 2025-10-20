package com.algorithmization.practice3;

import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int intValue = sc.nextInt();

        System.out.println("Введите число c плвующей точкой: ");
        double doubleValue = sc.nextDouble();
        sc.nextLine();

        System.out.println("Введите строку: ");
        String strValue = sc.nextLine();

        System.out.println("Введите логическое значение: ");
        boolean booleanValue = sc.nextBoolean();

        System.out.println("1) int: " + intValue + ", double: " + doubleValue + ", string: " + strValue + ", boolean: " + booleanValue);

        System.out.printf("2) int = %d, double = %.2f, string = %s, boolean = %b%n", intValue, doubleValue, strValue, booleanValue);

        System.out.printf("3) Шестнадцатеричное число: %x%n", intValue);

        System.out.printf("5) Восьмерочное число: %o%n", intValue);

        System.out.printf("5) double в научном формате: %.2e%n", doubleValue);

        System.out.printf("6) %-10d - выравнивание по левому краю%n", intValue);

        System.out.printf("7) %010d - выравнивание по правому краю%n", intValue);

        System.out.printf("8) 5 знаков после точки: %.5f%n", doubleValue);

        String template = "9) int = {0}, double = {1}, string = {2}, boolean = {3}";
        String message = MessageFormat.format(template, intValue, doubleValue, strValue, booleanValue);
        System.out.println(message);

        System.out.printf("10) |%5d|%10.2f|%10s|%5b|%n", intValue, doubleValue, strValue, booleanValue);

        sc.close();
    }
}
