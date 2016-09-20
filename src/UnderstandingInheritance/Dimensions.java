package UnderstandingInheritance;

/**
 * Created by PS049141 on 9/13/2016.
 */
public class Dimensions {
    int length;
   int height;
    String name;
    Dimensions()
    {
         length = height =0;
        name = "none";
    }
    Dimensions(int l,int h,String n)
    {
        length =l;
        height = h;
        name = n;
    }
    Dimensions (int x ,String n)
    {
        length = height = x;
        name =n;
    }
Dimensions(Dimensions ob)
{
    length = ob.length;
    height = ob.height;
    name = ob.name;
}
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double Area(){
        System.out.println("Area must be overrriden");
        return 0.0;
    }
}
