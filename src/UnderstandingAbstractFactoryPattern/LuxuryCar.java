package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class LuxuryCar extends Car{
public LuxuryCar(Location location)
{
    super(CarType.LUXURY,location);
    construct();
}

    @Override
    protected void construct() {
        System.out.println("building luxury");
    }
}
