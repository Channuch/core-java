package com.xworkz.facebookapp.dao;

import com.xworkz.facebookapp.dto.FaceBookDto;

public class FaceBookDao {

    FaceBookDto dto;

    public boolean createAccount(FaceBookDto dto){
        System.out.println("Create Account Started");
         boolean isAccountCreated = false;
           if(null != dto){
               this.dto = dto;
               isAccountCreated = true;
           }else {
               System.out.println("Please Provide Valid Details");
           }
        System.out.println("Create Account Ended");
    return isAccountCreated;
    }

    public void getinfo(){
        System.out.println("FULL NAME = "+ dto.name);
        System.out.println("LAST NAME = "+ dto.lastName);
        System.out.println("DATE OF BIRTH = "+ dto.dob);
        System.out.println("ENTER PHONE NUMBER = "+ dto.phoneNo);
        System.out.println("ENTER = "+ dto.mail);
        System.out.println("CREATE PASSWORD = "+ dto.ctrPassword);
        System.out.println("CONFORM PASSWORD = "+ dto.confPassword);
        System.out.println("Account created Successfully");
    }
}
