package dataStructures;

import java.util.Stack;

public class stackPractice {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        myStack.add(5);
        myStack.add(6);

//        System.out.println(myStack.peek());
//        myStack.pop();
//        System.out.println(myStack.peek());

        System.out.println("PEEK: " + myStack.peek());
        System.out.println("INDEX AT: " + myStack.elementAt(4));
        System.out.println("POP");
        myStack.pop();
        System.out.println("PEEK: "+ myStack.peek());
    }
}
