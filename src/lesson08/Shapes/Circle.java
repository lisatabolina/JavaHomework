package lesson08.Shapes;

/* Класс, описывающий сущность Круг */
public class Circle extends Shape{

    /* Радиус круга */
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    /* Метод для подсчета площади круга*/
    @Override
    public double getArea() {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    /* Метод для подсчета окружности */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * circleRadius;
    }
}
