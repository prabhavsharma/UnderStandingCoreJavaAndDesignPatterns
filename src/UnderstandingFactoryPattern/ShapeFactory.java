package UnderstandingFactoryPattern;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
