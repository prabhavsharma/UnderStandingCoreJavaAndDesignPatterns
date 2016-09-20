package BoundedTypes;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class NumberFnsDemo {
    public static void main(String[] args) {
        NumberFns <Double> numberFns = new NumberFns<Double>(22.9);
        System.out.println("lets see"+ numberFns.fraction() +" "+ numberFns.reciprocal(2.00));
        NumberFns <Integer> integerNumberFns = new NumberFns<Integer>(21);

        if(numberFns.isabsolute(integerNumberFns))
            System.out.println("truly ");
        else
            System.out.println("falsely accused");
    }
}
