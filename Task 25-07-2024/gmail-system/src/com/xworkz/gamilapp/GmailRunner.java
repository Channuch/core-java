package com.xworkz.gamilapp;

import com.xworkz.gamilapp.dao.GmailDao;
import com.xworkz.gamilapp.dto.GmailDto;

public class GmailRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");
        GmailDto dto = new GmailDto();
        dto.name="Channveer";
        dto.lastName = "Harkude";
        dto.gender = 'M';
        dto.dob="12/02/2001";
        dto.phoneNo = 9632084956L;
        dto.ctrPassword = "18SL#18";
        dto.confPassword = "18SL#18";

        GmailDao dao = new GmailDao();
         boolean create = dao.createNewAccount(dto);
        System.out.println("IS Gmail Created = "+create);

        dao.getInfo();



        System.out.println("Main Ended");
    }
}
