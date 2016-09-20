/**
 * Created by PS049141 on 9/12/2016.
 */
public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    Vehicle(int p,int fuelcap,int m)
    {
        passengers = p;
        this.fuelcap = fuelcap;
        mpg = m;

    }
    double fuelNeeded (int miles)
    {
        return (double) miles/mpg;
    }
    int range (){
        return fuelcap * mpg;
    }
}
