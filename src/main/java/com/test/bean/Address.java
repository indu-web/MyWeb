package com.test.bean;

public class Address {
    private String aptNo;
    private String street;
    private String city;
    private String state;

    public Address(String aptNo, String street, String city, String state){
        this.aptNo=aptNo;
        this.city=city;
        this.state=state;
        this.street=street;
    }
    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String toString(){
        StringBuilder sb= new StringBuilder("Address : ");
        sb.append("AptNo:").append(aptNo).append(", Street:").append(street);
        return sb.toString();
    }
}
