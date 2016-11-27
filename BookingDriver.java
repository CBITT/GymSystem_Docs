import java.awt.*;

import java.util.*;
import java.util.List;


/**
 * Created by BangoCs on 11/26/2016.
 */
public class BookingDriver {

    public static void main (String args []){

        Booking b = new Booking();
        b.addInspector("John",35.00,"TRX","Tuesday");
        b.addInspector("Mary",30.50,"Spinning","Monday");
        b.addInspector("Neil",10.00,"Aerobics","Wednesday");
        b.addInspector("Peter",35.00,"Cross Fit","Thursday");
        b.addInspector("Colin",55.00,"Weights Training","Friday");


       List<Instructor> instructors = new ArrayList<>();


        Instructor instructorToBook = b.bookInstrunctor("Spinning","Monday");

        instructors.add(instructorToBook);

        if (!instructors.isEmpty()){
            System.out.print("Available instructors: \n\n");

            for (Iterator i = instructors.iterator(); i.hasNext(); ) {
                Instructor instructor = (Instructor) i.next();

                System.out.println(" Name:" +
                        instructor.getName()+ "\nPrice per session: "+instructor.getPricePerClass()
                        + "\nSport: "+instructor.getSport() + "\nDay of training: "+instructor.getDayOfTraining());
            }
        } else {
            System.out.println("Sorry, no Instructors available");
        }





    }
}
