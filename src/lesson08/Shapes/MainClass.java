package lesson08.Shapes;

public class MainClass {
    public static void main(String[] args) {
        Shape triangle1 = new Triangle(10, 15, 7);
        Shape rectangle1 = new Rectangle(18.4, 10);
        Shape circle1 = new Circle(5.5);
        Shape rectangle2 = new Rectangle(2, 4);
        Shape circle2 = new Circle(16);

        System.out.println("Площадь круга 1: " + circle1.getArea());
        System.out.println("Периметр треугольника 1: " + triangle1.getPerimeter());

        Shape[] shapes = {triangle1, rectangle1, circle1, rectangle2, circle2};

        double sum = 0;
        for (Shape element : shapes) {
            sum += element.getPerimeter();
        }

        System.out.println("Сумма периметра всех фигур в массиве: " + sum);

    }
}
