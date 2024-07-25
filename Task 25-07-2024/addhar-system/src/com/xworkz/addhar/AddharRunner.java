package com.xworkz.addhar;

import com.xworkz.addhar.dao.AdharDao;
import com.xworkz.addhar.dto.AdharDto;

public class AddharRunner {
    public static void main(String[] args) {
        System.out.println("Main method started");

        AdharDto dto = new AdharDto();
        dto.name = "Channveer";
        dto.lastName = "Madevnavr";
        dto.dob = "06/08/2024";
        dto.phoneNo = 9876734568L;
        dto.addresss ="Bhavani Nagar";

        AdharDao dao = new AdharDao();
          boolean creat = dao.creatNewAdhar(dto);
        System.out.println("IS Adhar Created = "+ creat);

        dao.getDetails();



        System.out.println("Main method Ended");
    }
}
