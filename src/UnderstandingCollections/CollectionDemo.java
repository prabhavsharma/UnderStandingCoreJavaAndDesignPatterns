package UnderstandingCollections;

import java.util.*;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class CollectionDemo {
    public static void main(String[] args) {
/**
 * List as a Collections Interface
 */
        List<String> arraylist = new ArrayList<>();
        List<String> arraylist2 = new ArrayList<>();
        arraylist2.add("h");
        arraylist2.add("a");
        arraylist2.add("v");

        arraylist.add("p");
        arraylist.add("r");
        arraylist.add("a");
        arraylist.add("b");
        arraylist.addAll(arraylist2);
        arraylist.removeAll(arraylist2);
        System.out.println("this is a list "+ arraylist);
/**
 * Linked List As Collections Interface
 */
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(4);
        ll.add(6);
        System.out.println("this is linked list "+ll);


        //Implementing Set

        Set<String> stringSet = new HashSet<>();
        stringSet.add("sikander");
        stringSet.add("sikander");
        stringSet.add("prabhav");
        for(String s : stringSet)
        {
            System.out.println("this is a set , will not take duplicate"+stringSet);
        }

         TreeSet<String> sortedset = new TreeSet<>(stringSet);
        System.out.println(sortedset);


        //Implementing HashMaps, not part o collections framework but are parallel to collections tree

        Map m = new HashMap();
        m.put("me",new Double(1.3));
        //m.put("me",new Double(1.8));
        m.put("you",new Double (2.3));
        m.put("we",new Double(3.23));
        System.out.println("map "+m);

        Set set = m.entrySet();
        System.out.println(set);

        //get an iterator
        Iterator it = set.iterator();

        //iterating over set
        while(it.hasNext())
        {
            Map.Entry my = (Map.Entry)it.next();
            System.out.println(my.getKey()+":");
            System.out.print(my.getValue());
        }

    }
}
