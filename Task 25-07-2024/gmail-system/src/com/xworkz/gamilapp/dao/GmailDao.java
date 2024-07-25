package com.xworkz.gamilapp.dao;

import com.xworkz.gamilapp.dto.GmailDto;

public class GmailDao {

    GmailDto dto;

    public boolean createNewAccount(GmailDto dto){
        System.out.println("Create New Account Started");
            boolean isAccountCreated=false;
            if (null != dto){
                this.dto = dto;
                isAccountCreated = true;
            }else{
                System.out.println("Please provide Valid Data");
            }
        System.out.println("Create New Account Ended");
    return isAccountCreated;
    }

    public void getInfo(){
        System.out.println("Get Information started");
        System.out.println("FULL NAME = "+ dto.name);
        System.out.println("LAST NAME = "+ dto.lastName);
        System.out.println("GENDER = "+ dto.gender);
        System.out.println("DATE OF BIRTH = "+ dto.dob);
        System.out.println("ENTER PHONE NUMBER = "+ dto.phoneNo);
        System.out.println("CREATE PASSWORD = "+ dto.ctrPassword);
        System.out.println("CONFORM PASSWORD = "+ dto.confPassword);
        System.out.println("Get Information Ended");
    }
}
