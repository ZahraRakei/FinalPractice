package polymorphism;

public class MainDriver {

    public static void main(String[] args) {
        LearnOverridingParent obj = new LearnOverridingChild();

        obj.doSomething();
    }

    public void dosomething(){
        System.out.println("the child method is doing something");
    }

}
