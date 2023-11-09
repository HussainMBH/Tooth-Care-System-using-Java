import java.util.*;

public class Main
{
    //function for channel booking
    public static void channelbooking(Patient p){
        Channeling channeler = new Channeling();
        channeler.bookChanneling(p);
    }

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    boolean loop = true;
    Channeling channel = new Channeling();
    //loop to get choices from user until he stops
    while (loop){
        System.out.println("1. Channeling Days \n2. Treatment Types \n3. Channel Booking");
        int choice = scn.nextInt();
        switch (choice){
            //Channeling Days
            case 1:
            {

                channel.printchannelingdays();
            }
            break;
            //Treatment Types
            case 2:
            {
                channel.availabletreatments();
            }
            break;
            case 3:
            {
                System.out.println("Enter your name, address, phone number and Channeling day and Treatment Type");
                String name = scn.next();
                String address = scn.next();
                int phonenumber = scn.nextInt();
                //get channel day
                String channelday = scn.next();
                //get treatment type
                String treatmenttype = scn.next();
                //create patient object
                Patient p = new Patient(name,address,phonenumber,channelday,treatmenttype);
                //channeling
                channelbooking(p);
            }
        }
    }
}
}