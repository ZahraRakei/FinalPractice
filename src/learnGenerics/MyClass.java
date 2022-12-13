package learnGenerics;

public class MyClass <T>{
    T obj;
    public MyClass(T obj){
        this.obj = obj;
    }

    void printSomething(){
        System.out.println(obj);
    }
}
