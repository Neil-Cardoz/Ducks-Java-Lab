public class DecoyDuck extends Duck
{
    public DecoyDuck(){
        quackBehaviour = new NoQuack(); //Constructor
        flyingBehaviour = new NoFly();
        swimBehaviour = new Sink();
    }
    @Override
    public void display() { // method overriding
        System.out.println("I am Decoy Duck..");
    }
}