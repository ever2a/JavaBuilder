package com.cerberuz.domain;

public class Contacto {
    private String name;
    private Phone phone;
    private Address address;

    public Contacto() {
    }

    public Contacto(String name, Phone phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contacto [name=" + name + ", phone=" + phone + ", address=" + address + "]";
    }

}
