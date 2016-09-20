/**
 * Created by PS049141 on 9/13/2016.
 */
public class Block {
    private int width;
    private int height;
    private int length;
    private int volume;
    Block(int width,int height,int length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    int volume()
    {
        return  volume =width * height * length;
    }
    //check if two objects are of same dimension
    boolean isSame (Block ob)
    {
        if(ob.width==width && ob.length ==length && ob.height == height)
            return true;
        else
            return false;
    }
    //check if two objects have same volume
    boolean isSameVolume(Block ob)
    {
        if (ob.volume == volume)
            return true;
        else
            return false;
    }
}
