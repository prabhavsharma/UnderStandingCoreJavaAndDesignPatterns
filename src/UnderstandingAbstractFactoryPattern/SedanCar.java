package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class SedanCar extends Car  {
    public SedanCar(Location location)
    {
        super(CarType.SEDAN,location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("building Sedan");
    }
}
