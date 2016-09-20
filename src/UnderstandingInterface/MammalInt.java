package UnderstandingInterface;

/**
 * Created by PS049141 on 9/13/2016.
 */
public class MammalInt implements Animal {
    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){

        return 4;
    }

    public static void main(String args[]){
       Animal m = new MammalInt();
        m.eat();
        m.travel();
        MammalInt mint = new MammalInt();
        System.out.println( mint.noOfLegs());
    }
}
