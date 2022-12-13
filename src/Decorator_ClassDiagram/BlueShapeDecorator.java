package Decorator_ClassDiagram;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setBlueBorder();
    }

    private void setBlueBorder(){
        System.out.println("Blue Border");
    }
}
