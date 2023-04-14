public class main_duck {
    public static void main(String args[]){
        MallardDuck mallarduck= new MallardDuck();
        mallarduck.display();
        mallarduck.performFly();
        mallarduck.performQuack();
        mallarduck.performSwim();


        RubberDuck rubberDuck= new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        RedheadDuck redheadDuck= new RedheadDuck();
        RedheadDuck.display();
        RedheadDuck.performFly();
        RedheadDuck.performQuack();
        RedheadDuck.performSwim();

        DecoyDuck decoyDuck= new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.performSwim();


    }
}