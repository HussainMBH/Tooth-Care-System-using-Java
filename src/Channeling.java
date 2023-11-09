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

    public void bookChanneling(Patient p){
        patients.put(p.patientID,p);
        bookedchannelinglist.add(p.patientID);
        System.out.println("Appointment Confirmed Successfully");

    }
}
