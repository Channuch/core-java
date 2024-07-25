package com.xworkz.drivinglicence;

import com.xworkz.drivinglicence.deo.DrivingLicenceDao;
import com.xworkz.drivinglicence.dto.DrivingLicenceDto;

public class DrivingLicenceRunner {
    public static void main(String[] args) {
        System.out.println("Main Method started");

        DrivingLicenceDto dto = new DrivingLicenceDto();
         dto.name="ShivaKumar";
         dto.lastName="Tarapur";
         dto.dob="18/02/2024";
         dto.phoneNo= 9876787656L;
         dto.isDocumentSubmitted = true;

        DrivingLicenceDao deo = new DrivingLicenceDao();
          boolean get = deo.createLicence(dto);
        System.out.println("Is licence Created ="+get);
         deo.getDetails();
        System.out.println("Main Method Ended");
    }
}
