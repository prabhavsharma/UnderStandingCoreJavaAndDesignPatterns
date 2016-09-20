/**
 * Created by PS049141 on 9/13/2016.
 */
public class SummationDemo {
    public static void main(String[] args) {
        Summation summation = new Summation(8);
        Summation summation1 = new Summation(summation);
        System.out.println("sum is "+ summation.sum+"copy is "+summation1.sum);
    }
}
