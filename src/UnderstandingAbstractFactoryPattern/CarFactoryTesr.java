package UnderstandingAbstractFactoryPattern;


/**
 * Created by PS049141 on 9/20/2016.
 */
public class CarFactoryTesr {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.USA));
        System.out.println(CarFactory.buildCar(CarType.SMALL,Location.ASIA));
        System.out.println(CarFactory.buildCar(CarType.SEDAN,Location.DEFAULT));
    }
}
