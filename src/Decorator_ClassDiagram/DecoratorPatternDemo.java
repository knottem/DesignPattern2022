package Decorator_ClassDiagram;

public class DecoratorPatternDemo {


    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape circle1 = new RedShapeDecorator(new Circle());
        Shape circle2 = new BlueShapeDecorator(new Circle());

        rectangle.draw();
        circle.draw();
        circle1.draw();
        circle2.draw();

    }
}
