/**
 * Created by PS049141 on 9/13/2016.
 */
public class ErrorMessagesDemo {
    public static void main(String[] args) {
        ErrorMessages err = new ErrorMessages();
        Err e;
        e = err.getErrormsg(2);
        System.out.println(e.msg +e.severity);

    }
}
