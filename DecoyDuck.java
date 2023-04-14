public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehavior= new MuteQuack();
        flyBehavior = new FlyNoWay();
        swimBehavior= new Float();
    }

    static void display(){
        System.out.println("I am Decoy Duck");
    }
}
