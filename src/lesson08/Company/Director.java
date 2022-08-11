package lesson08.Company;

public class Director implements Employee{
    @Override
    public void printJobTitle() {
        System.out.println("Директор");
    }
}
