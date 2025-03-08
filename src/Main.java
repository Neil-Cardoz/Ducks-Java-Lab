// Main.java
//Name - Neil Cardoz
//PRN - 23070126079
//Batch - AIML B1

public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        RubberDuck rd = new RubberDuck();
        DecoyDuck dd = new DecoyDuck();
        RedheadDuck rh = new RedheadDuck();

        System.out.println("-----------------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("-----------------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("----------------------------");
        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("----------------------------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        rh.performFly();
        System.out.println("----------------------------");

        System.out.println("---------------------------");



        }
    }
