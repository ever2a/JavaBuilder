package com.cerberuz;

import java.util.ArrayList;
import java.util.List;

import com.cerberuz.domain.Address;
import com.cerberuz.domain.Contacto;
import com.cerberuz.domain.Phone;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contacto> contacts;

    public Employee() {
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phones, List<Contacto> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }

    @SuppressWarnings("rawtypes")
    public static class EmployeeBuilder implements Ibuilder {

        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contacto> contacts = new ArrayList<>();

        public EmployeeBuilder() {}

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setAddress(String address, String city, String country, String cp) {
            this.address = new Address(address, city, country, cp);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone) {
            this.phones.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String phoneNumber, String ext, String phoneType) {
            this.phones.add(new Phone(phoneNumber, ext, phoneType));
            return this;
        }

        public EmployeeBuilder setContact(Contacto contact) {
            this.contacts.add(contact);
            return this;
        }

        public EmployeeBuilder setContact(String name, Phone phone, Address address) {
            this.contacts.add(new Contacto(name, phone, address));
            return this;
        }

        @Override
        public Employee build() {
            return new Employee(age, name, gender, address, phones, contacts);
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public List<Contacto> getContacts() {
        return contacts;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void setContacts(List<Contacto> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee [\n age=" + age + 
                ",\n name=" + name + 
                ",\n gender=" + gender + 
                ",\n address=" + address + 
                ",\n phones=" + phones + 
                ",\n contacts=" + contacts + "]";
    }

    
}
