/**
 * Created by PS049141 on 9/13/2016.
 */
public class ErrorMessages {
    String msgs [] = {"Output Error", "Input Error", "Error which is bad"};
    int how_bad [] ={1,3,3};
    Err getErrormsg(int i )
    {
        if(i>=0&i<msgs.length)
            return new Err(msgs[i],how_bad[i]);
        else
            return new Err("error not found",0);
    }


}
