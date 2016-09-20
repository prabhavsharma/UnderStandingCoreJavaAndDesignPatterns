package UnderstandingAbstractFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public abstract class Car {
    public Car(CarType model,Location location)
    {
        this.model = model;
        this.location = location;
    }
    protected abstract void construct();

    private CarType model = null;
    private Location location = null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return model +" "+location;
    }
}
