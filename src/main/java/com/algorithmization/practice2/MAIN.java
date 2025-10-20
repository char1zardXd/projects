package com.algorithmization.practice2;

import java.util.Scanner;

public class MAIN {
    static void main(String[] args) {
        System.out.println("byte:");
        System.out.println("Размер: " + Byte.SIZE + " бит");
        System.out.println("Минимальное значение: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение: "+ Byte.MAX_VALUE);
        System.out.println();

        System.out.println("short:");
        System.out.println("Размер: " + Short.SIZE + " бит");
        System.out.println("Минимальное значение: " + Short.MIN_VALUE);
        System.out.println("Максимальное значение: "+ Short.MAX_VALUE);
        System.out.println();

        System.out.println("int:");
        System.out.println("Размер: " + Integer.SIZE + " бит");
        System.out.println("Минимальное значение: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение: "+ Integer.MAX_VALUE);
        System.out.println();

        System.out.println("long:");
        System.out.println("Размер: " + Long.SIZE + " бит");
        System.out.println("Минимальное значение: " + Long.MIN_VALUE);
        System.out.println("Максимальное значение: "+ Long.MAX_VALUE);
        System.out.println();

        System.out.println("float:");
        System.out.println("Размер: " + Float.SIZE + " бит");
        System.out.println("Минимальное значение: " + Float.MIN_VALUE);
        System.out.println("Максимальное значение: "+ Float.MAX_VALUE);
        System.out.println();

        System.out.println("double:");
        System.out.println("Размер: " + Double.SIZE + " бит");
        System.out.println("Минимальное значение: " + Double.MIN_VALUE);
        System.out.println("Максимальное значение: "+ Double.MAX_VALUE);
        System.out.println();

        System.out.println("char:");
        System.out.println("Размер: " + Character.SIZE + " бит");
        System.out.println("Минимальное значение: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальное значение: "+ (int) Character.MAX_VALUE);
        System.out.println();

        System.out.println("boolean:");
        System.out.println("Размер: 1-2 бит");
        System.out.println("Значення: FALSE или TRUE");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        int ValueToInt = Integer.parseInt(input);
        System.out.println("int = " + ValueToInt);
        System.out.println();

        System.out.print("Введите byte: ");
        String input_byte = sc.nextLine();
        byte byteValue = Byte.parseByte(input_byte);
        System.out.println("byte = " + byteValue);
        System.out.println();

        System.out.print("Введите short: ");
        String input_short = sc.nextLine();
        short shortValue = Short.parseShort(input_short);
        System.out.println("short = " + shortValue);
        System.out.println();

        System.out.print("Введите int: ");
        String input_int = sc.nextLine();
        int intValue = Integer.parseInt(input_int);
        System.out.println("int = " + intValue);
        System.out.println();

        System.out.print("Введите long: ");
        String input_long = sc.nextLine();
        long longValue = Long.parseLong(input_long);
        System.out.println("long = " + longValue);
        System.out.println();

        System.out.print("Введите float: ");
        String input_float = sc.nextLine();
        float floatValue = Float.parseFloat(input_float);
        System.out.println("float = " + floatValue);
        System.out.println();

        System.out.print("Введите double: ");
        String input_double = sc.nextLine();
        double doubleValue = Double.parseDouble(input_double);
        System.out.println("double = " + doubleValue);

        sc.close();
    }
}
