package sms.model;

import sms.services.fileHandler;
import sms.services.persistenceHandler;

public class Employer {
    private String name;
    private String cnic;
    private String phone;
    private String age;
    private String address;
    private String accountID;
    public persistenceHandler ph = new fileHandler();

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean addEmployer(Employer user,Account acc1) {
        Boolean status = ph.saveEmployer(user,acc1);
        return status;
    }
}