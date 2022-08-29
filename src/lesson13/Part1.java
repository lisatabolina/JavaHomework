package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Part1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        System.out.println(arrayList);

        System.out.println("Удалить дубликаты: ");
        List<Integer> uniqueArrayList = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueArrayList);

        System.out.println("Вывести все четные элементы в диапазоне от 7 до 17 (включительно): ");
        List<Integer> ArrayList2 = arrayList.stream()
                .filter(s -> s >= 7 && s <= 17 && s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(ArrayList2);

        System.out.println("Каждый элемент умножить на 2");

        List<Integer> arrayListx2 = arrayList.stream()
                .map(s -> s * 2)
                .collect(Collectors.toList());
        System.out.println(arrayListx2);

        System.out.println("Отсортировать и вывести на экран первых 4 элемента");
        List<Integer> sortedArrayList = arrayList.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(sortedArrayList);

        System.out.println("Вывести количество элементов в стриме");

        System.out.println(arrayList.stream().count());

        System.out.println("Вывести среднее арифметическое всех чисел в стриме");

        System.out.println(arrayList.stream().mapToInt(s -> s).average().getAsDouble());

    }
}
