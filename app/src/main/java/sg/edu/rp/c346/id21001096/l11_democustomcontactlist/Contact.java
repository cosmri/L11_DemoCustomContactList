package sg.edu.rp.c346.id21001096.l11_democustomcontactlist;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private int countryCode;
    private int phoneNum;
    private char gender;

    public void setName(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;

    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public char getGender() {
        return gender;
    }

    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }
}
