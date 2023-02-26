package com.example.blood_donor_app;

public class SaveDataHelper {

    private String name;
    private String bloodgroup;
    private String district;
    private String phone;

    public SaveDataHelper() {

    }

    public SaveDataHelper(String name, String bloodgroup, String district, String phone) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.district = district;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
