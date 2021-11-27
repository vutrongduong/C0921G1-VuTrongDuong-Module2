package ss21_design_pattens.bai_tap.ap_dung_factory_method;

public class
FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("Rectangle");
        shape.draw();
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("Square");
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape("demo");
        shape3.draw();

    }
}
