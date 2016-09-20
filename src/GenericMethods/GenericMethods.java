package GenericMethods;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class GenericMethods {

    static <T extends Comparable<T>,V extends T> boolean arrayEquals(T x[],V y[])
    {
        if(x.length != y.length)
            return false;
        for (int i = 0;i<x.length;i++) {
            if (!x[i].equals(y[i]))
                return false;
        }

            return true;
    }
}
