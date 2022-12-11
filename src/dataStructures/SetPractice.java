package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {

        Set<Object> mySet = new HashSet<Object>();
        mySet.add(8);
        mySet.add(1);
        mySet.add("Mary");
        mySet.add(true);
        mySet.add(12.37465);
        mySet.add(null);


        System.out.println(mySet.hashCode());
        System.out.println(mySet);


    }
}
