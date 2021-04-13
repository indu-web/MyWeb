package com.test.controller;

import com.test.bean.Address;
import com.test.bean.Person;
import com.test.bean.Company;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @RequestMapping(method = RequestMethod.GET, path = "/addresses", produces = "application/json")
    public Address getAddresses() {
        return new Address("1", "try Dr", "cupertino", "CA");
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addresses", consumes = "application/json")
    public String createAddress(@RequestBody Address address, @RequestParam(name = "msg", required = false) String msg, @RequestParam(name = "msg2") String msg2) {
        System.out.println(address);
        return "Created Successfully with msg2=" + msg2;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/person", produces = "application/json")
    public Person getPerson() {
        Person person = new Person();
        person.setName("Indu");
        person.setAliases(new String[]{"al1", "al2"});
        person.setAddresses(new Address[]{new Address("1", "try Dr", "cupertino", "CA"),
                new Address("2", "test Rd", "cupertino", "CA")});
        return person;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/company", produces = "application/json")
    public Company getCompany() {
        Company company = new Company();
        company.setCompanyName("Oracle");
        company.setCompanyAlias(new String[]{"a11","a22"});
        return company;

    }

}
