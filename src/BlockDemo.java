/**
 * Created by PS049141 on 9/13/2016.
 */
public class BlockDemo {
    public static void main(String[] args) {
        Block block = new Block(5,6,4);
       // block.voulume(120);
        System.out.println("volume"+ block.volume());
        Block block1 = new Block(5,6,4);
        System.out.println("returning "+block1.isSame(block)+"also volume is "+ block1.isSameVolume(block));
    }
}
