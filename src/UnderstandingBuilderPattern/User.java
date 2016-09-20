package UnderstandingBuilderPattern;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final String address;

    private User(UserBuilder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    /**
     * Only getters no Setter to impose immutability in the class
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: "+this.getFirstName()+", "+this.lastName+", "+this.age+", "+this.phoneNumber+", "+this.address;
    }
    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private  int age;
        private  String phoneNumber;
        private  String address;

        /**
         * We want to have firstname and lastname of the user to be a mandatory field here /
         * @param firstName
         * @param lastName
         */
        public UserBuilder(String firstName,String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public UserBuilder age(int age)
        {
            this.age = age;
            return this;
        }
        public UserBuilder phonenumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder address(String address)
        {
            this.address = address;
            return this;
        }
        public User build()
        {
            return new User(this);

        }
    }
}
