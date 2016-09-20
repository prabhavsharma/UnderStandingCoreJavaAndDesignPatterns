package GenericConstructor;

import BoundedTypes.NumberFns;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class Summation {
    int sum;

    <T extends Number> Summation(T arg)
    {
        sum = 0;
        for (int i = 0;i<=arg.intValue();i++)
        {
            sum +=i;
        }

    }
    int getSum()
    {
        return sum;
    }
}
