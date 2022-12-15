package Factory_Pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE);
        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGLE);
        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQUARE);


        shape1.draw();
        shape2.draw();
        shape3.draw();


    }
}
