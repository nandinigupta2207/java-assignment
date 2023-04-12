public class Square implements shape{
    float area,perimeter,side;
    public Square(float i) {
        side=i;
    }
    @Override
    public float calculateShapeArea() {
        area=(float)(side*side);
        return (float) area;
    }
    @Override
    public float calculateShapePerimeter() {
        perimeter=(float)(4*side);
        return (float) perimeter;
    }
    public String toString(){
        return "Dimension of Square "+side+" Area of Shape "+area+" Perimeter of shape "+perimeter;
    }
}
