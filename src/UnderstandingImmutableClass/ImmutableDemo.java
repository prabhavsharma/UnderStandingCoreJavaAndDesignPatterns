package UnderstandingImmutableClass;

import java.util.Date;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class ImmutableDemo {

        public static void main(String[] args)
        {
            ImmutableClass im = ImmutableClass.creatInstance(100,"test", new Date());
            System.out.println(im);
            tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getDate());
            System.out.println(im);
        }

        private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
        {
            immutableField1 = 10000;
            immutableField2 = "test changed";
            mutableField.setDate(10);
        }
    }

