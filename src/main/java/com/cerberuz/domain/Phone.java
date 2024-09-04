package com.cerberuz.domain;

public class Phone {
    private String phoneNumber;
    private String ext;
    private String phoneType;

    public Phone() {
    }

    public Phone(String phoneNumber, String ext, String phoneType) {
        this.phoneNumber = phoneNumber;
        this.ext = ext;
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getExt() {
        return ext;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone [phoneNumber=" + phoneNumber + 
                ", ext=" + ext + 
                ", phoneType=" + phoneType + "]";
    }
}
