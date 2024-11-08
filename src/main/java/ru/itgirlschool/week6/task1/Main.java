package ru.itgirlschool.week6.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите температуру целым числом:");
        Scanner inputInt = new Scanner(System.in);
        int t = inputInt.nextInt();
        if (t < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (t >= 0 && t <= 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денёк!");
        }
    }
}