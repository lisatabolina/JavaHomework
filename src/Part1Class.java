public class Part1Class {
    public static void main(String[] args) {

    /* 1. Написать программу для вывода времени года по номеру месяца.
Должно быть 2 варианта реализации: switch case и if else if */

        // if else if

        int month = 7;
        if (month >= 3 && month < 6) {
            System.out.println("Весна");
        } else if (month >= 6 && month < 9) {
            System.out.println("Лето");
        } else if (month >= 9 && month < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Зима");
        }

        // switch


        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Неверное значение");
        }


    /*2. Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход
    будет выводить сообщение о четности числа.*/


        int a = 12;
        if (a % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

    /* 3. Для числа t (температура на улице)
        Если t > 15 , то вывести «Тепло»
        Если t <= 15 и t > 5 , то вывести «Нормально»
        Если t <= 5 , то вывести «Холодно» */


        int t = 25;

        if (t > 15) {
            System.out.println("Тепло");
        } else if (t <= 5) {
            System.out.println("Холодно");
        } else {
            System.out.println("Нормально");
        }


        /* 4. По введенному (можно задать явно) номеру определить цвет радуги (1 красный, 4 зеленый и т.д.)*/


        int color = 2;

        switch (color) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
            default:
                System.out.println("Неверное значение");
        }

    }
}


