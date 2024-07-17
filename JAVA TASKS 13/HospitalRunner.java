class HospitalRunner{

	public static void main (String[] patientDetails){

		boolean isPatientRegistedSuccess = Hospital.registarPatient("Shivakumar",'M',20,9876798678L,"O -ve","Aland checkPost kalaburgi");

		if(isPatientRegistedSuccess == true){
			Hospital.patientInfo();
		}
		else{
			System.out.println("Given Details Not Found");
		}
	}	



}