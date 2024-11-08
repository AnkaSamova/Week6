package ru.itgirlschool.week6.task4;

public class Main {
    public static void main(String[] args) {
        int y = 0;
        while (y < 10) {
            int x = (int) Math.pow(2, y);
            y++;
            System.out.print(x + " ");
        }

        System.out.println();
        int z = 0;
        do {
            int w = (int) Math.pow(2, z);
            z++;
            System.out.print(w + " ");
        } while (z < 10);
    }
}