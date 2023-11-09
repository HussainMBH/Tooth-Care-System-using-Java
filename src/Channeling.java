import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Channeling {

    static List<Integer> bookedchannelinglist = new ArrayList<>();//list of booked patient list

    static Map<Integer, Patient>patients = new HashMap<>();
    public void printchannelingdays(){
        System.out.println("Monday Time: ");
        System.out.println("Wednesday Time: ");
        System.out.println("Saturday Time: ");
        System.out.println("Sunday Time: ");
        System.out.println("Thank You");
    }

    public void availabletreatments(){
        System.out.println("1. Cleanings");
        System.out.println("2. Whitening");
        System.out.println("3. Filling");
        System.out.println("4. Nerve Filling");
        System.out.println("5. Root Canal Therapy");
        System.out.println("Be Healthy Forever");
        System.out.println();
    }

    public void bookChanneling(Patient p, String acceptFee){
        boolean feeAccepted = false;

        // Check if the patient accepts the appointment fee
        System.out.println("Appointment fee is 1000/-. Do you accept the fee? (yes/no)");



        if (acceptFee.equals("yes")) {
            feeAccepted = true;
        } else {
            System.out.println("Sorry, you can't book the appointment.");
        }

        if (feeAccepted) {
            patients.put(p.getPatientID(), p);
            bookedchannelinglist.add(p.getPatientID());
            System.out.println("Appointment Confirmed Successfully");
        }

    }

    public void printpatients(){
        if(patients.isEmpty()){
            System.out.println("No details of Patients");
            return;
        }
        for (Patient p : patients.values()){
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Patient Name: "+ p.name);
            System.out.println("Patient Address: " + p.address);
            System.out.println("Phone Number: " + p.phonenumber);
            System.out.println("Channel Day: "+p.channelday);
            System.out.println("Treatment Type: " + p.treatmenttype);
            System.out.println("Thank You");
        }
    }

    public void printPatientDetails(int patientID) {
        Patient patient = patients.get(patientID);
        if (patient != null) {
            System.out.println("Patient ID: " + patient.getPatientID());
            System.out.println("Patient Name: " + patient.getName());
            System.out.println("Patient Address: " + patient.getAddress());
            System.out.println("Phone Number: " + patient.getPhoneNumber());
            System.out.println("Channeling Day: " + patient.getChannelingDay());
            System.out.println("Treatment Type: " + patient.getTreatmentType());
        } else {
            System.out.println("Patient with ID " + patientID + " not found.");
        }
    }

    public void viewAppointmentsByDay(String day) {
        boolean foundAppointments = false;

        System.out.println("Appointments on " + day + ":");

        for (Patient patient : patients.values()) {
            if (day.equals(patient.getChannelingDay())) {
                foundAppointments = true;
                System.out.println("Patient ID: " + patient.getPatientID());
                System.out.println("Patient Name: " + patient.getName());
                System.out.println("Patient Address: " + patient.getAddress());
                System.out.println("Phone Number: " + patient.getPhoneNumber());
                System.out.println("Channeling Day: " + patient.getChannelingDay());
                System.out.println("Treatment Type: " + patient.getTreatmentType());
                System.out.println();
            }
        }

        if (!foundAppointments) {
            System.out.println("No appointments on " + day);
        }
    }

}
