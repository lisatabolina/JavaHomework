package lesson07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(555566710, "Samsung", 1006);
        Phone phone2 = new Phone(599222688, "Apple", 910);
        Phone phone3 = new Phone(100135582, "Xiaomi", 1007);

        Phone[] phones = {phone1, phone2, phone3};

        for (Phone phone : phones) {
            System.out.println("Номер: " + phone.getNumber() + "\nМодель: " + phone.getModel() + "\nВес: " + phone.getWeight());
        }

        for (Phone phone : phones) {
            System.out.println(phone.receiveCall("Аня"));
        }

        for (Phone phone: phones) {
            System.out.println(phone.getNumber());
        }

        System.out.println(phone1.receiveCall("Катя", 5556622));

        phone2.sendMessage(4446, 678888, 2222222,2222456);
    }
}
