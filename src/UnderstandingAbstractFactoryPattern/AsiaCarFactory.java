package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class AsiaCarFactory {
    public static Car buildCar(CarType model){
        Car car = null;
        switch(model)
        {
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            case SMALL:
                car = new SmallCar(Location.ASIA);
                break;
            case SEDAN:
                car = new SedanCar(Location.ASIA);
                break;
            default:
                System.out.println("you can posssibly throw exception here ");
                break;
        }
        return car;
    }
}
