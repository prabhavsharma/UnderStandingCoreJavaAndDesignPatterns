/**
 * Created by PS049141 on 9/12/2016.
 */
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(5,74,6);
        int minivanRange;
        double avg = minivan.fuelNeeded(20);
        minivanRange = minivan.range();
        System.out.println("this is minivanRange"+minivanRange+"  "+avg);

    }
}
