//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Условные операторы 2");

        // Task 1
        System.out.println("Задача 1");
        int clientOS = 1;  // 0 для iOS, 1 для Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        // Task 2
        System.out.println("Задача 2");
        // int clientOS = 0
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        // Task 3
        System.out.println("Задача 3");
        int year = 2021;
        if (year <= 1584) {
            System.out.println(year + " год не является високосным, так как год должен быть больше 1584");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Task 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days;
        if (deliveryDistance > 100) {
        System.out.println("Доставка не осуществляется");
        } else {
            if (deliveryDistance <= 20) {
        days = 1;
        } else if (deliveryDistance <= 60) {
        days = 2;
        } else {
        days = 3;
        }
        System.out.println("Потребуется дней: " + days);}

        // Task 5
        System.out.println("Задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
           case 12:
           case 1:
           case 2:
        System.out.println("Зима");
           break;
           case 3:
           case 4:
           case 5:
         System.out.println("Весна");
           break;
           case 6:
           case 7:
           case 8:
         System.out.println("Лето");
           break;
           case 9:
           case 10:
           case 11:
          System.out.println("Осень");
           break;
           default:
          System.out.println("Неверный месяц");
           break;
        }

    }
}