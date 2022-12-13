package learnGenerics;

public class MainDriver {

    public static void main(String[] args) {
        String name = "Mary";
        MyClass<String> obj = new MyClass<>(name);
    }
}
