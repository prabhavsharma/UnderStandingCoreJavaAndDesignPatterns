/**
 * Created by PS049141 on 9/13/2016.
 */
public class Summation {
    int sum;
    Summation (int num)
    {
        sum = 0;
        for (int i = 0; i<num;i++)
        {
            sum += i;
        }
    }
    // cloning
    Summation (Summation ob)
    {
        sum = ob.sum;
    }
}
