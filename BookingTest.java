import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by BangoCs on 12/8/2016.
 */
public class BookingTest {

    Booking booking;
    List listOfInstructors;

    public BookingTest() {


        booking.addInstructor("John",35.00,Sport.TRX,DayOfClass.TUESDAY);
        booking.addInstructor("Mary",30.50,Sport.SPINNING,DayOfClass.MONDAY);
        booking.addInstructor("Neil",10.00,Sport.AEROBICS,DayOfClass.WEDNESDAY);
        booking.addInstructor("Peter",35.00,Sport.WEIGHTS,DayOfClass.THURSDAY);
        booking.addInstructor("Colin",55.00,Sport.SWIMMING,DayOfClass.FRIDAY);
    }
    @Test
    public void testAdding(){

        booking.addInstructor("Bob",10.50,Sport.SPINNING,DayOfClass.FRIDAY);
        InstructorSpec instructorToBook = new InstructorSpec(Sport.SPINNING,DayOfClass.FRIDAY);
        listOfInstructors = booking.bookInstructor(instructorToBook);
        Assert.assertTrue(listOfInstructors.size() == 1);
    }

    @Test
    public void testWithOneSpec()  {

        InstructorSpec onlyWantOneThingToMatch = new InstructorSpec(null, DayOfClass.FRIDAY);
        listOfInstructors = booking.bookInstructor(onlyWantOneThingToMatch);
        Assert.assertNotNull(listOfInstructors);
    }

    @org.junit.Test
    public void checkBookInstructorWithWrongSpecs()  {

        InstructorSpec noSuchInstructor = new InstructorSpec(Sport.FITBALL,DayOfClass.SATURDAY);
        Assert.assertTrue(booking.bookInstructor(noSuchInstructor).size() == 0);
    }

}