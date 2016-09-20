package UnderstandingBuilderPattern;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Prabhav","Sharma").age(25).address("overland").build();
        System.out.println(user1);
    }
}
