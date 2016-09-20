package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class DefaultCarFactory {
    public static Car buildCar(CarType model){
        Car car = null;
        switch(model)
        {
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            case SMALL:
                car = new SmallCar(Location.DEFAULT);
                break;
            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;
            default:
                System.out.println("you can posssibly throw exception here ");
                break;
        }
        return car;
    }
}
