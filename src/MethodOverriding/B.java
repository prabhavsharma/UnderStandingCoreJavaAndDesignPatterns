package MethodOverriding;

/**
 * Created by PS049141 on 9/13/2016.
 */
public class B extends A {
    B(int in,int jin)
    {
        super(in,jin);
    }
    @Override
    void show()
    {
        super.show();
        System.out.println("values in subclass");
    }
}
