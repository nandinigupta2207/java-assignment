public class main_shape {
    public static void main(String[] args) {
//Circle c = new Circle(5);
        Circle c = new Circle(5);
        c.calculateShapeArea();
        c.calculateShapePerimeter();
        System.out.println(c);
        Square s = new Square(5);
        s.calculateShapeArea();
        s.calculateShapePerimeter();
        System.out.println(s);
        Rectangle r = new Rectangle(5, 7);
        r.calculateShapeArea();
        r.calculateShapePerimeter();
        System.out.println(r);
        Triangle t = new Triangle(3, 4);
        t.calculateShapeArea();
        t.calculateShapePerimeter();
    }
}
