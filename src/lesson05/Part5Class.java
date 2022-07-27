package lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class Part5Class {
    public static void main(String[] args) {


        /* 1. Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему
массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли. */

        System.out.println("Task #1");

        int[][][] arr1 = {{{7, 4}, {5, 4}}, {{1, 6}, {2, 3}}};

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr1[i][j].length; k++) {
                    arr1[i][j][k] += number;

                }
            }
        }
        System.out.print(Arrays.deepToString(arr1) + "\n");


        /* 2. Шахматная доска. Создайте программу для раскраски шахматной доски с помощью
цикла. Использовать двумерный массив String размером 8х8. С помощью циклов задать
элементам значения B (Black) или W (White). */


        System.out.println("----------------------------------------------");
        System.out.println("Task #2");

        String[][] arr2 = new String[8][8];

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    arr2[i][j] = "B";
                } else {
                    arr2[i][j] = "W";
                }
            }
        }
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println(Arrays.toString(arr2[1]));
        System.out.println(Arrays.toString(arr2[2]));
        System.out.println(Arrays.toString(arr2[3]));
        System.out.println(Arrays.toString(arr2[4]));
        System.out.println(Arrays.toString(arr2[5]));
        System.out.println(Arrays.toString(arr2[6]));
        System.out.println(Arrays.toString(arr2[7]));
    }
}