package GenericMethods;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class GenericMethodsDemo {
    public static void main(String[] args) {
       GenericMethods gen = new GenericMethods();
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5,6};
        if(GenericMethods.arrayEquals(nums,nums))
            System.out.println("nums equal nums");
        if(GenericMethods.arrayEquals(nums,nums2))
            System.out.println("nums equal nums2");
    }
}
