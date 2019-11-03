package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int choose;
        double value;
        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Mời bạn chọn: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Exit!!");
                    break;
                case 1:
                    System.out.print("Nhập vào độ F: ");
                    value = scanner.nextDouble();
                    System.out.println("Kết quả = " + toC(value));
                    break;
                case 2:
                    System.out.print("Nhập vào độ F: ");
                    value = scanner.nextDouble();
                    System.out.println("Kết quả = " + toF(value));
                    break;
            }
        } while (choose != 0);
    }
    public static double toC(double F) {
        double cel = (5.0 / 9) * (F - 32);
        return cel;
    }
    public static double toF(double C) {
        double fah = (9.0 / 5) * C + 32;
        return fah;
    }
}
