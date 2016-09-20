package UnderstandingInheritance;

/**
 * Created by PS049141 on 9/13/2016.
 */
public class Triangle extends Dimensions {
    Triangle()
    {
        super();
    }
   Triangle(int len ,int height,String name)
   {
       super(len,height,name);
   }
   Triangle(int x,String name)
   {
       super(x,name);
   }
   Triangle(Triangle ob)
   {
       super(ob);
   }
   @Override
      double Area()
      {
         return (getLength()*getHeight()/2);
      }
}
