package lesson08.Company;

public class Company {
    public static void main(String[] args) {
        Employee director = new Director();
        Employee accountant = new Accountant();
        Employee worker = new Worker();

        Employee[] employees = new Employee[] {director, accountant, worker};

        for (Employee a : employees) {
            a.printJobTitle();
        }
    }
}
