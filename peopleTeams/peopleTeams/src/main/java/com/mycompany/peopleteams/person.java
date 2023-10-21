package com.mycompany.peopleteams;

public class person {
    private String firstName;
    private String lastName;
    private String email;

    public person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    
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
