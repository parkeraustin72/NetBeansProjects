
package com.mycompany.chapter7.pp73;


public class Address {
    private String streetAddress, city, state;
    private long zipcode;

    public Address(String streetAddress, String city, String state, long zipcode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() { // Returns this address object as a string
        return "Address{" + "streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }
    
    
    
}
