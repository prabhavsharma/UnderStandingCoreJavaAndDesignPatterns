package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class SmallCar extends Car {
    public SmallCar(Location location)
    {
        super(CarType.SEDAN,location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("building Small");
    }
}
