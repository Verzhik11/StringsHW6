import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.print("ФИО сотрудника — " + fullName);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void checkYear(int whatIsYear) {
        if (whatIsYear % 4 == 0 && whatIsYear % 100 != 0 || whatIsYear % 400 == 0) {
            System.out.println(whatIsYear + " год является високосным");
        } else {
            System.out.println(whatIsYear + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Методы. Задача 1");
        int year = 1905;
        checkYear(year);
    }

    public static void checkPhone(int deviceYear, int OS) {
        int currentYear = LocalDate.now().getYear();
        if (OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task5() {
        System.out.println("Методы. Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2024;
        checkPhone(clientDeviceYear, clientOS);
    }
    public static void printResult(int result) {
        if (result == 1) {
            System.out.println("Для доставки до 20 км потребуются " + result + " сутки");
        } else if (result ==2) {
            System.out.println("Для доставки от 20 км до 60 км потребуются " + result + " суток");
        } else if (result == 3) {
            System.out.println("Для доставки от 60 км до 100 км потребуются " + result + " суток");
        }
    }

    public static int daysDelivery (int distance) {
        int daysDelivery = 0;
        if (distance <= 20) {
            daysDelivery = daysDelivery + 1;
        } else if (distance > 20 && distance < 60) {
            daysDelivery = daysDelivery + 2;
        } else if (distance > 60 && distance < 100) {
            daysDelivery = daysDelivery + 3;
        }

        return daysDelivery;

        }


    public static void task6() {
        System.out.println("Методы. Задача 3");
        int deliveryDistance = 80;
        if (deliveryDistance > 100) {
            System.out.println("При расстоянии от 100 км доставка не осуществляется");
            daysDelivery(deliveryDistance);

        }
        printResult(daysDelivery(deliveryDistance));

    }
}

