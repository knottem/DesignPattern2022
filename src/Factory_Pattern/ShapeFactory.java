package Factory_Pattern;

public class ShapeFactory {

    public Shape getShape(ShapeEnum shape){

        return switch (shape) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
        };
    }
}
