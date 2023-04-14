public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior= new Squeak();
        flyBehavior = new FlyNoWay();
        swimBehavior= new Float();
    }

    static void display(){
        System.out.println("I am Rubber Duck");
    }
}
