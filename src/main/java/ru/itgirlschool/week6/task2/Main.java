package ru.itgirlschool.week6.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        System.out.println(n % 2 == 0 ? "Число является чётным" : "Число является нечётным");
    }
}