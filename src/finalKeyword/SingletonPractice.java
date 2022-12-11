package finalKeyword;

public class SingletonPractice {

    private static SingletonPractice obj;

    private SingletonPractice(){

    }

    public static SingletonPractice getInstanse(){
         return obj;
    }
}
