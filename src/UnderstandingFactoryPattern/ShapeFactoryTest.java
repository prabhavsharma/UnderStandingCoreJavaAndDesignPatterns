package UnderstandingFactoryPattern;

/**
 * Created by PS049141 on 9/20/2016.
 */
public class ShapeFactoryTest {
    public static void main(String[] args) {
        /*
        Here we call circle as Implementation call
         */
        Shape shapeOfCircle = new Circle();
        shapeOfCircle.draw();
        Shape shapeOfRectangle = new Rectangle();
        shapeOfRectangle.draw();
       /*
        here is the change in Approach. By creating shapeFactory  type object we actually hide what shape we are calling.
        */
        ShapeFactory shapeFactory = new ShapeFactory();
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

    }
}
