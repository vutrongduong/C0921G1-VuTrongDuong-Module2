package ss21_design_pattens.bai_tap.ap_dung_factory_method;

public class ShapeFactory {
    private ShapeFactory() {
    }

    public static Shape getShape(String nhap) {
        switch (nhap) {
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                throw new RuntimeException("Không có hình này");
        }
    }
}
