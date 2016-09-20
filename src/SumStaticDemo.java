/**
 * Created by PS049141 on 9/13/2016.
 */
public class SumStaticDemo {
    public static void main(String[] args) {
        SumStatic sd = new SumStatic();
        SumStatic sd1 = new SumStatic();
        sd.x = 10;
        sd1.x =20;
        SumStatic.Y = 20;
        System.out.println("sum for first "+ sd.sum());
        System.out.println("sum for first "+ sd1.sum());

    }
}
