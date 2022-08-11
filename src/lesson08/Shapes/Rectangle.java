package lesson08.Shapes;

/* Класс, описывающий сущность Прямоугольник */
public class Rectangle extends Shape{

    /* Длина прямоугольника*/
    private double rectangleLength;

    /* Ширина прямоугольника */
    private double rectangleWidth;

    public Rectangle(double rectangleLength, double rectangleWidth) {
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }

    public double getRectangleLength() {
        return rectangleLength;
    }

    public void setRectangleLength(double rectangleLength) {
        this.rectangleLength = rectangleLength;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }

    /* Метод для подсчета площади прямоугольника*/
    @Override
    public double getArea() {
        return rectangleLength * rectangleWidth;
    }

    /* Метод для подсчета периметра прямоугольника*/
    @Override
    public double getPerimeter() {
        return (rectangleLength + rectangleWidth) * 2;
    }
}
