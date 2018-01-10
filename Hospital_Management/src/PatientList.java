import java.util.ArrayList;

public class PatientList {

	private static ArrayList<Patient> patients = new ArrayList<Patient>(); 
	
	//public static void addPatient(Patient aPatient) {
		//patients.add(aPatient);
	//}
	public static ArrayList<Patient> getPatients() {
		return Connector.getpatients();
	}
}