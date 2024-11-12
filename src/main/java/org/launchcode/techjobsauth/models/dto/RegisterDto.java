package org.launchcode.techjobsauth.models.dto;


public class RegisterDto extends LoginDto{

    private String verifyPassword;

    public RegisterDto() {
        super();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }



}
