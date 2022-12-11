package polymorphism;

public class LearnOverridingChild extends LearnOverridingParent{

    public static void main(String[] args) {
        LearnOverridingChild objc = new LearnOverridingChild();
        objc.doSomething();
    }
    public void doSomething(){
        super.doSomething();
        System.out.println("Child is doing something ..");

    }
}
