public class Circle implements shape {
        float area, perimeter, rad;

        public Circle(float i) {
            rad = i;
        }

        @Override
        public float calculateShapeArea() {
            area = (float) (Math.PI * Math.pow(rad, 2));
            return (float) area;
        }

        @Override
        public float calculateShapePerimeter() {
            perimeter = (float) (Math.PI + rad);
            return (float) perimeter;
        }

        public String toString() {
            return "Dimension of Circle " + rad + " Area of Shape " + area + " Perimeter of shape " + perimeter;
        }
    }


