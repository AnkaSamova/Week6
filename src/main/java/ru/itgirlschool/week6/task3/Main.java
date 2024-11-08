package ru.itgirlschool.week6.task3;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek i = DayOfWeek.FRIDAY;
        switch (i) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Будний день");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Выходной день");
                break;
        }
    }
}