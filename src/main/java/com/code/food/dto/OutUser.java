package com.code.food.dto;

public class OutUser {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String referralSource;

    public OutUser(Long id, String name, String email, String phone, String referralSource) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.referralSource = referralSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReferralSource() {
        return referralSource;
    }

    public void setReferralSource(String referralSource) {
        this.referralSource = referralSource;
    }
}
