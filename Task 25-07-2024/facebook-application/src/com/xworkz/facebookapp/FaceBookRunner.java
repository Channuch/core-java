package com.xworkz.facebookapp;

import com.xworkz.facebookapp.dao.FaceBookDao;
import com.xworkz.facebookapp.dto.FaceBookDto;

public class FaceBookRunner {
    public static void main(String[] args) {

        FaceBookDto dto = new FaceBookDto();
        dto.name="Channu";
        dto.lastName = "CH";
        dto.dob="12/02/2024";
        dto.phoneNo=9364823454L;
        dto.mail="channu@gmail.com";
        dto.name="Channu@123";
        dto.confPassword="Channu@123";

        FaceBookDao deo = new FaceBookDao();
         boolean get = deo.createAccount(dto);
        System.out.println("Is Account Created ="+get);
          deo.getinfo();
    }
}
