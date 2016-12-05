import java.util.*;


/**
 * Created by BangoCs on 11/26/2016.
 */
public class BookingDriver {

    public static void main (String args []){

        Booking b = new Booking();
        b.addInstructor("John",35.00,Sport.TRX,DayOfClass.TUESDAY);
        b.addInstructor("Mary",30.50,Sport.SPINNING,DayOfClass.MONDAY);
        b.addInstructor("Neil",10.00,Sport.AEROBICS,DayOfClass.WEDNESDAY);
        b.addInstructor("Peter",35.00,Sport.WEIGHTS,DayOfClass.THURSDAY);
        b.addInstructor("Colin",55.00,Sport.SWIMMING,DayOfClass.FRIDAY);

//adding same specs for testing
        b.addInstructor("Clare",10.50,Sport.SPINNING,DayOfClass.MONDAY);



        InstructorSpec specsOfInstructorToBook = new InstructorSpec(Sport.SPINNING,DayOfClass.MONDAY);

        List instructorToBook =  b.bookInstructor(specsOfInstructorToBook);


        System.out.print("ide"+ instructorToBook.size());

        if (!instructorToBook.isEmpty()){
            System.out.print("Available instructors: \n\n");

            for (Iterator i = instructorToBook.iterator(); i.hasNext(); ) {
                Instructor instructor = (Instructor) i.next();

                InstructorSpec spec = instructor.getSpecs();
                System.out.println("Name: " +
                        instructor.getName()+ "\nPrice per session: €"+instructor.getPricePerClass()
                        + "\nSport: "+spec.getSport()+ "\nDay of training: "+ spec.getDayOfClass());
            }
        } else {
            System.out.println("Sorry, no Instructors available");
        }





    }
}
