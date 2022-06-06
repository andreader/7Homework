package ru.skypro;

public class Main {
    public static void leapOrNot(int year) {
        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (leap) {
            System.out.println("The year " + year + " is leap");
        }else {
            System.out.println("The year " + year + " is not leap");}
        }

        public static void clientOs(int clientDeviceYear, int Os) {
        boolean ios = Os == 0;
        boolean android = Os == 1;
        boolean old = clientDeviceYear < 2015;
        boolean oldIos = old && ios;
        boolean oldAndroid = old && android;
        if (oldIos) {
            System.out.println("Install the light version of the app for IOS. Here is the link..");
        } else if (ios) {
            System.out.println("Install the app for IOS. Here is the link..");
        }
        if (oldAndroid) {
            System.out.println("Install the light version of the app for Android. Here is the link..");
        } else if (android) {
            System.out.println("Install the app for Android. Here is the link..");
    }}
    public static void deliveryTime (int deliveryDistance) {
    boolean zone1 = (deliveryDistance < 20);
    boolean zone2 = (deliveryDistance >= 20 && deliveryDistance < 60);
    boolean zone3 = (deliveryDistance >= 60 && deliveryDistance < 100);
        if (zone1) {
        System.out.println("It takes 1 day" + " (delivery time)");
    }
        if (zone2) {
        System.out.println("It takes 2 days" + " (delivery time)");
    }
        if (zone3) {
            System.out.println("It takes 3 days" + " (delivery time)");
        }}
    public static void duplicateChecking (String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                throw new RuntimeException("Tha character " + "'" + str.charAt(i) + "'" + " is duplicate!");
    }}}
    public static void main(String[] args) {
        System.out.println("Homework 7.1");
        int year = 5100;
        leapOrNot(year);

        System.out.println("Homework 7.2");
        int clientDeviceYear = 2014;
        int OS = 1;
        clientOs(clientDeviceYear, OS);

        System.out.println("Homework 7.3");
        int deliveryDistance = 1;
        deliveryTime (deliveryDistance);

        System.out.println("Homework 7.4");
        String str = new String("aabccddefgghiijjkk");
        duplicateChecking(str);
            }}

