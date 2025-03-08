abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyingBehaviour flyingBehaviour;

    public void setQuackBehaviour(QuackBehaviour behaviour) {
        this.quackBehaviour = behaviour;
    }

    public void setSwimBehaviour(SwimBehaviour behaviour) {
        this.swimBehaviour = behaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour behaviour) {
        this.flyingBehaviour = behaviour;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }
    public void performFly() {
        flyingBehaviour.fly();
    }

    abstract public void display();


}
