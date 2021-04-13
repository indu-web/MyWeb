package com.test.bean;

public class Company {

    private String companyName;
    String[] companyAlias;
    Address[] addresses;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }


    public String[] getCompanyAlias() {
        return companyAlias;
    }

    public void setCompanyAlias(String[] companyAlias) {
        this.companyAlias = companyAlias;
    }

}
