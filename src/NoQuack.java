public class NoQuack implements QuackBehaviour
{
    @Override
    public void quack() { // method overriding
        System.out.println("I can't Quack !!");
    }
}