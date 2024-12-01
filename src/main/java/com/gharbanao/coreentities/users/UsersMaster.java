package com.gharbanao.coreentities.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersMaster {
    private String firstName;
    private String lastName;
    private List<String> addresses;
    private String emailId;
    private  String password;
    private List<Integer> billId;
    private ArrayList<Integer> salt;
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

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public List<Integer> getBillId() {
        return billId;
    }

    public void setBillId(List<Integer> billId) {
        this.billId = billId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getSalt() {
        return salt;
    }

    public void setSalt(ArrayList<Integer> salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "UsersMaster{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                ", billId=" + billId +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", salt=" + salt +
                '}';
    }
}
