package lesson08.Shapes;

/* Класс, описывающий сущность Треугольник */
public class Triangle extends Shape{

    /* Длина первой стороны */
    private double sideA;

    /* Длина второй стороны */
    private double sideB;

    /* Длина третьей стороны */
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    /* Метод для подсчета площади треугольника по формуле Герона */
    @Override
    public double getArea() {
        double p = 0.5 * getPerimeter();
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    /* Метод для подсчета периметра треугольника */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
