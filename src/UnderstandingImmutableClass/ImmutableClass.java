package UnderstandingImmutableClass;

/**
 * Created by PS049141 on 9/19/2016.
 */


import java.util.Date;

/**
 * Always remember that your instance variables will be either mutable or immutable.
 * Identify them and return new objects with copied content for all mutable objects.
 * Immutable variables can be returned safely without extra effort.
 * */
public class ImmutableClass {

private final  Integer immutableField1 ;
    private final String immutableField2;
    private final Date  mutableField;

    /**
     * private constructor
     * @param fld1
     * @param fld2
     * @param date
     */
    private ImmutableClass(Integer fld1, String fld2, Date date)
    {
        this.immutableField1 = fld1;
        this.immutableField2 = fld2;
        this.mutableField = new Date(date.getTime());
    }
/**
 * No setter methods to have immutability
 */
//factory method to have object creation at one place
    public static ImmutableClass creatInstance(Integer fld1, String fld2, Date date){
        return new ImmutableClass(fld1,fld2,date);
    }
/**
 * Integer class is Immutable so instance variable can be returned as it is
 */
public Integer getImmutableField1()
{
    return immutableField1;
}
/**
 * String class is also  immutable class so I can return the instance variable as it is
 */
public String getImmutableField2()
{
    return immutableField2;
}
/**
 * Date class is a mutable class so we have to be careful we will copy the vvalue into a new instance variable and return that
 */
public Date getDate()
{
    return new Date(mutableField.getTime());
}
public String toString()
{
    return immutableField1+""+immutableField2+""+mutableField;
}
}
