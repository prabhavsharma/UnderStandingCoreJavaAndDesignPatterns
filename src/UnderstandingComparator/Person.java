package UnderstandingComparator;

import java.util.Comparator;

/**
 * A class explaining use of Comparator , By sorting the list in order of their age
 * Created by PS049141 on 9/20/2016.
 */
public class Person implements /*Comparator<Person>*/Comparable<Person>{
     private String name;
      private int age;

    /**
     * Default Constructor
     */
    Person()
    {

    }
    Person(String name,int age)
    {
        this.name = name ;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
// You can pass this as a annonymous inner class in implementaion
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.age - o2.age;
//    }
}
