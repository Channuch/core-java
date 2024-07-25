package com.xworkz.drivinglicence.deo;

import com.xworkz.drivinglicence.dto.DrivingLicenceDto;

public class DrivingLicenceDao {

    DrivingLicenceDto dto;

    public boolean createLicence(DrivingLicenceDto dto){
        System.out.println("Create Licence Started");
         boolean isLicenceCreated = false;
          if (null != dto){
              this.dto=dto;
              isLicenceCreated = true;
          }else {
              System.out.println("Please Provide Valid Details");
          }
        System.out.println("Create Licence Ended");
     return isLicenceCreated ;
    }

    public void getDetails(){
        System.out.println("FULL NAME = "+ dto.name);
        System.out.println("LAST NAME = "+ dto.lastName);
        System.out.println("DATE OF BIRTH = "+ dto.dob);
        System.out.println("ENTER PHONE NUMBER = "+ dto.phoneNo);
        System.out.println("ARE THE DOCUMENT SUBMITTED = "+dto.isDocumentSubmitted);
        System.out.println("Driving Licence Form Filled , Wait For Trial");
    }
}
