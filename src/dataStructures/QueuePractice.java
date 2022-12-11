package dataStructures;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {
        Queue<String> linkedList = new PriorityQueue<>();
        List<String> stringList= new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");

        System.out.println(linkedList.peek());
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.peek());

        Stack s = new Stack();
        s.add(1, "a");
        s.add(2,"b");
        s.add(3, "c");
        s.add(4,"m");

        System.out.println(s.peek());
    }
}
