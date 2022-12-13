package Singleton_ClassDiagram;

public class SinglePatternDemo {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        object.showMessage();
        object2.showMessage();
    }
}
