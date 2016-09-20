package UnderstandingGenerics;

/**
 * Created by PS049141 on 9/16/2016.
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer,String> iob = new Gen<Integer,String>(55,"here");
        //int i = iob.getOb();
        iob.showType();



    }
}
