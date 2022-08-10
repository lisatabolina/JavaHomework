package lesson07;

import java.util.Scanner;

public class Phone {
    private long number;
    private String model;
    private int weight;



    public Phone (long number, String model, int weight) {
        this(model, weight);
        this.number = number;
    }

    public Phone (String model, int weight) {
        this.model = model;
        this.weight = weight;
    }


    public Phone(){
    }


    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, long callerNumber) {
        return "Звонит " + name + ", номер " + callerNumber;
    }

    public void sendMessage(int ...numbers) {
        for (int i = 0; i < numbers.length; i++)
        System.out.println(numbers[i]);
    }
}
