package UnderstandingInheritance;

/**
 * Created by PS049141 on 9/13/2016.
 */
public class DimensionsDemo {
    public static void main(String[] args) {
        Dimensions dimin[] = new Dimensions[4];
        dimin[0] = new Triangle(2,4,"this is with height and length");
        dimin[1] = new Dimensions();
        dimin[2] = new Dimensions(2,"single");
        dimin[3] = new Triangle(5,"singlr triangle");
        for(int i =0;i<dimin.length;i++)
        {
            System.out.println("obj is "+dimin[i].getName());
            System.out.println("area is"+dimin[i].Area());
            System.out.println();
        }
    }



}
