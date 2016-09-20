package BoundedTypes;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class NumberFns<T extends Number> {
   // T ob;
    Number num;
   NumberFns(T o)
  {
       num =o;
    }
double reciprocal(double value)
{
    num = value;
    return 1/value;
}
//why are you getting null pointer
//double fraction(double val)
//{
//    val = num.doubleValue() - num.intValue();
//    return  val;
//
//}
double fraction()
{
    return num.doubleValue() - num.intValue();


}
boolean isabsolute(NumberFns<?> nams)
{
    if(Math.abs(num.doubleValue())== Math.abs(nams.num.doubleValue()))
        return true;

    return false;
}

}
