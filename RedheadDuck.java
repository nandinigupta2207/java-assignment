public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quackBehavior= new Quack();
        flyBehavior = new FlyWithWings();
        swimBehavior= new swim();
    }
    static void display(){
        System.out.println("I am Redhead Duck");
    }
}
