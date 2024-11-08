package ru.itgirlschool.week6.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        int res = 1;
        for (int f = 1; f <= n; f++) {
            res *= f;
        }
        System.out.println(n + "! = " + res);
    }
}