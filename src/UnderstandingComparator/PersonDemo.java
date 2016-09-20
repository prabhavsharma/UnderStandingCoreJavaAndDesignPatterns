package UnderstandingComparator;

import java.util.*;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class PersonDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("prabhav",25));
        persons.add(new Person("shar",24));
        persons.add(new Person("rac",23));
        persons.add(new Person("amo",26));
        persons.add(new Person("osh",1));
        persons.add(new Person("vri",100));
        // sorting the list
        Collections.sort(persons);
        // Printing out sorted list of names of person
        for(Person s : persons)
            System.out.println(s.getName()+" ");

// Another way of Implementation
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //Now objective here is to get list of nam based on age
        //Collections.sort(persons,new Person());
        System.out.println(" ");

        for(Person a: persons)   // printing the sorted list of ages
            System.out.print(a.getName() +"  : "+ a.getAge() + ", ");
    }


    }

