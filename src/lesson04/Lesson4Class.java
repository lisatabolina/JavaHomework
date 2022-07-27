package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4Class {
    public static void main(String[] args) {
        /* 1. Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
(класс Scanner). */

        int[] arr1 = new int[]{10, 11, 7, 2, 4, 0, 1, 4};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = sc.nextInt();
        int pos = (Arrays.binarySearch(arr1, number));
        if (pos >= 0 && pos <= arr1.length) {
            System.out.println("Число входит в массив");
        } else {
            System.out.println("Число не входит в массив");
        }


    /* 2. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
число задается с консоли (класс Scanner). Если такого числа нет выведите сообщение
об этом. */


        int[] arr21 = new int[]{1, 2, 6, 3, 0, 2};
        System.out.print("Введите целое число: ");
        int num = sc.nextInt();

        Arrays.sort(arr21);
        System.out.println(Arrays.toString(arr21));
        int index = (Arrays.binarySearch(arr21, num));

        if (index >= 0 && index <= arr21.length) {
            for (int i = num; i < arr21.length - 1; i++) {
                arr21[i] = arr21[i + 1];
            }
            int[] arr22 = Arrays.copyOf(arr21, arr21.length - 1);
            System.out.println(Arrays.toString(arr22));
        } else {
            System.out.println("Заданного числа нет в массиве");
        }








    /* 3. Создайте и заполните массив случайными числами и выведите минимальное,
максимальное и среднее значение. Для генерации случайного числа используйте метод
Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
размер массива вводится с консоли. */

        System.out.print("Размер массива: ");
        int length = sc.nextInt();
        int[] arr3 = new int[length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr3));
        int min = arr3[0];
        int max = arr3[0];
        int sum = 0;
        for (int element : arr3) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
            sum += element;
        }
        float average = sum / (float) length;
        System.out.println(min + " - минимальное значение");
        System.out.println(max + " - максимальное значение");
        System.out.println(average + " - среднее значение");





    /* 4. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
из массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны). */

        int[] arr41 = new int[]{0, 4, 12, 3, 7};
        int[] arr42 = new int[]{9, 1, 7, 2, 5};
        System.out.println(Arrays.toString(arr41));
        System.out.println(Arrays.toString(arr42));

        int sum41 = 0;
        for (int element: arr41) {
           sum41 += element;
        }
        float average41 = sum41 / (float) arr41.length;

        int sum42 = 0;
        for (int element: arr42) {
            sum42 += element;
        }
        float average42 = sum42 / (float) arr42.length;

        if (average41 > average42) {
            System.out.println("Среднее арифметическое больше для первого массива");
        }
        if (average41 < average42) {
            System.out.println("Среднее арифметическое больше для второго массива");
        }
        if (average41 == average42) {
        }
    }
}

