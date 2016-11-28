import java.awt.*;

import java.util.*;
import java.util.List;


/**
 * Created by BangoCs on 11/26/2016.
 */
public class BookingDriver {

    public static void main (String args []){

        Booking b = new Booking();
        b.addInspector("John",35.00,Sport.TRX,DayOfClass.TUESDAY);
        b.addInspector("Mary",30.50,Sport.SPINNING,DayOfClass.MONDAY);
        b.addInspector("Neil",10.00,Sport.AEROBICS,DayOfClass.WEDNESDAY);
        b.addInspector("Peter",35.00,Sport.WEIGHTS,DayOfClass.THURSDAY);
        b.addInspector("Colin",55.00,Sport.SWIMMING,DayOfClass.FRIDAY);


       List<Instructor> instructors = new ArrayList<>();


        Instructor instructorToBook = b.bookInstrunctor(Sport.SPINNING,DayOfClass.MONDAY);

        instructors.add(instructorToBook);

        if (!instructors.isEmpty()){
            System.out.print("Available instructors: \n\n");

            for (Iterator i = instructors.iterator(); i.hasNext(); ) {
                Instructor instructor = (Instructor) i.next();

                InstructorSpec spec = instructor.getSpecs();
                System.out.println(" Name:" +
                        instructor.getName()+ "\nPrice per session: "+instructor.getPricePerClass()
                        + "\nSport: "+spec.getSport()+ "\nDay of training: "+ spec.getDayOfClass());
            }
        } else {
            System.out.println("Sorry, no Instructors available");
        }





    }
}
