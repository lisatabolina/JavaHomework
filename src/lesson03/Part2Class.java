package lesson03;

import java.util.Scanner;

public class Part2Class {
    public static void main(String[] args) {

        /* 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99. (использовать инкремент) */

//        for (int i = 1; i < 100; i++) {
//
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }


        /* 2. При помощи цикла for вывести на экран числа от 15 до 1. (использовать декремент) */

//        for (int i = 15; i > 0; i--) {
//            System.out.println(i);
//        }


       /* 3. Напишите программу, где пользователь вводит любое целое положительное число N. Программа
       суммирует все числа от 1 до N. Для ввода числа используйте класс Scanner. */

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter any positive number: ");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= N; i++) {
//            sum += i;
//        }
//        System.out.println(sum);





       /* 4. Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42
        49 56 63 70 77 84 91 98. В решении использовать цикл while */

//        int b = 0;
//
//        while (b < 14) {
//            b++;
//            System.out.print(7 * b + " ");
//        }

//        int i = 7;
//        int k = 1;
//        while (i < 99) {
//            System.out.println(i *k);
//            k++;
//        }



        /* 5. Вывести 10 первых чисел последовательности 0, -5, -10, -15… */


//        for (int i = 0, m = 0; m < 10; m++) {
//            System.out.println(i);
//            i -= 5;
//        }



        /* 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно */


        for (int i = 10; i < 21; i++) {
            System.out.print(i * i + " ");
        }
    }
}
