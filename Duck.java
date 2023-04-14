public abstract class Duck {
    public static FlyBehavior flyBehavior;
    public static QuackBehavior quackBehavior;

    public static SwimBehavior swimBehavior;

    //display will be overridden
    static void display() {

    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public  void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehavior sb){
        swimBehavior = sb;
    }
    static void performQuack(){
        quackBehavior.quack();
    }

    static void performFly(){
        flyBehavior.fly();
}
    static void performSwim() {
        swimBehavior.swim();
    }

}
