public class Rectangle implements shape{
    float area,perimeter,length,breadth;
    public Rectangle(float i, int i1) {
        length =i;
        breadth =i1;
    }
    @Override
    public float calculateShapeArea() {
        area=(float)(length*breadth);
        return (float) area;
    }
    @Override
    public float calculateShapePerimeter() {
        perimeter=(float)(2+(length*breadth));
        return (float) perimeter;
    }
    public String toString(){
        return "Dimension of Rectangle "+length+" "+breadth+" Area of Shape "+area+" Perimeter of shape "+perimeter;
    }
}
