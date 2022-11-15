package main;

import java.io.Serializable;

public class Bank implements Serializable{
    private static final long serialVersionUID = 1234567L;
    private String ifscCode;
    private String bankName;
    private String city;

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Bank() {
    }

    public Bank(String ifscCode, String bankName, String city) {
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "ifscCode='" + ifscCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
