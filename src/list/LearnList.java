package list;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String[] args) {
        List myList = new ArrayList();

        myList.add(0,"Sabreen");
        myList.add(1,"Mary");
        myList.add(2,"Rahman");
      // myList.add(8, "Iman");
        System.out.println(myList.size());
       // myList.get(3);
        System.out.println(myList.get(0));
        System.out.println(myList.indexOf("Rahman"));
       myList.add(3,"Mahla");
        List<String> subList = myList.subList(0,2);
        System.out.println(subList.get(0));

    }
}
