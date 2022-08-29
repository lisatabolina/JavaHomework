package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part2 {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Lisa");
        studentList.add("Alexander");
        studentList.add("Denis");
        studentList.add("Denis");
        studentList.add("Nadya");
        studentList.add("Artem");
        studentList.add("Vladislav");
        studentList.add("Ekaterina");
        studentList.add("Ivan");
        studentList.add("Eugene");


        System.out.println("Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв): ");
        long myNameCount = studentList.stream().filter("liSA"::equalsIgnoreCase).count();
        System.out.println(myNameCount);

        System.out.println("Выбрать все имена, начинающиеся на \"а\" (вне зависимости от верхнего/нижнего регистра букв)");

        List<String> startsWithAList = studentList.stream()
                .filter(str -> (str.charAt(0) == 'A' || str.charAt(0) == 'a'))
                .collect(Collectors.toList());

        System.out.println(startsWithAList);


        System.out.println("Отсортировать и вернуть первый элемент коллекции или \"Empty\", если коллекция пуста: ");
        String firstName = studentList.stream().sorted().findFirst().orElse("Empty");
        System.out.println(firstName);


    }
}
