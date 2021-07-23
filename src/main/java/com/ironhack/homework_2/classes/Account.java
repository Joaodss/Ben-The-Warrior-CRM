package com.ironhack.homework_2.classes;
import com.ironhack.homework_2.enums.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Account {
    private UUID id;
    private Industry industry;
    private int employeeCount;
    private String city;
    private String country;
    private ArrayList<Contact> contactList;
    private ArrayList<Opportunity> opportunityList;

    public Account(Industry industry, int employeeCount, String city, String country, Contact contact, Opportunity opportunity){
        setId(UUID.randomUUID());
        setIndustry(industry);
        setEmployeeCount(employeeCount);
        setCity(city);
        setCountry(country);
        contactList = new ArrayList<Contact>();
        contactList.add(contact);
        opportunityList = new ArrayList<Opportunity>();
        opportunityList.add(opportunity);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }


    public ArrayList<Opportunity> getOpportunityList() {
        return opportunityList;
    }

}
