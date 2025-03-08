public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flyingBehaviour = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

}
