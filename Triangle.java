public class Triangle implements shape{
    float area,perimeter,side1,side2,side3;
    public Triangle(float i,float j) {
        side1=i;
        side2=j;
        side3=(float)(Math.hypot(side1,side2));
    }
    @Override
    public float calculateShapeArea() {
        area=(float)(0.5*side1*side2);
        return (float) area;
    }
    @Override
    public float calculateShapePerimeter() {
        perimeter=(float)(side1+side2+side3);
        return (float) perimeter;
    }
    public String toString() {
        return "Dimension of Triangle " + side1 + " " + side2 + " " + side3 + " Area of Shape "+area+" Perimeter of shape "+perimeter;
    }
}
