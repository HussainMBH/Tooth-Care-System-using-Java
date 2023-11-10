public class Patient {
    static int id = 1; //static variable to give id for every new patient
    String name;
    String address;

    int phonenumber;
    String channelday;
    String treatmentOption;
    int patientID; //id of patient created automatically
    String alloted;
    int number;
    public Patient(String name, String address, int phonenumber, String channelday, String treatmenttype){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.channelday = channelday;
        this.treatmentOption = treatmenttype;
        this.patientID = id++;
        alloted = "";
        number = -1;

    }
    // Getter methods for attributes
    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phonenumber;
    }

    public String getChannelingDay() {
        return channelday;
    }

    public String getTreatmentType() {
        return treatmentOption;
    }
}
