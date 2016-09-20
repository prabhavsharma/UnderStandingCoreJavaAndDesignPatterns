package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class CarFactory {
    private CarFactory(){
        //Preventing Intialization here .
    }


    public static Car buildCar(CarType type,Location location)
    {
        Car car = null;
        // You can intialise location here or pass it as parameter
        // location = Location.ASIA; //Read location property somewhere from configuration
        //Use location specific car factory
        switch(location)
        {
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }
        return car;
    }
}
