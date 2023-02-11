package com.sotk.stayoutthekitchen.Entity;



import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {



    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int custId;

    private String email;
    private String firstName;
    private String lastName;
    private String birthday;


    public Customer() {

    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthDate) {
        this.birthday = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer Received!\n" +
                "==================\n" +
                "firstName='" + firstName + "'\n" +
                "lastName='" + lastName + "'\n" +
                "birthDate='" + birthday + "'\n" +
                "email='" + email + "'\n";
    }
}
