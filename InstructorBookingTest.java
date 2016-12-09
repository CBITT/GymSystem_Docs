import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by BangoCs on 12/8/2016.
 */
public class InstructorBookingTest {

    InstructorBooking instructorBooking;
    List listOfInstructors;

    public InstructorBookingTest() {


        instructorBooking.addInstructor("John",35.00,Sport.TRX,DayOfClass.TUESDAY);
        instructorBooking.addInstructor("Mary",30.50,Sport.SPINNING,DayOfClass.MONDAY);
        instructorBooking.addInstructor("Neil",10.00,Sport.AEROBICS,DayOfClass.WEDNESDAY);
        instructorBooking.addInstructor("Peter",35.00,Sport.WEIGHTS,DayOfClass.THURSDAY);
        instructorBooking.addInstructor("Colin",55.00,Sport.SWIMMING,DayOfClass.FRIDAY);
    }
    @Test
    public void testAdding(){

        instructorBooking.addInstructor("Bob",10.50,Sport.SPINNING,DayOfClass.FRIDAY);
        InstructorSpec instructorToBook = new InstructorSpec(Sport.SPINNING,DayOfClass.FRIDAY);
        listOfInstructors = instructorBooking.bookInstructor(instructorToBook);
        Assert.assertTrue(listOfInstructors.size() == 1);
    }

    @Test
    public void testWithOneSpec()  {

        InstructorSpec onlyWantOneThingToMatch = new InstructorSpec(null, DayOfClass.FRIDAY);
        listOfInstructors = instructorBooking.bookInstructor(onlyWantOneThingToMatch);
        Assert.assertNotNull(listOfInstructors);
    }

    @org.junit.Test
    public void checkBookInstructorWithWrongSpecs()  {

        InstructorSpec noSuchInstructor = new InstructorSpec(Sport.FITBALL,DayOfClass.SATURDAY);
        Assert.assertTrue(instructorBooking.bookInstructor(noSuchInstructor).size() == 0);
    }

}