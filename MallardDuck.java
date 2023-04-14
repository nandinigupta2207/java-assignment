public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior= new Quack();
        flyBehavior = new FlyWithWings();
        swimBehavior= new swim();
    }

    static void display(){
        System.out.println("I am Mallard Duck");
    }
}
