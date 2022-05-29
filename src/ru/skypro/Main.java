package ru.skypro;

public class Main {
    public static boolean leapOrNot(int year) {
        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (leap) {
            System.out.println("The year " + year + " is leap");
        }else {
            System.out.println("The year " + year + " is not leap");}
        return leap;
    }
    public static void main(String[] args) {
        System.out.println("Homework 7.1");
        int year = 5100;
        boolean checkYear = leapOrNot(year);
    }}