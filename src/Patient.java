public class Patient {
    static int id = 1; //static variable to give id for every new patient
    String name;
    String address;

    int phonenumber;
    String treatmentPreference;
    int patientID; //id of patient created automatically
    String alloted;
    int number;
    public Patient(String name, String address, int phonenumber, String treatmentPreference, String treatmenttype){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.treatmentPreference = treatmentPreference;
        this.patientID = id++;
        alloted = "";
        number = -1;

    }
}
