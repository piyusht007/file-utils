package com.piyush.org.consumer;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "employee")
@XmlType(propOrder={"name", "age", "designation", "address"})
public class Employee {
    private String name;
    private Integer age;
    private String designation;
    private Address address;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                '}';
    }
}
