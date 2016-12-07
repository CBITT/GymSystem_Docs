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

        InstructorSpec specsOfInstructorToBook = new InstructorSpec(Sport.AEROBICS,DayOfClass.WEDNESDAY);

        b.bookInstructor(specsOfInstructorToBook);

    }
}
