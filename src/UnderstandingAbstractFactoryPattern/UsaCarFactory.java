package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class UsaCarFactory {
    public static Car buildCar(CarType model){
        Car car = null;
        switch(model)
        {
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            case SMALL:
                car = new SmallCar(Location.USA);
                break;
            case SEDAN:
                car = new SedanCar(Location.USA);
                break;
            default:
                System.out.println("you can posssibly throw exception here ");
                break;
        }
        return car;
    }
}
