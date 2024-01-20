public class Customer {
    //instance variables
    private String id;
    private String firstName;
    private String lastName;

    //Customer constructor
    public Customer(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //method for get id
    public String getId(){
        return this.id;
    }

    //method for get first name
    public String getFirstName(){
        return this.firstName;
    }

    //method for get last name
    public String getLastName(){
        return this.lastName;
    }
}
