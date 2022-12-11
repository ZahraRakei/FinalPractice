package polymorphism;

public class LearnOverridingParent {
    public static void main(String[] args) {
        LearnOverridingParent objp = new LearnOverridingParent();
        objp.doSomething();
    }

   // String phrase = "doing something..";

    public void doSomething(){
        System.out.println("Parent is doing something");
    }
}
