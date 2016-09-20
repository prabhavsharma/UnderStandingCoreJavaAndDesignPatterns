package UnderstandingGenerics;

/**
 * Created by PS049141 on 9/16/2016.
 */
public class Gen<T,V> {
    T ob;
    V vob;

    Gen(T o, V vo) {
        ob = o;
        vob = vo;
    }


    void showType(){
        System.out.println(ob.getClass()+"this is now here " + vob.getClass());
    }

}
