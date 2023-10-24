package com.mycompany.peopleteams;

/**
 *
 * @author taciana albertina amorim de oliveira
 */

public class person {
    
    //instance variables for 'firstName', 'lastName', and 'email'.
    private String firstName;
    private String lastName;
    private String email;

    // Constructor of the 'person' class that takes three parameters to initialize the instance variables.
    public person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    // Public method 'getPerson' that returns a formatted representation of the person's data.
    public String getPerson() {
        
        String all = "First Name: " + this.firstName + "\n" + 
                     "Last Name: " + this.lastName + "\n" + 
                     "E-mail: " + this.email;
      return all;
    }
    
    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    
    public void changeEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return this.firstName;
    }
}
