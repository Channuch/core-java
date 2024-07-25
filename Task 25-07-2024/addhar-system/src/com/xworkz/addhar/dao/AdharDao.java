package com.xworkz.addhar.dao;

import com.xworkz.addhar.dto.AdharDto;

public class AdharDao {

    AdharDto dto;

    public boolean creatNewAdhar(AdharDto dto){
        System.out.println("Creat acount started");
        boolean isDtoCreated = false;
        if (null != dto) {
            this.dto = dto;
            isDtoCreated = true;
        }else System.out.println("Please provid valid details");
        System.out.println("Creat acount ended");
        return isDtoCreated;

    }

    public void getDetails(){
        System.out.println("FULL NAME = "+ dto.name);
        System.out.println("LAST NAME = "+ dto.lastName);
        System.out.println("DATE OF BIRTH = "+ dto.dob);
        System.out.println("ENTER PHONE NUMBER = "+ dto.phoneNo);
        System.out.println("ENTER PERMANENT ADDRESS = "+ dto.addresss);
        System.out.println("AADHAR created Successfully");
    }

}
